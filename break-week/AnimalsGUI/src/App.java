import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Zsuzsi on 2016. 12. 01..
 */
public class App extends JFrame {
    JPanel containerPanel = new JPanel();
    JPanel horseDataPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();
    Toolkit tk = Toolkit.getDefaultToolkit();
    ArrayList<Horse> horses = new ArrayList<>();
    JButton newHorseButton = new JButton("ADD HORSE");
    JTextField newHorseNameTextField = new JTextField(15);

    public App() {

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.add(containerPanel);
        this.setTitle("Modafakin Horses Bitch");
        this.setVisible(true);
        containerPanel.add(horseDataPanel);

        horses = new ArrayList<>(Arrays.asList(new Horse("Paci"), new Horse("Saci"), new Horse("Lo")));



        for (int i = 0; i < horses.size(); i++) {
            JLabel horsesLabel = new JLabel(horses.toString());
            horseDataPanel.add(horsesLabel);
        }

        buttonsPanel.add(new JLabel("Type new horse name:"));
        buttonsPanel.add(newHorseNameTextField);
        newHorseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Horse newHorse = new Horse(newHorseNameTextField.getText());
                horses.add(newHorse);
                JLabel newHorseLabel = new JLabel(newHorse.getName());
                horseDataPanel.add(newHorseLabel);

            }
        });

        buttonsPanel.add(newHorseButton);

        containerPanel.add(buttonsPanel);

        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS));
        this.pack();
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
