/**
 * Created by Zsuzsi on 2016. 12. 02..
 */
public class App {
    public static void main(String[] args) {
        YorkshireTerrier yorkie = new YorkshireTerrier();
        PitBull pit = new PitBull();
        NewFoundland newfie = new NewFoundland();

        yorkie.ownADog();
        pit.ownADog();
        newfie.ownADog();
    }
}
