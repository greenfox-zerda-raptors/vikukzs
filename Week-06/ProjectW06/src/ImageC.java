import javax.swing.*;
import java.awt.*;

/**
 * Created by Zsuzska on 2016. 11. 25..
 */
public class ImageC extends JPanel {
    private Image image2;


    public ImageC(String filename){
        image2 = Toolkit.getDefaultToolkit().createImage(filename);
        setPreferredSize(new Dimension(200,200));
    }


    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        requestFocus();
        graphics.drawImage(image2, 0, 0, this);
    }
}
