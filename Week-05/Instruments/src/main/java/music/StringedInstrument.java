package main.java.music;

/**
 * Created by Zsuzska on 2016. 11. 16..
 */
public abstract class StringedInstrument extends Instrument {
    public int numberOfStrings;

    public StringedInstrument(String instName, String sound, int numberOfStrings) {
        this.instName = instName;
        this.sound = sound;
        this.numberOfStrings = numberOfStrings;
    }
    public StringedInstrument() {
    }

    @Override
    public void play() {
        System.out.printf(formatForPlay,
                instName,
                numberOfStrings,
                sound
        );

    }


}
