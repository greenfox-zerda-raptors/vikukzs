import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Zsuzsi on 2016. 12. 01..
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Horse("Paci"));
        animals.add(new Horse("Saci"));
        animals.add(new Horse("Paca"));
        animals.add(new Mouse("Cic"));
        animals.add(new Mouse("Rudy"));
        animals.add(new Mouse("Jerry"));
        animals.add(new Ant());

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println("Iterator: " + animal);
        }

        iterator = animals.iterator();
        for (int i = 0; i < 3; i++) {
            Animal animal = iterator.next();
            System.out.println("Iterator: " + animal);
        }
        System.out.println("Doing stg else");
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println("Iterator: " + animal);
        }

    }
}
