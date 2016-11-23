package main.java.music;

/**
 * Created by Zsuzska on 2016. 11. 16..
 */
public class ElectricBassGuitar extends StringedInstrument {
    public ElectricBassGuitar() {
        super("Electric BassGuitar", "Duum-duum-duum",4);
    }
    public ElectricBassGuitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
        instName = "BassGuitar";
        sound = "Duum-duum-duum";
    }

}
