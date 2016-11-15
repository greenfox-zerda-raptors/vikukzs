import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Zsuzska on 2016. 11. 14..
 */
public class Workshop01Array {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("white", "blue", "red", "silver", "black", "green", "banana"));
        ArrayList<String> makes = new ArrayList<>(Arrays.asList("toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"));
        ArrayList<Integer> engineSizes = new ArrayList<>(Arrays.asList(1100, 1400, 1600, 1800, 2500));

        ArrayList<Car> lsCars = new ArrayList<>(10);

        Random randColor = new Random();
        Random randMakes = new Random();
        Random randEngineSizes = new Random();

        for (int i = 1; i < 40; i++) {
            Car auto = new Car(makes.get(randMakes.nextInt(makes.size())),
                    colors.get(randColor.nextInt(colors.size())),
                    engineSizes.get(randEngineSizes.nextInt(engineSizes.size()))
            );
            lsCars.add(auto);
        }
        System.out.println(lsCars.get(0));
        System.out.println(lsCars.get(1));

        lsCars.get(0).drive(45);
        lsCars.get(1).drive(15);





    }

}
