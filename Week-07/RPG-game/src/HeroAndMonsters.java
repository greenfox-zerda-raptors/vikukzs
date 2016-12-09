import java.awt.*;
import java.util.Random;

/**
 * Created by Zsuzsi on 2016. 12. 08..
 */
public class HeroAndMonsters extends GameObject {
    Random randHP = new Random();
    Random randDP = new Random();
    Random randSP = new Random();
    Random randSV = new Random();

    protected String name;
    protected int HP;
    protected int DP;
    protected int SP;
    protected boolean isAlive;
    protected int SV;

    public HeroAndMonsters(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.SV = this.SP + (randSV.nextInt(6)+1)*2;
    }

    public void move(int moveX, int moveY, RandomMaze map) {
        int nextX = posX + moveX;
        int nextY = posY + moveY;
        if (nextX >= 0 && nextX < map.getWidth() && nextY >= 0 && nextY < map.getHeight() && map.getData()[nextX][nextY] != 0) {
            posX += moveX;
            posY += moveY;
        }
    }

    public void damage(HeroAndMonsters attacker) {
        this.HP = HP - attacker.SV;
        if (this.HP <= 0) {
            this.setAlive(false);
        }
    }

    public void attack(HeroAndMonsters attacked) {
        attacked.damage(this);
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

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public int getSV() {
        return SV;
    }

    public void setSV(int SV) {
        this.SV = SV;
    }

    @Override
    public void draw(Graphics graphics) {
        if (isAlive) {
            super.draw(graphics);
        }
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
