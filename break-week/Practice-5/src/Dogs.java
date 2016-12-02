import java.util.ArrayList;

/**
 * Created by Zsuzsi on 2016. 12. 02..
 */
public class Dogs extends ArrayList<EveryDog> {

    String dogType;
    String bark;
    String eatAmount;

    final String formatForDog = "%s is a dog, that has a %s bark, eats %s, makes a %s mess, and its shit is %s.\n";
    private int foodPerDog;


    public void ownADog() {

    }

    public String feed(int amount) {
        int numberOfHungry = 0;
        for (Dogs d : this) {
            if (d.isHungry()) {
                numberOfHungry++;
            }
        }
        int foodPerDog = (int)((float)amount / numberOfHungry);
        for (Dogs d : this) {
            if (d.isHungry()){
                d.feed(foodPerDog);
            }
        }
        return "Feeding with " + amount;
    }

    @Override
    public String toString() {
        String result = "";
        for (EveryDog d : this) {
            result += d.toString() + "\n";
        }
        return result;
    }

    public boolean isHungry() {
        return isHungry();
    }
}
