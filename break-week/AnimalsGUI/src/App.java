import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Zsuzsi on 2016. 12. 01..
 */
public class App extends JFrame {
    JPanel horseDataPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();
    Toolkit tk = Toolkit.getDefaultToolkit();
    ArrayList<Horse> horses = new ArrayList<>();
    JButton addHorseButton = new JButton("ADD HORSE");
    JTextField newHorseName = new JTextField("horse name");

    public App() {

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.add(horseDataPanel);
        this.setTitle("Modafakin Horses Bitch");
        this.setVisible(true);

        horses = new ArrayList<>(Arrays.asList(new Horse("Paci"), new Horse("Saci"), new Horse("Lo")));

        for (int i = 0; i < horses.size(); i++) {
            JLabel horsesLabel = new JLabel(horses.get(i).getName() + "\n");
            horseDataPanel.add(horsesLabel);
        }



        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
    }
    public static void main(String[] args) {
        new App();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }


}
