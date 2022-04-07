package main.CoffeeMachine.Coffee;


import main.CoffeeMachine.CoffeeOS_API;

import javax.swing.*;
import java.util.List;

import static main.CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.MOCHA;

public class MochaCoffee extends AbstractCoffeeProgram {

    @Override
    public void makeCoffee() throws InterruptedException {
        startThread();
    }

    private void startThread() {
        SwingWorker swingWorker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                publish();
                environment.setTypeLED(MOCHA);
                environment.setGrinding(5);
                environment.setTemperature(200);
                environment.holdTemperature(5);
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
}
