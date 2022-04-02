import javax.swing.*;
import java.awt.*;

public class CoffeeMenu extends JPanel {
    public CoffeeMenu(){
//        setSize(10 ,10);
        setLayout(new FlowLayout());
        add(new JButton("Regular"));
        add(new JButton("Mocha"));
        add(new JButton("Latte"));
        add(new JButton("Espresso"));
        add(new JButton("Cappuccino"));
        setVisible(true);
    }
}
