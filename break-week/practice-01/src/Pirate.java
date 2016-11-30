/**
 * Created by Zsuzska on 2016. 11. 29..
 */
public class Pirate {
    private int drinkNumber;
    private boolean isAlive;
    private boolean isAsleep;

    public Pirate(){
        drinkNumber = 0;
        isAlive = true;
        isAsleep = false;
    }

    public String drinkSomeRum(){
        if (isAlive) {
            if (!isAsleep) {
                drinkNumber++;
            }
            if (drinkNumber > 4) {
                isAsleep = true;
                return "He is asleep.";
            }

        } else {
            return "He is dead";
        }
        return String.format("Drink number: %s", drinkNumber);

    }

    public String howsItGoingMate() {

        if (drinkNumber <= 4){
            return "Pour me anudder!";
        } else {
            isAsleep = true;
            return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
        }
    }

    public void die() {
        isAlive = false;
    }

    public boolean getIsAlive(){
        return isAlive;
    }




}
