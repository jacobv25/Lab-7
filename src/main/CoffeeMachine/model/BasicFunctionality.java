package main.CoffeeMachine.model;

import main.CoffeeMachine.Coffee.CoffeeProgram_IF;

import java.io.IOException;

public interface BasicFunctionality {
    void setGrindingTime(int secs);
    void setTemperature(int degree);
    void holdTemperature(int seconds);
    void wait(int seconds);
    void setPowerLED (int num) throws IOException;
    void setTypeLED (int num);
    void displayPrice(CoffeeProgram_IF cf);
}
