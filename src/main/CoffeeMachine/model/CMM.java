package main.CoffeeMachine.model;

import main.CoffeeMachine.Coffee.CoffeeProgram_IF;

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

    
    /**
	 * it displays which type of order is displayed
	 * 0 serves as No order selected
	 * 1.0 for regular coffee
	 * 2.0 for Mocha
	 * 3.0 for Latte
	 * 4.0 for Espresso
	 * 5.0 for Cappuccino
	 * @param num the selected order
	 */
	@Override
	public void setTypeLED(int num) {
//		this.type = num;
//		displayLED();
	}

    @Override
    public void displayPrice(CoffeeProgram_IF cf) {

    }
}
