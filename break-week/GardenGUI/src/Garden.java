import java.util.ArrayList;

public class Garden extends ArrayList<Plant> {

    public String water(int amount) {
        int numberOfThirsty = 0;
        for (Plant p : this) {
            if (p.isThirsty()) {
                numberOfThirsty++;
            }
        }
        int waterPerPlant = (int)((float)amount/numberOfThirsty);
        for (Plant p : this) {
            if (p.isThirsty()) {
                p.water(waterPerPlant);
            }
        }
        return "Watering with " + amount;
    }

    @Override
    public String toString() {
        String result = "";
        for (Plant p : this) {
            result += p.toString() + "\n";
        }
        return result;
    }
}
