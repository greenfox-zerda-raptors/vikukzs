/**
 * Created by Zsuzska on 2016. 11. 30..
 */
public class Tree extends Plant {
    public Tree(String color) {
        super(color, 0);
    }

    @Override
    public boolean isThirsty() {
        return currentWaterAmount < 40;
    }

    @Override
    public boolean isDead() {
        return currentWaterAmount > 40*2;
    }

    @Override
    public void water(int waterPerPlant) {
        currentWaterAmount += (int)((float)waterPerPlant * 0.4);
    }
}
