package main.CoffeeMachine.Coffee;

import javax.swing.*;
import java.util.List;

import static main.CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.CAPPUCCINO;

public class CappuccinoCoffee extends AbstractCoffeeProgram {

    @Override
    public void makeCoffee() throws InterruptedException {
        startThread();
    }

    private void startThread() {
        SwingWorker swingWorker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                publish();
                environment.setTypeLED(CAPPUCCINO);
                environment.setGrinding(7);
                environment.setTemperature(200);
                environment.holdTemperature(4);
                environment.wait(10);
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
