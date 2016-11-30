/**
 * Created by Zsuzska on 2016. 11. 29..
 */
public class MovablePoint implements Movable {
    private int x;
    private int y;

    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return String.format("[x=%d;y=%d;xSpeed=%d;ySpeed=%d]", x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
