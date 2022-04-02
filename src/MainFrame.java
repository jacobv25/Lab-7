import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);
        add(new CoffeeMenu(), BorderLayout.NORTH);
        add(new LedComponent(), BorderLayout.CENTER);
        add(new SouthernComponent(), BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new MainFrame()
        );
    }
}
