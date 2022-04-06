package CoffeeMachine.Coffee;

import CoffeeMachine.CoffeeOS_API;

import static CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.MOCHA;

public class MochaCoffee extends AbstractCoffeeProgram {

    @Override
    public void makeCoffee() {
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