/**
 * Created by Zsuzska on 2016. 11. 15..
 */
public class Animal {
    int lifeExpectancy;
    boolean isCarnivore;
    boolean hasTail;

    public Animal(int lifeExpectancy, boolean isCarnivore, boolean hasTail) {
        this.lifeExpectancy = lifeExpectancy;
        this.isCarnivore = isCarnivore;
        this.hasTail = hasTail;
        System.out.println("created an animal");
    }

    public Animal(){
        isCarnivore = false;
        lifeExpectancy = 10;
        System.out.println("created an animal");
    }

    public void eat(){
        System.out.println("Animal is eating.");
    }
    public void sleep(){
        System.out.println("Animal is sleeping.");
    }
    public void speak(){
        System.out.println("speaks");
    }

    public Animal (String a){
        this();
        System.out.println(a + " animal is created.");
    }

    public String toString() {
        return String.format("isCarnivore=%b, lifeExpectancy=%d, hasTail=%b",
                isCarnivore,
                lifeExpectancy,
                hasTail
        );
    }

}
