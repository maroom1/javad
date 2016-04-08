class Beverage {
    Beverage(int i) {
        System.out.println("Beverage constructor");
    }
}
class OrangeJuice extends Beverage {
    OrangeJuice(int i) {
        super(i);
        System.out.println("OrangeJuice constructor");
    }
}
class Beer extends Beverage {
    Beer(int i) {
        super(i);
        System.out.println("Beer constructor");       
    }
}
class Food {
    Food(int i) {
        System.out.println("Food constructor");       
    }
}
class Potatoes extends Food {
    Potatoes(int i) {
        super(i);
        System.out.println("Potato constructor");
    }
}
class Chicken extends Food {
    Chicken(int i) {
        super(i);
        System.out.println("Chicken constructor");
    }
}
class Dessert {
    Dessert(int i) {
        System.out.println("Dessert constructor");
    }
}
class Cake extends Dessert {
    Cake(int i) {
        super(i);
        System.out.println("Cake constructor");
    }
}
class Dinner {
    Dinner(int i) {
        System.out.println("Dinner constructor");
    }
}
public class Meal extends Dinner {
    private OrangeJuice oj;
    private Beer br;
    private Potatoes pt;
    private Chicken chk;
    private Cake ck;
    public Meal(int i) {
        super(i + 1);
        oj = new OrangeJuice(i + 1);
        br = new Beer(i + 2);
        pt = new Potatoes(i + 10);
        chk = new Chicken(i + 1);
        ck = new Cake(i + 1);
    }   
    public static void main(String[] args) {
        Meal ml = new Meal(1);
    }

}