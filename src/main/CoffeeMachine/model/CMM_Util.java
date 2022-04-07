package main.CoffeeMachine.model;

import main.CoffeeMachine.Image.ImageFactory;

import javax.swing.*;
import java.math.BigDecimal;

public class CMM_Util {

    //region CONSTANTS
    public static final String RED_LED = "/images/red_led.png";
    public static final String GREEN_LED = "/images/green_led.png";

    public static final BigDecimal REGULAR = new BigDecimal(1.0);
    public static final BigDecimal MOCHA = new BigDecimal(2.0);
    public static final BigDecimal LATTE = new BigDecimal(3.0);
    public static final BigDecimal ESPRESSO = new BigDecimal(4.0);
    public static final BigDecimal CAPPUCCINO = new BigDecimal(5.0);
    // TODO: ADD MORE COFFEE TYPES
    public static final BigDecimal CREAM = new BigDecimal(.25);
    public static final BigDecimal VANILLA = new BigDecimal(.50);
    public static final BigDecimal CHOCOLATE = new BigDecimal(1.0);
    // TODO: ADD MORE ADD-ONS
    public static final String REGULAR_ACTION_COMMAND = "REGULAR";
    public static final String MOCHA_ACTION_COMMAND = "MOCHA";
    public static final String LATTE_ACTION_COMMAND = "LATTE";
    public static final String ESPRESSO_ACTION_COMMAND = "ESPRESSO";
    public static final String CAPPUCCINO_ACTION_COMMAND = "CAPPUCCINO";
    public static final String CREAM_ACTION_COMMAND = "CREAM";
    public static final String VANILLA_ACTION_COMMAND = "VANILLA";
    public static final String CHOCOLATE_ACTION_COMMAND = "CHOCOLATE";
    public static final String MAKE_ACTION_COMMAND = "MAKE_COFFEE";
    //endregion

    private static CMM_Util instance = new CMM_Util();
    private CMM_Util() {};
    public static CMM_Util getInstance() {
        return instance;
    }

    public ImageIcon loadImage(String path) {
        ImageFactory imageFactory = new ImageFactory();
        imageFactory.setPath(path);
        return imageFactory.loadImage();

    }
}
