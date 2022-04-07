package main.CoffeeMachine.controller;

import main.CoffeeMachine.Coffee.CoffeeProgram_IF;
import main.CoffeeMachine.CoffeeOS;
import lombok.SneakyThrows;
import main.CoffeeMachine.Listeners.MakeCoffeeListener;
import main.CoffeeMachine.model.CMM_Util;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CoffeeMenuController implements ActionListener {

    private static BigDecimal price;
    private JLabel priceLabel;
    private CoffeeOS os;

    private List<MakeCoffeeListener> listeners;

    public CoffeeMenuController(){
        price = new BigDecimal(0.0);
        listeners = new ArrayList<>();
    }

    public void addListener(MakeCoffeeListener toAdd) {
        listeners.add(toAdd);
    }

    public void setPriceLabel(JLabel label) {
        priceLabel = label;
    }

    @SneakyThrows
    @Override
    public void actionPerformed(ActionEvent e) {

        /**
         * COFFEES
         */
        switch (e.getActionCommand()){
            case CMM_Util.REGULAR_ACTION_COMMAND:
                price = new BigDecimal( CMM_Util.REGULAR.floatValue());
                os.setChosenCoffeeType(CoffeeProgram_IF.CoffeeType.REGULAR);
                os.setPrice(price);
                updatePrice();
                break;
            case CMM_Util.MOCHA_ACTION_COMMAND:
                price = new BigDecimal(CMM_Util.MOCHA.floatValue());
                os.setChosenCoffeeType(CoffeeProgram_IF.CoffeeType.MOCHA);
                os.setPrice(price);
                updatePrice();
                break;
            case CMM_Util.LATTE_ACTION_COMMAND:
                price = new BigDecimal(CMM_Util.LATTE.floatValue());
                os.setChosenCoffeeType(CoffeeProgram_IF.CoffeeType.LATTE);
                os.setPrice(price);
                updatePrice();
                break;
            case CMM_Util.ESPRESSO_ACTION_COMMAND:
                price = new BigDecimal(CMM_Util.ESPRESSO.floatValue());
                os.setChosenCoffeeType(CoffeeProgram_IF.CoffeeType.ESPRESSO);
                os.setPrice(price);
                updatePrice();
                break;
            case CMM_Util.CAPPUCCINO_ACTION_COMMAND:
                price = new BigDecimal(CMM_Util.CAPPUCCINO.floatValue());
                os.setChosenCoffeeType(CoffeeProgram_IF.CoffeeType.CAPPUCCINO);
                os.setPrice(price);
                updatePrice();
                break;
            /**
             * CONDIMENTS
             */
            case CMM_Util.CREAM_ACTION_COMMAND:
                price = price.add(CMM_Util.CREAM);
                os.setPrice(price);
                updatePrice();
                break;
            case CMM_Util.VANILLA_ACTION_COMMAND:
                price = price.add(CMM_Util.VANILLA);
                os.setPrice(price);
                updatePrice();
                break;
            case CMM_Util.CHOCOLATE_ACTION_COMMAND:
                price = price.add(CMM_Util.CHOCOLATE);
                os.setPrice(price);
                updatePrice();
                break;
            /**
             * MAKE BUTTON PUSHED
             */
            case CMM_Util.MAKE_ACTION_COMMAND:
//                startThread();
                os.setPrice(price);
                os.start();
                updatePrice();
                break;

        }
    }

//    private void startThread() {
//        SwingWorker swingWorker = new SwingWorker() {
//            @Override
//            protected Object doInBackground() throws Exception {
//                os.setPrice(price);
//                os.start();
//                updatePrice();
//                return null;
//            }
//            @Override
//            protected void process(List chunks){
//
//            }
//        };
//    }

    public void updatePrice(){
        for (MakeCoffeeListener listener : listeners){
            listener.makeCoffee(os.getPrice().toString());
        }
    }

    public void setOS(CoffeeOS os) {
        this.os = os;
    }
}
