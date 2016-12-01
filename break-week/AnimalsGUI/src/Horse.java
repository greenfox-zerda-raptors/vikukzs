/**
 * Created by Zsuzsi on 2016. 12. 01..
 */
public class Horse extends AbstractAnimal {

    public Horse(String name) {
        super(name);
    }

    @Override
    protected int defaultFoodAmount() {
        return 20;
    }
}
