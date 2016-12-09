/**
 * Created by Zsuzsi on 2016. 12. 07..
 */
public class Skeleton extends HeroAndMonsters {

    public Skeleton(int posX, int posY) {
        super("skeleton.png", posX, posY);
        this.name = "Ood";
        this.setLevel(1);
        this.setSP((level * randSP.nextInt(6)+1) + level);
        this.setHP(2 * level * randHP.nextInt(6) + 1);
        this.setDP(level / 2 * randDP.nextInt(6)+1);
        this.setAlive(true);
        this.setHasWon(false);

    }

}
