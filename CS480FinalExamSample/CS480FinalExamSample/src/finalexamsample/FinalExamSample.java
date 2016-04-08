package finalexamsample;

import java.util.*;
import java.io.*;

class GradeBook {

    private HashMap<String, HashMap<String, ArrayList<Integer>>> courses;
    private String filename;

    public GradeBook(String filename) {
        this.filename = filename;
        courses = new HashMap<>();
    }

    public void readFile() {
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line;
            String[] fields;

            line = in.readLine();
            while (line != null) {
                fields = line.split(",");//we converted string into series of values and stored in fields array

                if (courses.containsKey(fields[0]) == false) {//we are checking whether the key is avaialble or not
                    courses.put(fields[0], new HashMap<String, ArrayList<Integer>>());
                }

                courses.get(fields[0]).put(fields[1], new ArrayList<Integer>());
                for (int i = 2; i < fields.length; i++) {
                    courses.get(fields[0]).get(fields[1]).add(Integer.parseInt(fields[i]));
                }
                line = in.readLine();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println("Could not open the file for reading...");
        }
    }

    public void displayAll() {
        for (Map.Entry<String, HashMap<String, ArrayList<Integer>>> x : courses.entrySet())
                  {
            String courseName = x.getKey();
            HashMap<String, ArrayList<Integer>> students = x.getValue();
            System.out.println("Course: " + courseName);

            for (Map.Entry<String, ArrayList<Integer>> y : students.entrySet()) {
                String studentName = y.getKey();
                ArrayList<Integer> scores = y.getValue();
                System.out.print("\tStudent: " + studentName);
                for (int score : scores) {
                    System.out.print(", " + score);
                }
                System.out.println();
            }
        }
    }

    // Find the hashmap of the best student who has the highest average in that course. 
    
    public HashMap<String, String> getBestStudentInCourse() {
        String bestStudent = "";
        double maxAverage = 0.0;
        HashMap<String, String> bestStudents = new HashMap<>();

        for (Map.Entry<String, HashMap<String, ArrayList<Integer>>> x : courses.entrySet()) {
            String courseName = x.getKey();//CS204
            HashMap<String, ArrayList<Integer>> students = x.getValue();

            bestStudent = "";
            maxAverage = 0.0;
            for (Map.Entry<String, ArrayList<Integer>> y : students.entrySet()) {
                String studentName = y.getKey();//peter
                ArrayList<Integer> scores = y.getValue();
                int total = 0;
                for (int score : scores) {
                    total += score;
                }
                double average = (double) total / scores.size();
                if (average > maxAverage) {
                    bestStudent = studentName;
                    maxAverage = average;
                }
            }

            bestStudents.put(courseName, bestStudent);
        }

        return bestStudents;
    }

    // Create a hashmap of students' courses that uses the students' names as keys.
    public HashMap<String, HashMap<String, ArrayList<Integer>>> getStudentCourses() {
        HashMap<String, HashMap<String, ArrayList<Integer>>> studentCourses = new HashMap<>();

        for (Map.Entry<String, HashMap<String, ArrayList<Integer>>> x : courses.entrySet()) {
            String courseName = x.getKey();//cs204
            HashMap<String, ArrayList<Integer>> students = x.getValue();

            for (Map.Entry<String, ArrayList<Integer>> y : students.entrySet()) {
                String studentName = y.getKey();//peter
                ArrayList<Integer> scores = y.getValue();//1001 10 10

                if (studentCourses.containsKey(studentName) == false) {
                    studentCourses.put(studentName, new HashMap<String, ArrayList<Integer>>());
                }

                if (studentCourses.get(studentName).containsKey(courseName) == false) {
                    studentCourses.get(studentName).put(courseName, new ArrayList<Integer>());
                }

                for (int score : scores) {
                    studentCourses.get(studentName).get(courseName).add(score);
                }
            }
        }

        return studentCourses;
    }

    // Display the hash map that uses student names as keys 
    public void displayStudentMap(HashMap<String, HashMap<String, ArrayList<Integer>>> studentCourses) {
        for (Map.Entry<String, HashMap<String, ArrayList<Integer>>> x : studentCourses.entrySet()) {
            String studentName = x.getKey();
            HashMap<String, ArrayList<Integer>> courseList = x.getValue();
            System.out.println("Student: " + studentName);

            for (Map.Entry<String, ArrayList<Integer>> y : courseList.entrySet()) {
                String courseName = y.getKey();
                ArrayList<Integer> scores = y.getValue();
                System.out.print("\tCourse: " + courseName);
                for (int score : scores) {
                    System.out.print(", " + score);
                }
                System.out.println();
            }
        }
    }

    // Save the hash map of students that  uses student names as keys to a text file
    public void saveFile(String filename, HashMap<String, HashMap<String, ArrayList<Integer>>> studentCourses) {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            for (Map.Entry<String, HashMap<String, ArrayList<Integer>>> x : studentCourses.entrySet()) {
                String studentName = x.getKey();//peter
                HashMap<String, ArrayList<Integer>> courseList = x.getValue();

                for (Map.Entry<String, ArrayList<Integer>> y : courseList.entrySet()) {
                    String courseName = y.getKey(); //CS204
                    ArrayList<Integer> scores = y.getValue();
                    out.print(studentName + "," + courseName);
                    for (int score : scores) {
                        out.print("," + score);
                    }
                    out.println();
                }
            }
            out.close();
        } catch (IOException ex) {
            System.out.println("Could not open the file for reading...");
        }
    }
}

class MyThread extends Thread {
    GradeBook grader;
    HashMap<String, HashMap<String, ArrayList<Integer>>> studentCourses;
    String filename;
    
    public MyThread(GradeBook grader, String filename, HashMap<String, HashMap<String, ArrayList<Integer>>> studentCourses) {
        this.grader = grader;
        this.studentCourses  = studentCourses;
        this.filename = filename;
    }
    
    @Override
    public void run() {
        grader.saveFile(filename, studentCourses);
    }
}

public class FinalExamSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GradeBook grader = new GradeBook("courses.csv");
        grader.readFile();
        grader.displayAll();

        System.out.println();
        // Find the best students in each course
        HashMap<String, String> bestStudents = grader.getBestStudentInCourse();
        for (Map.Entry<String, String> x : bestStudents.entrySet()) {
            System.out.println(x.getKey() + " : " + x.getValue());
        }

        System.out.println();
        // Get a hashmap of student courses
        HashMap<String, HashMap<String, ArrayList<Integer>>> studentCourses = grader.getStudentCourses();
        grader.displayStudentMap(studentCourses);
        
        // Save the hashmap of student scores to a file
        // Create a worker thread to execute the saveFile() method
        Thread t = new MyThread(grader, "students.csv", studentCourses);
        t.start();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
        }
    }
}
