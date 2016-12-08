
/**
 * Created by Zsuzsi on 2016. 12. 07..
 */
public class Hero extends HeroAndMonsters {

    public Hero() {
        super("hero-down.png", 0, 0);
        this.name = "Doctor";
        this.setHP(20 + 3 * randHP.nextInt(6)+1);
        this.setDP(2 * randDP.nextInt(6)+1);
        this.setSP(5 + randSP.nextInt(6)+1);
    }

    public void move(int moveX, int moveY, int[][] map) {
        int nextX = posX + moveX;
        int nextY = posY + moveY;
        if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map.length && map[nextX][nextY] != 1) {
            posX += moveX;
            posY += moveY;
        }
    }



}
