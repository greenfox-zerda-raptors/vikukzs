/**
 * Created by Zsuzska on 2016. 11. 15..
 */
public class Bird extends Animal {

    public Bird(){
        super(2, false, false); //constructor is called
    }
    public void fly(){
        System.out.println("The bird can fly.");
    }

    public void sleep(){
        System.out.println("Bird is sleeping");
        super.sleep(); //method is called
    }
    public void eat(){
        super.eat();
    }
    public void nightyNight() {
        super.eat();
        this.sleep();
    }
    public void speak(){
        System.out.println("chirp");
    }

}
