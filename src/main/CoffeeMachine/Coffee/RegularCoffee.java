package main.CoffeeMachine.Coffee;

import main.CoffeeMachine.CoffeeOS_API;

import javax.swing.*;
import java.util.List;

public class RegularCoffee extends AbstractCoffeeProgram{

    @Override
    public void makeCoffee() throws InterruptedException {
        startThread();
    }

    private void startThread() {
        SwingWorker swingWorker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                publish();
                environment.setTypeLED(CoffeeType.REGULAR);
                environment.setGrinding(8);
                environment.setTemperature(150);
                environment.holdTemperature(2);
                environment.wait(15);
                return null;
            }
            @Override
            protected void process(List chunks)
            {
                environment.setPowerLED(1);
            }

            @Override
            protected void done() {
                environment.setPowerLED(0);
            }
        };

        swingWorker.execute();
    }


    @Override
    public void setEnvironment(CoffeeOS_API env) {
        environment = env;
    }

}
