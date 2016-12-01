/**
 * Created by Zsuzsi on 2016. 12. 01..
 */
public class Mouse extends AbstractAnimal {

    public Mouse(String name) {
        super(name);
    }

    @Override
    protected int defaultFoodAmount() {
        return 2;
    }
}
