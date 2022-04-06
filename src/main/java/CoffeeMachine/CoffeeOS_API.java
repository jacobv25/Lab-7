package CoffeeMachine;

import CoffeeMachine.Coffee.CoffeeProgram_IF;

public interface CoffeeOS_API {
    void setGrinding(int sec);
    void holdTemperature(int sec);
    void wait(int sec);
    void setTypeLED(CoffeeProgram_IF.CoffeeType regular);
    void setTemperature(int degree);
    void setPowerLED(int val);
}
