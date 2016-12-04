import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Zsuzsi on 2016. 12. 02..
 */
public class App extends JFrame {
    JPanel container = new JPanel();
    JTextArea plantsText = new JTextArea(20, 20);
    JPanel userActionPanel = new JPanel();
    Toolkit tk = Toolkit.getDefaultToolkit();
    JButton waterButton = new JButton("Water random amount");
    JButton addFlower = new JButton("Add new flower");
    JButton showGarden = new JButton("Show garden");
    JButton addTree = new JButton("Add new tree");
    JScrollPane scrollBar = new JScrollPane(plantsText);

    Garden guiGarden = new Garden();
    ArrayList<String> colors = new ArrayList<>(Arrays.asList("blue", "pink", "yellow", "purple", "red", "orange", "green"));


    public App() {
        scrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);

        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        addFlower.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                String randColor = colors.get(r.nextInt(colors.size()));
                Flower newFlower = new Flower(randColor);
                guiGarden.add(newFlower);
                plantsText.append("You added a " + randColor + " flower to your garden.\n");
            }
        });

        showGarden.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String garden = guiGarden.toString();
                plantsText.append(garden);
            }
        });

        waterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int randWater = 1 + random.nextInt(100);
                guiGarden.water(randWater);
                plantsText.append("You watered your garden with " + randWater + " amount of water.\n");
            }
        });

        addTree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random();
                String randColor = colors.get(r.nextInt(colors.size()));
                Tree newFlower = new Tree(randColor);
                guiGarden.add(newFlower);
                plantsText.append("You added a " + randColor + " tree to your garden.\n");
            }
        });
        userActionPanel.add(showGarden);
        userActionPanel.add(addTree);
        userActionPanel.add(addFlower);
        userActionPanel.add(waterButton);
        container.add(userActionPanel);
        container.add(scrollBar);
        container.add(plantsText);
        this.add(container);
        this.pack();
        this.setVisible(true);
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}
