package main.CoffeeMachine.Coffee_CLI;


import main.CoffeeMachine.Coffee.AbstractCoffeeProgram;
import main.CoffeeMachine.CoffeeOS_API;

import static main.CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.MOCHA;

public class MochaCoffee_CLI extends AbstractCoffeeProgram {

    @Override
    public void makeCoffee() throws InterruptedException {
        environment.setPowerLED(1);
        environment.setTypeLED(MOCHA);
        environment.setGrinding(5);
        environment.setTemperature(200);
        environment.holdTemperature(5);
        environment.wait(15);
        environment.setPowerLED(0);

    }

    @Override
    public void setEnvironment(CoffeeOS_API env) {
        environment = env;
    }

}
