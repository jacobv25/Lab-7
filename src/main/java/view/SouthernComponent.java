package view;

import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

public class SouthernComponent extends JPanel{
    private JLabel priceLabel;
    public SouthernComponent(){
        priceLabel = new JLabel("machine offline");
        setLayout(new FlowLayout());
        add(new JButton("MAKE COFFEE"));
        add(priceLabel);
        setVisible(true);
    }

    public JLabel getPriceLabel() {
        return priceLabel;
    }
}
