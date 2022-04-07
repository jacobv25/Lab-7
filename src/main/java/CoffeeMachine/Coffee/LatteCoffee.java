package CoffeeMachine.Coffee;

import CoffeeMachine.CoffeeOS_API;

import static CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.LATTE;

public class LatteCoffee extends AbstractCoffeeProgram {

    @Override
    public void makeCoffee() {
        environment.setPowerLED(1);
        environment.setTypeLED(LATTE);
        environment.setGrinding(4);
        environment.setTemperature(200);
        environment.holdTemperature(4);
        environment.wait(12);
        environment.setPowerLED(0);

    }

    @Override
    public void setEnvironment(CoffeeOS_API env) {
        environment = env;
    }

}
