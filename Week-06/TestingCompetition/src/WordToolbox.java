import java.util.Arrays;

/**
 * Created by Zsuzska on 2016. 11. 21..
 */
public class WordToolbox implements IWordToolbox {
    private String stringHeld;

    public String getStringHeld() {
        return stringHeld;
    }

    public void setStringHeld(String stringHeld) {
        this.stringHeld = stringHeld;
    }

    public WordToolbox(String stringHeld) {
        this.stringHeld = stringHeld;
    }

    public boolean isAnAnagram(String stringToCheck){
        return true;
    }

    @Override
    public void WaitingItOut() {
    }

    public int countHowMany(char charToFind){
        int count = 0;
        for (int i = 0; i < stringHeld.length(); i++){
            if (stringHeld.charAt(i) == charToFind){
                count++;
            }
        }
        return count;
    }

    @Override
    public void setS(String s) {
    }

    @Override
    public String getS() {
        return null;
    }
}
