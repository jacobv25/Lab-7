package main.CoffeeMachine.Coffee_CLI;

import main.CoffeeMachine.Coffee.AbstractCoffeeProgram;
import main.CoffeeMachine.CoffeeOS_API;

import static main.CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.ESPRESSO;

public class EspressoCoffee_CLI extends AbstractCoffeeProgram {

    @Override
    public void makeCoffee() throws InterruptedException {
        environment.setPowerLED(1);
        environment.setTypeLED(ESPRESSO);
        environment.setGrinding(6);
        environment.setTemperature(200);
        environment.holdTemperature(7);
        environment.wait(14);
        environment.setPowerLED(0);

    }

    @Override
    public void setEnvironment(CoffeeOS_API env) {
        environment = env;
    }

}
