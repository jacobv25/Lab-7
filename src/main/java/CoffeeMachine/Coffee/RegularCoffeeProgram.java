package CoffeeMachine.Coffee;

import CoffeeMachine.CoffeeOS_API;

import static CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.REGULAR;

public class RegularCoffeeProgram extends AbstractCoffeeProgram{

    @Override
    public void makeCoffee() {
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
