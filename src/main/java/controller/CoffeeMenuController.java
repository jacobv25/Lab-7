package controller;

import model.CMM_Util;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import static model.CMM_Util.REGULAR;
import static model.CMM_Util.REGULAR_ACTION_COMMAND;

public class CoffeeMenuController implements ActionListener {

    private JLabel priceLabel;
    private BigDecimal price;


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
        }
    }
}
