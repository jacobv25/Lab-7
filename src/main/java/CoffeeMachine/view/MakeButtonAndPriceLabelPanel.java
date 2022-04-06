package CoffeeMachine.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeButtonAndPriceLabelPanel extends JPanel implements ActionListener{

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

    public void addActionListener(ActionListener listener) {
        makeButton.addActionListener(listener);
    }

    public JLabel getPriceLabel() {
        return priceLabel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
