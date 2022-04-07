package main.CoffeeMachine.view;

import main.CoffeeMachine.controller.CoffeeMenuController;
import main.CoffeeMachine.model.CMM_Util;

import javax.swing.*;
import java.awt.*;


public class CoffeeMenuPanel extends JPanel {

    private JButton regularCoffeeButton;
    private JButton mochaCoffeeButton;
    private JButton latteCoffeeButton;
    private JButton espressoCoffeeButton;
    private JButton cappuccinoCoffeeButton;
    private JButton creamCondimentButton;
    private JButton vanillaCondimentButton;
    private JButton chocolateCondimentButton;

    private CoffeeMenuController coffeeMenuController;

//    public CoffeeMenuController getController(){
//        return coffeeMenuController;
//    }

    public CoffeeMenuPanel(){

//        coffeeMenuController = new CoffeeMenuController(priceLabel);

        setLayout(new FlowLayout());

        regularCoffeeButton = new JButton("Regular");
        mochaCoffeeButton = new JButton("Mocha");
        latteCoffeeButton = new JButton("Latte");
        espressoCoffeeButton = new JButton("Espresso");
        cappuccinoCoffeeButton = new JButton("Cappuccino");
        creamCondimentButton = new JButton("Cream");
        vanillaCondimentButton = new JButton("Vanilla");
        chocolateCondimentButton = new JButton("Chocolate");

        regularCoffeeButton.setActionCommand(CMM_Util.REGULAR_ACTION_COMMAND);
        mochaCoffeeButton.setActionCommand(CMM_Util.MOCHA_ACTION_COMMAND);
        latteCoffeeButton.setActionCommand(CMM_Util.LATTE_ACTION_COMMAND);
        espressoCoffeeButton.setActionCommand(CMM_Util.ESPRESSO_ACTION_COMMAND);
        cappuccinoCoffeeButton.setActionCommand(CMM_Util.CAPPUCCINO_ACTION_COMMAND);
        creamCondimentButton.setActionCommand(CMM_Util.CREAM_ACTION_COMMAND);
        vanillaCondimentButton.setActionCommand(CMM_Util.VANILLA_ACTION_COMMAND);
        chocolateCondimentButton.setActionCommand(CMM_Util.CHOCOLATE_ACTION_COMMAND);

        add(regularCoffeeButton);
        add(mochaCoffeeButton);
        add(latteCoffeeButton);
        add(espressoCoffeeButton);
        add(cappuccinoCoffeeButton);
        add(creamCondimentButton);
        add(vanillaCondimentButton);
        add(chocolateCondimentButton);

        setVisible(true);
    }

    public void addActionListeners(CoffeeMenuController controller) {
        regularCoffeeButton.addActionListener(controller);
        mochaCoffeeButton.addActionListener(controller);
        latteCoffeeButton.addActionListener(controller);
        espressoCoffeeButton.addActionListener(controller);
        cappuccinoCoffeeButton.addActionListener(controller);
        creamCondimentButton.addActionListener(controller);
        vanillaCondimentButton.addActionListener(controller);
        chocolateCondimentButton.addActionListener(controller);
    }
}
