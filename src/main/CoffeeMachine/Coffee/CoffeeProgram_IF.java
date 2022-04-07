package main.CoffeeMachine.Coffee;

import main.CoffeeMachine.CoffeeOS_API;

public interface CoffeeProgram_IF {
    void setEnvironment(CoffeeOS_API api);
    void makeCoffee() throws InterruptedException;
    public enum CoffeeType {REGULAR, MOCHA, LATTE, CAPPUCCINO, ESPRESSO}
}

