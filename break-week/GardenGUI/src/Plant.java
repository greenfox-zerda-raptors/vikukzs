/**
 * Created by Zsuzska on 2016. 11. 30..
 */
public abstract class Plant {
    String color;
    int currentWaterAmount;

    public Plant(String color, int currentWaterAmount) {
        this.color = color;
        this.currentWaterAmount = currentWaterAmount;
    }

    public abstract boolean isThirsty();

    public abstract void water(int waterPerPlant);

    @Override
    public String toString() {
        return "The " + color + " " + getClass().getSimpleName() + (isThirsty() ? " needs water" : " doesn't need water");
    }
}
