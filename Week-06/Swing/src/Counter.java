import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Zsuzska on 2016. 11. 23..
 */
public class Counter extends JFrame {
    JLabel counterLabel = new JLabel();
    int counter = 0;
    JPanel panel = new JPanel();
    JButton buttonCount = new JButton("Click me!");
    JButton buttonReset = new JButton("Reset counter");
    JMenuBar menubar = new JMenuBar();
    JMenu menu = new JMenu("File");
    JMenuItem menuItem = new JMenuItem("Exit");
    Toolkit tk = Toolkit.getDefaultToolkit();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Counter();
            }
        });
    }

    public Counter () {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(panel);
        panel.add(buttonCount);
        panel.add(buttonReset);
        panel.add(counterLabel);
        this.setTitle("ClickCounter");
        updateCounter();
        this.setVisible(true);
        this.setSize(400, 100);
        setJMenuBar(menubar);
        menubar.add(menu);
        menu.add(menuItem);
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        buttonCount.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter++;
                        updateCounter();
                    }
                }
        );
        buttonReset.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter = 0;
                        updateCounter();
                    }
                }
        );
    }

    private void updateCounter() {
        counterLabel.setText("Clicked " + counter + " times");

    }

}
