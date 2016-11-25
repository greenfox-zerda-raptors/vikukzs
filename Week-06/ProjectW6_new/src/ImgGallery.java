import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Zsuzska on 2016. 11. 25..
 */
public class ImgGallery extends JFrame {

    int index = 0;

    JPanel containerPanel = new JPanel();
    JPanel upperPanel = new JPanel();
    JPanel lowerPanel = new JPanel();

    JButton upLeftButton = new JButton("<");
    JButton upRightButton = new JButton(">");
    Toolkit tk = Toolkit.getDefaultToolkit();

    ImageIcon pic1 = new ImageIcon("image1.jpg");
    ImageIcon pic2 = new ImageIcon("image2.jpg");
    ImageIcon pic3 = new ImageIcon("image3.jpg");
    ImageIcon pic4 = new ImageIcon("image4.jpg");
    ImageIcon pic5 = new ImageIcon("image5.jpg");
    ImageIcon pic6 = new ImageIcon("image6.jpg");

    JLabel activeLabel = new JLabel();

    ArrayList<ImageIcon> iconList = new ArrayList<>(Arrays.asList(pic1, pic2, pic3, pic4, pic5, pic6));

    public ImgGallery(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Image First Gallery");
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        Dimension dim = tk.getScreenSize();

        this.add(containerPanel);
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS));
        upperPanel.setBackground(Color.black);
        lowerPanel.setBackground(Color.DARK_GRAY);

        activeLabel.setPreferredSize(new Dimension(400,400));
        activeLabel.setIcon(pic1);

        upLeftButton.setFont(new Font("Calibri", Font.BOLD, 70));
        upLeftButton.setBackground(null);
        upLeftButton.setBorder(null);

        upRightButton.setFont(new Font("Calibri", Font.BOLD, 70));
        upRightButton.setBackground(null);
        upRightButton.setBorder(null);



        upRightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                index++;
                if (index > iconList.size()-1){
                    index = 0;
                }
                activeLabel.setIcon(iconList.get(index));
            }
        });

        upLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                index--;
                if (index < 0){
                    index = iconList.size()-1;
                }
                activeLabel.setIcon(iconList.get(index));
            }
        });



        containerPanel.add(upperPanel);
        upperPanel.add(upLeftButton);
        upperPanel.add(activeLabel);
        upperPanel.add(upRightButton);

        containerPanel.add(lowerPanel);
        showImgs();

        this.pack();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);

    }

    public void showImgs() {
        for (int i = 0; i < iconList.size(); i++){
            JLabel iconLabels = new JLabel(iconList.get(i));
            iconLabels.setPreferredSize(new Dimension(100,100));
            lowerPanel.add(iconLabels);
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
