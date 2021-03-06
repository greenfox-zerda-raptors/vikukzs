import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class GameObject {

    BufferedImage image;
    int posX, posY;

    public GameObject(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;

        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void imageChanger(BufferedImage filename) {
        this.image = filename;
    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX * 52, posY * 52, 52, 52, null);
        }
    }
}