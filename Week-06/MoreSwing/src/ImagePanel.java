import javax.swing.*;
import java.awt.*;

/**
 * Created by Zsuzska on 2016. 11. 24..
 */
public class ImagePanel extends JPanel {
    private Image image;


    public ImagePanel(){
        image = Toolkit.getDefaultToolkit().createImage("image.jpg");
    }
    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        requestFocus();
        graphics.drawImage(image, 7, 25, this);
    }
}
