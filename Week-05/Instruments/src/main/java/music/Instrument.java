package main.java.music;

/**
 * Created by Zsuzska on 2016. 11. 16..
 */
public abstract class Instrument {
    protected String instName;
    String sound;

    final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

    public Instrument(String instName){
        this.instName = instName;
    }

    public Instrument() {
    }

    public abstract void play();


}
