/**
 * Created by Zsuzska on 2016. 11. 15..
 */
public class Dog extends Animal {
    boolean hasTail = true;

    public void speak() {
        System.out.println("barks");
    }
    public void beg(){
        System.out.println("begs");
    }
    public Dog(){
        super(15, true, true);
    }


}
