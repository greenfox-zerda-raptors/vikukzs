import java.util.Random;

/**
 * Created by Zsuzsi on 2016. 12. 08..
 */
public class HeroAndMonsters extends GameObject {
    Random randHP = new Random();
    Random randDP = new Random();
    Random randSP = new Random();

    protected String name;
    protected int HP;
    protected int DP;
    protected int SP;

    public HeroAndMonsters(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDP() {
        return DP;
    }

    public void setDP(int DP) {
        this.DP = DP;
    }

    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " +
                name  +
                ", HP=" + HP +
                ", DP=" + DP +
                ", SP=" + SP;
    }
}
