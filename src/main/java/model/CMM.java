package model;

import java.io.IOException;

public class CMM implements BasicFunctionality{

    private float grinding;
    private boolean isPowered;

    @Override
    public void setGrindingTime(int secs) {
        grinding = secs;
    }

    @Override
    public void setTemperature(int degree) {

    }

    @Override
    public void holdTemperature(int seconds) {

    }

    @Override
    public void wait(int seconds) {

    }

    /**
     * @param num Must be value 0 or 1, else exception is thrown
     * @throws IOException
     */
    @Override
    public void setPowerLED(int num) throws IOException {
        if(num == 0){
            isPowered = false;
        }
        else if (num == 1){
            isPowered = true;
        }
        else {
            throw new IOException("Argument must be either 0 (power off) or 1 (power on).");
        }
    }

    @Override
    public void setTypeLED(int num) {

    }

    @Override
    public void displayPrice(Coffee_IF cf) {

    }
}
