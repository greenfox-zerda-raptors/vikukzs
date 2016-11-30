import javax.swing.*;
import java.awt.*;

/**
 * Created by Zsuzska on 2016. 11. 24..
 */
public class ImageB extends JPanel {
    private Image image1;


    public ImageB(String filename){
        image1 = Toolkit.getDefaultToolkit().createImage(filename);
        setPreferredSize(new Dimension(400,400));
    }


    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        requestFocus();
        graphics.drawImage(image1, 0, 0, this);
    }
}

