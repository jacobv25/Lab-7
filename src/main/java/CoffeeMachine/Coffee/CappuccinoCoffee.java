package CoffeeMachine.Coffee;

import CoffeeMachine.CoffeeOS_API;

import static CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.CAPPUCCINO;

public class CappuccinoCoffee extends AbstractCoffeeProgram {

    @Override
    public void makeCoffee() {
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
