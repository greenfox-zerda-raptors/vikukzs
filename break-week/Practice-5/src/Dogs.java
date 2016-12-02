import java.util.ArrayList;

/**
 * Created by Zsuzsi on 2016. 12. 02..
 */
public abstract class Dogs extends ArrayList<EveryDog> {

    String dogType;
    String bark;
    String eatAmount;

    final String formatForDog = "%s is a dog, that has a %s bark, eats %s, makes a %s mess, and its shit is %s.\n";

    public Dogs() {

    }

    public abstract void ownADog();
}
