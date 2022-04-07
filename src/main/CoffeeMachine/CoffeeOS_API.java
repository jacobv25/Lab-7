package main.CoffeeMachine;

import main.CoffeeMachine.Coffee.CoffeeProgram_IF;

public interface CoffeeOS_API {
    void setGrinding(int sec) throws InterruptedException;
    void holdTemperature(int sec) throws InterruptedException;
    void wait(int sec) throws InterruptedException;
    void setTypeLED(CoffeeProgram_IF.CoffeeType regular);
    void setTemperature(int degree);
    void setPowerLED(int val);
}
