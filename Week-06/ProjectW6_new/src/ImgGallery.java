import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Zsuzska on 2016. 11. 25..
 */
public class ImgGallery extends JFrame {
    JPanel containerPanel = new JPanel();
    JPanel upperPanel = new JPanel();
    JPanel lowerPanel = new JPanel();

    JButton upLeftButton = new JButton("<");
    JButton upRightButton = new JButton(">");
    JButton lowLeftButton = new JButton(">");
    JButton lowRightButton = new JButton(">");
    Toolkit tk = Toolkit.getDefaultToolkit();

    ImageIcon pic1 = new ImageIcon("image1.jpg");
    ImageIcon pic2 = new ImageIcon("image2.jpg");
    ImageIcon pic3 = new ImageIcon("image3.jpg");
    ImageIcon pic4 = new ImageIcon("image4.jpg");
    ImageIcon pic5 = new ImageIcon("image5.jpg");
    ImageIcon pic6 = new ImageIcon("image6.jpg");

    JLabel label1 = new JLabel(pic1);
    JLabel label2 = new JLabel(pic2);
    JLabel label3 = new JLabel(pic3);
    JLabel label4 = new JLabel(pic4);
    JLabel label5 = new JLabel(pic5);
    JLabel label6 = new JLabel(pic6);

    ArrayList<JLabel> imageList = new ArrayList(Arrays.asList(label1, label2, label3, label4, label5, label6));



    public ImgGallery(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(800, 800);
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);

        this.add(containerPanel);
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS));

        containerPanel.add(upperPanel);
        upperPanel.add(upLeftButton);
        upperPanel.add(label1);
        upperPanel.add(upRightButton);

        containerPanel.add(lowerPanel);
        lowerPanel.add(lowLeftButton);
        showImgs();
        lowerPanel.add(lowRightButton);
    }

    public void showImgs() {
        for (int i = 0; i < imageList.size(); i++){
            imageList.get(i).setPreferredSize(new Dimension(100,100));
            lowerPanel.add(imageList.get(i));
        }
    }

    public void addTopImg() {
        for (int i = 0; i < imageList.size(); i++){
            imageList.get(i).setPreferredSize(new Dimension(400,400));
        }

    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImgGallery();
            }
        });

    }


}
