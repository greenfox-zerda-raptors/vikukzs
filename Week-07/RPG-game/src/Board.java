import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class Board extends JComponent implements KeyListener {
    private Hero hero;
    private Boss boss;
    private Skeleton skeletonOne;
    private Skeleton skeletonTwo;
    RandomMaze map;
    ArrayList<GameObject> gameObjects;
    ArrayList<HeroAndMonsters> monsterses;
    ArrayList<GameObject> floorTiles;

    Random randMonster = new Random();

    BufferedImage upImage;
    BufferedImage downImage;
    BufferedImage leftImage;
    BufferedImage rightImage;

    public Board() {
        floorTiles = new ArrayList<>();

        try {
            upImage = ImageIO.read(new File("hero-up.png"));
            downImage = ImageIO.read(new File("hero-down.png"));
            leftImage = ImageIO.read(new File("hero-left.png"));
            rightImage = ImageIO.read(new File("hero-right.png"));
        } catch (IOException e){
            e.printStackTrace();
        }

        map = new RandomMaze(20, 10);
        map.generate();

        gameObjects = new ArrayList<>();
        for (int y = 0; y < map.getHeight(); y++) {
            for (int x = 0; x < map.getWidth(); x++) {
                if (map.getData()[x][y] == map.getWALL()) {
                    gameObjects.add(new Wall(x, y));
                } else {
                    gameObjects.add(new Floor(x, y));
                    floorTiles.add(new Floor(x, y));
                }
            }
        }
        int bossPlace = randMonster.nextInt(floorTiles.size());
        int skeletonOnePlace = randMonster.nextInt(floorTiles.size());
        int skeletonTwoPlace = randMonster.nextInt(floorTiles.size());
        boss = new Boss(floorTiles.get(bossPlace).posX, floorTiles.get(bossPlace).posY);
        hero = new Hero();
        skeletonOne = new Skeleton(floorTiles.get(skeletonOnePlace).posX, floorTiles.get(skeletonOnePlace).posY);
        skeletonTwo = new Skeleton(floorTiles.get(skeletonTwoPlace).posX, floorTiles.get(skeletonTwoPlace).posY);
        this.addKeyListener(this);

        monsterses = new ArrayList<>(Arrays.asList(boss, skeletonOne, skeletonTwo));


        // set the size of your draw board
        setPreferredSize(new Dimension(map.getWidth() * 52, 720));

        setVisible(true);
    }


    @Override
    public void paint(Graphics graphics) {
        for (GameObject gameObject : gameObjects){
            gameObject.draw(graphics);
        }


        skeletonOne.draw(graphics);
        skeletonTwo.draw(graphics);
        boss.draw(graphics);
        hero.draw(graphics);


        graphics.drawString(skeletonOne.toString(), 20, 570);
        graphics.drawString(skeletonTwo.toString(), 20, 600);
        graphics.drawString(boss.toString(),20, 630);
        graphics.drawString(hero.toString(), 20, 540);

    }
    private void updateGame() {

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
                hero.imageChanger(upImage);
                hero.move(0, -1, map);
                break;
            case KeyEvent.VK_DOWN:
                hero.imageChanger(downImage);
                hero.move(0, 1, map);
                break;
            case KeyEvent.VK_LEFT:
                hero.imageChanger(leftImage);
                hero.move(-1, 0, map);
                break;
            case KeyEvent.VK_RIGHT:
                hero.imageChanger(rightImage);
                hero.move(1, 0, map);
                break;
            case KeyEvent.VK_SPACE:
                for (HeroAndMonsters monster : monsterses) {
                    if (hero.posX == monster.posX && hero.posY == monster.posY && monster.isAlive) {
                        hero.attack(monster);
                        monster.attack(hero);
                    }
                }
                if (hero.isAlive && !skeletonOne.isAlive && !skeletonTwo.isAlive && !boss.isAlive) {
                    hero.win();
                    hero.levelUp();
                    skeletonOne.levelUp();
                    skeletonTwo.levelUp();
                    boss.levelUp();
                    updateGame();
                }

        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


}