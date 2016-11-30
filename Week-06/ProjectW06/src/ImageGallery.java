import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Zsuzska on 2016. 11. 24..
 */
public class ImageGallery extends JFrame implements ActionListener {
    JMenuBar menubar = new JMenuBar();
    JMenu menu = new JMenu("File");
    JMenuItem menuItem = new JMenuItem("Exit");
    Toolkit tk = Toolkit.getDefaultToolkit();
    JPanel upperPanel = new JPanel();
    JPanel lowerPanel = new JPanel();
    JButton leftButton = new JButton("<");
    JButton rightButton = new JButton(">");

    public ImageGallery(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(500, 500);
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.add(upperPanel);
        upperPanel.add(leftButton);
        upperPanel.add(new ImageB("image1.jpg"));
        upperPanel.add(rightButton);

        this.add(lowerPanel);
        lowerPanel.setBackground(Color.CYAN);
//        lowerPanel.add(leftButton);
//        lowerPanel.add(new ImageC("image1"));
//        lowerPanel.add(new ImageC("image2"));
//        lowerPanel.add(new ImageC("image3"));
//        lowerPanel.add(new ImageC("image4"));
//        lowerPanel.add(new ImageC("image5"));
//        lowerPanel.add(new ImageC("image6"));



        setJMenuBar(menubar);
        menubar.add(menu);
        menu.add(menuItem);
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageGallery();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
