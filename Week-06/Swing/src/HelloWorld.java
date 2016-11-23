import javax.swing.*;
import java.awt.*;

/**
 * Created by Zsuzska on 2016. 11. 23..
 */
public class HelloWorld extends JFrame {
    Toolkit tk = Toolkit.getDefaultToolkit();

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    public static void main(String[] args) {
        new HelloWorld();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HelloWorld();
            }
        });
    }

    public HelloWorld() {

        JPanel thePanel = new JPanel();
        this.setSize(400, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(thePanel);
        this.setTitle("HelloWorld");
        this.setVisible(true);
        JLabel label1 = new JLabel("Hello World");
        thePanel.add(label1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label1.setText("Hello Zsuzska!!!");

        for (int i = 0; i < hellos.length; i++){
            JLabel label = new JLabel(hellos[i] + " World");
            thePanel.add(label);
        }
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);

    }

}
