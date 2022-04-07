package main.CoffeeMachine.view;

import main.CoffeeMachine.Listeners.MakeCoffeeListener;
import main.CoffeeMachine.controller.CoffeeMenuController;
import main.CoffeeMachine.model.CMM_Util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MakeButtonAndPriceLabelPanel extends JPanel implements MakeCoffeeListener {

    private JLabel priceLabel;
    private JButton makeButton;
    private CoffeeMenuController controller;

    public MakeButtonAndPriceLabelPanel(){
        priceLabel = new JLabel("machine offline");
        makeButton = new JButton("Make Coffee");

        makeButton.setActionCommand(CMM_Util.MAKE_ACTION_COMMAND);

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

    public void setController(CoffeeMenuController _controller) {
        controller = _controller;
    }

    @Override
    public void makeCoffee(String price) {
        priceLabel.setText(price);
    }
}
