package CoffeeMachine.view;

import javax.swing.*;
import java.awt.*;

public class MakeButtonAndPriceLabelPanel extends JPanel{
    private JLabel priceLabel;
    private JButton makeButton;
    public MakeButtonAndPriceLabelPanel(){
        priceLabel = new JLabel("machine offline");
        makeButton = new JButton("Make CoffeeMachine.Coffee");
        setLayout(new FlowLayout());
        add(makeButton);
        add(priceLabel);
        setVisible(true);
    }

    public JLabel getPriceLabel() {
        return priceLabel;
    }
}
