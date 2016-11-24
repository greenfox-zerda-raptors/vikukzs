import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Zsuzska on 2016. 11. 23..
 */
public class AllCounterApp extends JFrame {
    JLabel mouseCounterLabel = new JLabel();
    JLabel keyCounterLabel = new JLabel();
    JLabel windowCounterLabel = new JLabel();
    JTextField inputTextField = new JTextField();

    int mouseCounter = 0;
    int keyCounter = 0;
    int windowCounter = 0;
    JPanel panel = new JPanel();
    JButton buttonCount = new JButton("Click me!");
    JButton buttonReset = new JButton("Reset mouseCounter");

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AllCounterApp();
            }
        });
    }

    public AllCounterApp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(panel);
        panel.add(buttonCount);
        panel.add(buttonReset);
        panel.add(mouseCounterLabel);
        panel.add(keyCounterLabel);
        panel.add(windowCounterLabel);

        this.setTitle("ClickCounter");
        updateMouseCounter();
        this.setVisible(true);
        this.setSize(400, 100);


        buttonCount.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mouseCounter++;
                        updateMouseCounter();
                    }
                }
        );
        buttonReset.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mouseCounter = 0;
                        updateMouseCounter();
                    }
                }
        );
    }

    private void updateMouseCounter() {
        mouseCounterLabel.setText("Clicked " + mouseCounter + " times");
    }
    private void updateKeyCounter() {
        keyCounterLabel.setText("Keys hit: " + keyCounter);
    }
    private void updateWindowCounter() {
        windowCounterLabel.setText("Window clicked: " + windowCounter);
    }


}
