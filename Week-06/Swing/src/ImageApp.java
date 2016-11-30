import com.sun.prism.*;
import com.sun.prism.paint.*;
import com.sun.prism.paint.Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

/**
 * Created by Zsuzska on 2016. 11. 23..
 */
public class ImageApp extends JFrame {
    private static Graphics graphics;
    JPanel panelImg = new JPanel();
    public ImageApp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(400, 400);
        this.add(panelImg);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageApp();
            }
        });


    }

}
