/**
 * Created by Zsuzsi on 2016. 12. 02..
 */
public class YorkshireTerrier extends EveryDog {

    @Override
    public boolean isHungry() {
        return currentFoodAmount < 5;
    }

    @Override
    public String feed(int foodPerDog) {
        currentFoodAmount += (int)((float)foodPerDog * 0.9);
        return null;
    }

    public YorkshireTerrier(String name) {
        super(name, 0);
    }

    public YorkshireTerrier() {
        super("Yorkshire Terrier", "high pitched, annoying", "very little food", "tiny", "medium");
    }


}
