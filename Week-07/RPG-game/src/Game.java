import javax.swing.*;
import java.awt.*;

/**
 * Created by Zsuzsi on 2016. 12. 07..
 */
public class Game extends JFrame {
    Board board;
    public Game() throws HeadlessException {
        board = new Board();
        this.add(board);
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.addKeyListener(board);
    }

}

