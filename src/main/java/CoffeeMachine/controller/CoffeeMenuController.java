package CoffeeMachine.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import static CoffeeMachine.model.CMM_Util.*;

public class CoffeeMenuController implements ActionListener {

    private static BigDecimal price;
    private JLabel priceLabel;

    public CoffeeMenuController(JLabel _priceLabel){
        priceLabel = _priceLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /**
         * COFFEES
         */
        switch (e.getActionCommand()){
            case REGULAR_ACTION_COMMAND:
                price = new BigDecimal( REGULAR.floatValue());
//                priceLabel.setText(price.toString());
                break;
            case MOCHA_ACTION_COMMAND:
                price = new BigDecimal(MOCHA.floatValue());
//                priceLabel.setText(price.toString());
                break;
            case LATTE_ACTION_COMMAND:
                price = new BigDecimal(LATTE.floatValue());
//                priceLabel.setText(price.toString());
                break;
            case ESPRESSO_ACTION_COMMAND:
                price = new BigDecimal(ESPRESSO.floatValue());
//                priceLabel.setText(price.toString());
                break;
            case CAPPUCCINO_ACTION_COMMAND:
                price = new BigDecimal(CAPPUCCINO.floatValue());
//                priceLabel.setText(price.toString());
                break;
            /**
             * CONDIMENTS
             */
            case CREAM_ACTION_COMMAND:
                price.add(CREAM);
//                priceLabel.setText(price.toString());
                break;
            case VANILLA_ACTION_COMMAND:
                price.add(VANILLA);
//                priceLabel.setText(price.toString());
                break;
            case CHOCOLATE_ACTION_COMMAND:
                price.add(CHOCOLATE);
//                priceLabel.setText(price.toString());
                break;
        }
    }
}
