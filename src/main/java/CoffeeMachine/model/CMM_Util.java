package CoffeeMachine.model;

import java.math.BigDecimal;

public class CMM_Util {
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
    // TODO: ADD MORE ACTION COMMANDS

}
