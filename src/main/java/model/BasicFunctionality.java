package model;

import java.io.IOException;

public interface BasicFunctionality {
    void setGrindingTime(int secs);
    void setTemperature(int degree);
    void holdTemperature(int seconds);
    void wait(int seconds);
    void setPowerLED (int num) throws IOException;
    void setTypeLED (int num);
    void displayPrice(Coffee_IF cf);
}
