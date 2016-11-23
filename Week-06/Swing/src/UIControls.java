import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Zsuzska on 2016. 11. 23..
 */
public class UIControls extends JFrame implements ActionListener {
    JPanel newPanel = new JPanel();
    static JTextField textField = new JTextField();
    JLabel inputLabel = new JLabel("Shows memory");
    JLabel memoryLabel = new JLabel("Shows input");
    JButton buttonClear = new JButton("Clear memory");
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UIControls();
            }
        });
    }





    public UIControls(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        newPanel.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.MAGENTA));
        newPanel.setBackground(Color.CYAN);
        Box.createRigidArea(new Dimension(0, 20));

        textField.setColumns(20);

        newPanel.add(textField);
        newPanel.add(inputLabel);
        newPanel.add(memoryLabel);
        newPanel.add(buttonClear);
        this.add(newPanel);
        textField.addActionListener(this);
        this.pack();
        buttonClear.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        memoryLabel.setText("Shows memory");
                        inputLabel.setText("Shows input");
                    }
                }
        );
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        memoryLabel.setText(inputLabel.getText());
        inputLabel.setText(textField.getText());
        textField.setText("");
    }

}
