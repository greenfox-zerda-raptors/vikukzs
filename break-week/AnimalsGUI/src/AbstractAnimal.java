/**
 * Created by Zsuzsi on 2016. 12. 01..
 */
public abstract class AbstractAnimal implements Animals {
    protected int moveDistance = 0;
    protected int feedCounter = 0;
    private String name;
    private int childrenNum = 0;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getChildrenNum() {
        return childrenNum;
    }

    public void setChildrenNum(int childrenNum) {
        if (childrenNum < 0) {
            throw new  IllegalArgumentException("Children number must be positive");
        }
        this.childrenNum = childrenNum;
    }

    public int getFeedCounter() {
        return feedCounter;
    }

    @Override
    public void move(int distance) {
        this.moveDistance += distance;
    }

    @Override
    public void feed() {
        this.feedCounter += defaultFoodAmount();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "moveDistance=" + moveDistance +
                ", feedCounter=" + feedCounter +
                ", name='" + name + '\'' +
                ", childrenNum=" + childrenNum +
                '}';
    }

    protected abstract int defaultFoodAmount();

}
