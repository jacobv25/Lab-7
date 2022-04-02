package view;

import controller.CoffeeMenuController;
import model.CMM_Util;
import model.RegularCoffee;

import javax.swing.*;
import java.awt.*;

public class CoffeeMenu extends JPanel {

    private JButton regularCoffeeButton;
    private JButton mochaCoffeeButton;
    private JButton latteCoffeeButton;
    private JButton espressoCoffeeButton;
    private JButton cappuccinoCoffeeButton;

    private CoffeeMenuController coffeeMenuController;
    private JLabel priceLabel;

    public CoffeeMenu( JLabel priceLabel){

        coffeeMenuController = new CoffeeMenuController(priceLabel);

        setLayout(new FlowLayout());

        regularCoffeeButton = new JButton("Regular");
        mochaCoffeeButton = new JButton("Mocha");
        latteCoffeeButton = new JButton("Latte");
        espressoCoffeeButton = new JButton("Espresso");
        cappuccinoCoffeeButton = new JButton("Cappuccino");

        regularCoffeeButton.setActionCommand(CMM_Util.REGULAR_ACTION_COMMAND);
        mochaCoffeeButton.setActionCommand(CMM_Util.MOCHA_ACTION_COMMAND);
        /**
         * PLEASE FINISH
         */

        addActionListeners();

        add(regularCoffeeButton);
        add(mochaCoffeeButton);
        add(latteCoffeeButton);
        add(espressoCoffeeButton);
        add(cappuccinoCoffeeButton);

        setVisible(true);
    }

    private void addActionListeners() {
        regularCoffeeButton.addActionListener(coffeeMenuController);
        mochaCoffeeButton.addActionListener(coffeeMenuController);
//        latteCoffeeButton
//        ...
    }
}
