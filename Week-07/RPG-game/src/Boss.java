/**
 * Created by Zsuzsi on 2016. 12. 07..
 */
public class Boss extends HeroAndMonsters {

    public Boss(int posX, int posY) {
        super("boss.png", posX, posY);
        this.name = "King Dalek";
        this.setSP((1 * randSP.nextInt(6)) + 1 + 1);
        this.setHP(2 * 1 * randHP.nextInt(6) + 1 + randHP.nextInt(6) + 1);
        this.setDP(1 / 2 * randDP.nextInt(6)+1 + (randDP.nextInt(6)+1) / 2);
        this.setAlive(true);
    }
}
