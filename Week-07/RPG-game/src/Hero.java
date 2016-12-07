/**
 * Created by Zsuzsi on 2016. 12. 07..
 */
public class Hero extends GameObject {

    public Hero() {
        super("hero-down.png", 0, 0);
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
