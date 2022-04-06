package CoffeeMachine.Coffee;

import CoffeeMachine.CoffeeOS_API;

public interface CoffeeProgram_IF {
    void setEnvironment(CoffeeOS_API api);
    void makeCoffee();
    public enum CoffeeType {REGULAR, MOCHA, LATTE, CAPPUCCINO, ESPRESSO}
}

