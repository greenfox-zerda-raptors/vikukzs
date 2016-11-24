import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Zsuzska on 2016. 11. 24..
 */
public class AllCounterApp extends JFrame {
    JLabel clickCounterLabel = new JLabel();
    JLabel keyCounterLabel = new JLabel("Keys pressed: ");
    JLabel windowCounterLabel = new JLabel();
    JTextField inputTextField = new JTextField(30);

    int clickCounter = 0;
    String keyCounter = "";
    int windowCounter = 0;

    JPanel panel = new JPanel();

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
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.add(panel);
        panel.add(inputTextField);
        panel.add(clickCounterLabel);
        panel.add(keyCounterLabel);
        panel.add(windowCounterLabel);

        this.setTitle("Event Counter");

//        updateClickCounter();
//        updateKeyCounter();
//        updateWindowCounter();
        this.setVisible(true);
        this.setSize(400, 400);
        inputTextField.addKeyListener(new ListenForKeys());
        this.addMouseListener(new ListenForMouse());
        this.addWindowListener(new ListenForWindow());
    }

//    private void updateClickCounter() {
//        clickCounterLabel.setText("Mouse clicked " + clickCounter + " times");
//    }
//
//    private void updateKeyCounter() {
//        this.keyCounter += keyCounter;
//
//    }
//
//    private void updateWindowCounter() {
//        windowCounterLabel.setText("Window clicked: " + windowCounter);
//    }
//

    private class ListenForKeys implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

            if (!keyCounterLabel.getText().contains("" + e.getKeyChar())) {
                keyCounterLabel.setText(keyCounterLabel.getText() + e.getKeyChar());
            }

        }

        @Override
        public void keyPressed(KeyEvent f) {

        }

        @Override
        public void keyReleased(KeyEvent g) {

        }
    }
    private class ListenForMouse implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            clickCounterLabel.setText("Mouse Clicks: " + e.getClickCount()  + "\n");
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }


    }
    private class ListenForWindow implements WindowListener {

        @Override
        public void windowOpened(WindowEvent e) {
            windowCounterLabel.setText("Window opened");
        }

        @Override
        public void windowClosing(WindowEvent e) {

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {
            windowCounterLabel.setText("Window minimized");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            windowCounterLabel.setText("Window in normal state");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            windowCounterLabel.setText("Window activated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            windowCounterLabel.setText("Window deactivated");
        }
    }
}
