package com.greenfox;

/**
 * Created by Zsuzska on 2016. 12. 21..
 */
public class WithFries {
    boolean flSalted = true;

    public WithFries(boolean flSalted) {
        this.flSalted = flSalted;
    }

    public WithFries() {
    }

    @Override
    public String toString() {
        return (flSalted? "Salted" : "Unassaulted");
    }

    public void toggleFlSalted() {
        this.flSalted = ! this.flSalted;
    }
}