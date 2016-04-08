import java.util.ArrayList;
import java.util.List;
 
public class MyThreadYield {
    public static void main(String a[]){
        List<ExmpThread1> list = new ArrayList<ExmpThread1>();
        for(int i=0;i<3;i++){
            ExmpThread1 et = new ExmpThread1(i+5);
            list.add(et);
            et.start();
        }
        for(ExmpThread1 et:list){
            try {
                et.join();
            } catch (InterruptedException ex) { }
        }
    }
}
 
class ExmpThread1 extends Thread{
     
    private int stopCount;
    public ExmpThread1(int count){
        this.stopCount = count;
    }
    public void run(){
        for(int i=0;i<50;i++){
            if(i%stopCount == 0){
                System.out.println("Stoping thread: "+getName());
                yield();
            }
        }
    }
}