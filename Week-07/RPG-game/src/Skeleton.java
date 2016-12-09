/**
 * Created by Zsuzsi on 2016. 12. 07..
 */
public class Skeleton extends HeroAndMonsters {

    public Skeleton(int posX, int posY) {
        super("skeleton.png", posX, posY);
        this.name = "Ood";
        this.setSP((1 * randSP.nextInt(6)) + 1);
        this.setHP(2 * 1 * randHP.nextInt(6) + 1);
        this.setDP(1 / 2 * randDP.nextInt(6)+1);
        this.setAlive(true);
    }

}
