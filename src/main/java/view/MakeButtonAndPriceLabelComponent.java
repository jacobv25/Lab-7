package view;

import javax.swing.*;
import java.awt.*;

public class MakeButtonAndPriceLabelComponent extends JPanel{
    private JLabel priceLabel;
    public MakeButtonAndPriceLabelComponent(){
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
