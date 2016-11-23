package main.java.music;

/**
 * Created by Zsuzska on 2016. 11. 16..
 */
public class ElectricGuitar extends StringedInstrument{


    public ElectricGuitar() {
        super("Electric Guitar", "Twang", 6);
    }
    public ElectricGuitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
        instName = "Guitar";
        sound = "Twang";
    }
}
