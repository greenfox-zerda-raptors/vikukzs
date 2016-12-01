/**
 * Created by Zsuzsi on 2016. 12. 01..
 */
public class Ant implements Animal {
    protected int moveDistance = 0;
    protected int feedCounter = 0;

    @Override
    public void move(int distance) {
        this.moveDistance += distance / 2;
    }

    @Override
    public void feed() {
        this.feedCounter += 1;
    }

    @Override
    public String toString() {
        return "Ant{" +
                "moveDistance=" + moveDistance +
                ", feedCounter=" + feedCounter +
                '}';
    }
}
