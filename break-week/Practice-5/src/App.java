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

        Dogs dogs = new Dogs();
        dogs.add(new YorkshireTerrier("Freddy"));
        dogs.add(new PitBull("Liberty"));
        dogs.add(new NewFoundland("Bigdog"));

        System.out.println(dogs);
        System.out.println(dogs.feed(20));
        System.out.println(dogs);
        System.out.println(dogs.feed(10));
        System.out.println(dogs);


    }
}
