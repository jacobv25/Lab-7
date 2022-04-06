package CoffeeMachine.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import static CoffeeMachine.model.CMM_Util.*;

public class CoffeeMenuController implements ActionListener {

    private BigDecimal price;
    private JLabel priceLabel;

    public CoffeeMenuController(JLabel _priceLabel){
        priceLabel = _priceLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()){
            case REGULAR_ACTION_COMMAND:
                price = REGULAR;
                priceLabel.setText(price.toString());
                break;
            case MOCHA_ACTION_COMMAND:
                price = MOCHA;
                priceLabel.setText(price.toString());
                break;
            case LATTE_ACTION_COMMAND:
                price = LATTE;
                priceLabel.setText(price.toString());
                break;
            case ESPRESSO_ACTION_COMMAND:
                price = ESPRESSO;
                priceLabel.setText(price.toString());
                break;
            case CAPPUCCINO_ACTION_COMMAND:
                price = CAPPUCCINO;
                priceLabel.setText(price.toString());
                break;
            case CREAM_ACTION_COMMAND:
                price = CREAM;
                priceLabel.setText(price.toString());
                break;
            case VANILLA_ACTION_COMMAND:
                price = VANILLA;
                priceLabel.setText(price.toString());
                break;
            case CHOCOLATE_ACTION_COMMAND:
                price = CHOCOLATE;
                priceLabel.setText(price.toString());
                break;
        }
    }
}
