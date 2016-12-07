import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class Board extends JComponent implements KeyListener {
    private Hero hero;
    private Skeleton skeletonOne;
    private Skeleton skeletonTwo;
    ArrayList<GameObject> gameObjects;


    int[][] map = new int[][]{
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 1, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},

    };

    public Board() {

        gameObjects = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

                if (map[i][j] == 1) {
                    gameObjects.add(new Wall(i, j));
                } else {
                    gameObjects.add(new Floor(i, j));
                }

            }
        }



        hero = new Hero();
        skeletonOne = new Skeleton(5,5);
        skeletonTwo = new Skeleton(3, 7);
        this.addKeyListener(this);

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));

        setVisible(true);
    }



    @Override
    public void paint(Graphics graphics) {
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        for (GameObject gameObject : gameObjects){
            gameObject.draw(graphics);
        }

        skeletonOne.draw(graphics);
        skeletonTwo.draw(graphics);

        hero.draw(graphics);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch( keyCode ) {
            case KeyEvent.VK_ESCAPE:
                System.exit(0);
            case KeyEvent.VK_UP:
                hero.move(0, -1, map);
                break;
            case KeyEvent.VK_DOWN:
                hero.move(0, 1, map);
                break;
            case KeyEvent.VK_LEFT:
                hero.move(-1, 0, map);
                break;
            case KeyEvent.VK_RIGHT :
                hero.move(1, 0, map);
                break;
        }

        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}