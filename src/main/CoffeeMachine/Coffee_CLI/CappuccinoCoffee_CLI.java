package main.CoffeeMachine.Coffee_CLI;

import main.CoffeeMachine.Coffee.AbstractCoffeeProgram;
import main.CoffeeMachine.CoffeeOS_API;

import static main.CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.CAPPUCCINO;

public class CappuccinoCoffee_CLI extends AbstractCoffeeProgram {

    @Override
    public void makeCoffee() throws InterruptedException {
        environment.setPowerLED(1);
        environment.setTypeLED(CAPPUCCINO);
        environment.setGrinding(7);
        environment.setTemperature(200);
        environment.holdTemperature(4);
        environment.wait(10);
        environment.setPowerLED(0);

    }

    @Override
    public void setEnvironment(CoffeeOS_API env) {
        environment = env;
    }

}
