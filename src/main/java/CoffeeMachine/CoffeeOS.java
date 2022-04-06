package CoffeeMachine;

import CoffeeMachine.Coffee.CoffeeProgram_IF;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class CoffeeOS implements CoffeeOS_API{

    private CoffeeProgram_IF currentCoffeeProgram;

    public CoffeeOS(){}

    public void setChosenCoffeeType(CoffeeProgram_IF.CoffeeType type) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String compiledClassLocation = new File(".").getCanonicalPath();
        System.out.println(compiledClassLocation);
        URL[] classPath = { new File(compiledClassLocation).toURI().toURL()};
        ClassLoader classLoader = new URLClassLoader(classPath);

        Class c = null;

        switch (type){
            case REGULAR:
                c = classLoader.loadClass("CoffeeMachine.Coffee.RegularCoffeeProgram");
                break;
            case MOCHA:
                c = classLoader.loadClass("CoffeeMachine.Coffee.MochaCoffee");
                break;
            case LATTE:
                c = classLoader.loadClass("CoffeeMachine.Coffee.LatteCoffee");
                break;
            case CAPPUCCINO:
                c = classLoader.loadClass("CoffeeMachine.Coffee.CappuccinoCoffee");
                break;
            case ESPRESSO:
                c = classLoader.loadClass("CoffeeMachine.Coffee.EspressoCoffee");
                break;
        }
        currentCoffeeProgram = (CoffeeProgram_IF) c.newInstance();
        currentCoffeeProgram.setEnvironment(this);
        currentCoffeeProgram.makeCoffee();
    }

    @Override
    public void setGrinding(int sec) {
        System.out.println("Grinding for " + sec + "seconds.");
    }

    @Override
    public void holdTemperature(int sec) {
        System.out.println("Holding for " + sec + "seconds.");
    }

    @Override
    public void wait(int sec) {
        System.out.println("Waiting for " + sec + "seconds.");
    }

    @Override
    public void setTypeLED(CoffeeProgram_IF.CoffeeType type) {
        System.out.println(type + " coffee was chosen.");
    }

    @Override
    public void setTemperature(int degree) {
        System.out.println("Temperature set to " + degree + "F");
    }

    @Override
    public void setPowerLED(int val) {
        if(val ==0){
            System.out.println("Power Off.");
        }
        else {
            System.out.println("Power On.");
        }
    }
}
