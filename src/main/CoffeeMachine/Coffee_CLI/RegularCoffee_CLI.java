package main.CoffeeMachine.Coffee_CLI;


import main.CoffeeMachine.Coffee.AbstractCoffeeProgram;
import main.CoffeeMachine.CoffeeOS_API;

import static main.CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.REGULAR;

public class RegularCoffee_CLI extends AbstractCoffeeProgram {

    @Override
    public void makeCoffee() throws InterruptedException {
        environment.setPowerLED(1);
        environment.setTypeLED(REGULAR);
        environment.setGrinding(8);
        environment.setTemperature(150);
        environment.holdTemperature(2);
        environment.wait(15);
        environment.setPowerLED(0);
    }


    @Override
    public void setEnvironment(CoffeeOS_API env) {
        environment = env;
    }

}
