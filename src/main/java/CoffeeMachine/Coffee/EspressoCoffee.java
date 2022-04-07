package CoffeeMachine.Coffee;

import CoffeeMachine.CoffeeOS_API;

import static CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.ESPRESSO;

public class EspressoCoffee extends AbstractCoffeeProgram {

    @Override
    public void makeCoffee() {
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
