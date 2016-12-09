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
    protected double HP;
    protected double DP;
    protected int SP;
    protected boolean isAlive;
    protected boolean hasWon;
    protected int SV;
    protected int level;

    public HeroAndMonsters(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.SV = this.SP + (randSV.nextInt(6)+1)*2;
    }

    public void levelUp() {
        level++;
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

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setDP(int DP) {
        this.DP = DP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void draw(Graphics graphics) {
        if (isAlive) {
            super.draw(graphics);
        }
    }

    @Override
    public String toString() {
        if (isAlive) {
            return this.getClass().getSimpleName() + ": " +
                    name +
                    ", HP=" + HP +
                    ", DP=" + DP +
                    ", SP=" + SP;
        }
        else {
            return this.getClass().getSimpleName() + " is DEAD!";
        }
    }

    public void win() {
        this.setHasWon(true);
    }
}
