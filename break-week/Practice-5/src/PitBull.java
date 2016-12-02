/**
 * Created by Zsuzsi on 2016. 12. 02..
 */
public class PitBull extends EveryDog {
    public PitBull(String name) {
        super(name, 0);
    }

    @Override
    public boolean isHungry() {
        return currentFoodAmount < 7;
    }

    @Override
    public String feed(int foodPerDog) {
        currentFoodAmount += (int)((float)foodPerDog * 0.7);
        return null;
    }

    public PitBull() {
        super("Pitbull", "barf-like woof", "a shit-load of food", "medium-sized", "a huge");
    }

}
