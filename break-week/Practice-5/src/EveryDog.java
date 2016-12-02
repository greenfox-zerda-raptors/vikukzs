/**
 * Created by Zsuzsi on 2016. 12. 02..
 */
public abstract class EveryDog extends Dogs {
    private String shitSize;
    private String messMaker;
    String name;
    int currentFoodAmount;

    public EveryDog(String name, int currentFoodAmount) {
        this.name = name;
        this.currentFoodAmount = currentFoodAmount;
    }

    public abstract boolean isHungry();

    public abstract String feed(int foodPerDog);



    public EveryDog(String dogType, String bark, String eatAmount, String shitSize, String messMaker) {
        this.dogType = dogType;
        this.bark = bark;
        this.eatAmount = eatAmount;
        this.shitSize = shitSize;
        this.messMaker = messMaker;
    }

    public EveryDog(){}

    @Override
    public void ownADog() {
        System.out.printf(formatForDog,
                dogType,
                bark,
                eatAmount,
                messMaker,
                shitSize);
    }

    @Override
    public String toString() {
        return name + ", the " + getClass().getSimpleName() + (isHungry() ? " needs to be fed." : " is not hungry.");
    }
}
