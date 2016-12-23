/**
 * Created by Zsuzska on 2016. 11. 30..
 */
public class App {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.add(new Flower("yellow"));
        garden.add(new Flower("blue"));
        garden.add(new Tree("purple"))
        garden.add(new Tree("orange"));

        System.out.println(garden);
        System.out.println(garden.water(40));
        System.out.println(garden);
        System.out.println(garden.water(70));
        System.out.println(garden);
    }
}
