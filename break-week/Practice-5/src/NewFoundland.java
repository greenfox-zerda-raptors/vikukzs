/**
 * Created by Zsuzsi on 2016. 12. 02..
 */
public class NewFoundland extends EveryDog{
    public NewFoundland(String name) {
        super(name, 0);
    }

    @Override
    public boolean isHungry() {
        return currentFoodAmount < 9;
    }

    @Override
    public String feed(int foodPerDog) {
        currentFoodAmount += (int)((float)foodPerDog * 0.7);
        return null;
    }

    public NewFoundland() {
        super("New Foundland", "low pitched, beautiful", "three trucks of food daily", "enormous", "no");
    }

}
