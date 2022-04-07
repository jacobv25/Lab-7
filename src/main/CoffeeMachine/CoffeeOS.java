package main.CoffeeMachine;

import main.CoffeeMachine.Coffee.CoffeeProgram_IF;
import main.CoffeeMachine.Listeners.PowerOnOffListener;
import main.CoffeeMachine.Orders.Order;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import static main.CoffeeMachine.model.CMM_Util.*;

public class CoffeeOS implements CoffeeOS_API{

    private CoffeeProgram_IF currentCoffeeProgram;
    private BigDecimal price;
    private List<Order> saleRecords;
    private List<PowerOnOffListener> listeners;

    public CoffeeOS(){
        saleRecords = new ArrayList<>();
        listeners = new ArrayList<>();
    }
    public void addListener(PowerOnOffListener toAdd) { listeners.add(toAdd);}
    public void setChosenCoffeeType(CoffeeProgram_IF.CoffeeType type) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String compiledClassLocation = new File(".").getCanonicalPath();
        System.out.println(compiledClassLocation);
        URL[] classPath = { new File(compiledClassLocation).toURI().toURL()};
        ClassLoader classLoader = new URLClassLoader(classPath);

        Class c = null;

        switch (type){
            case REGULAR:
                c = classLoader.loadClass("main.CoffeeMachine.Coffee.RegularCoffee");
                price = REGULAR;
                break;
            case MOCHA:
                c = classLoader.loadClass("main.CoffeeMachine.Coffee.MochaCoffee");
                price = MOCHA;
                break;
            case LATTE:
                c = classLoader.loadClass("main.CoffeeMachine.Coffee.LatteCoffee");
                price = LATTE;
                break;
            case CAPPUCCINO:
                c = classLoader.loadClass("main.CoffeeMachine.Coffee.CappuccinoCoffee");
                price = CAPPUCCINO;
                break;
            case ESPRESSO:
                price = ESPRESSO;
                c = classLoader.loadClass("CoffeeMachine.Coffee.EspressoCoffee");
                break;
        }
        currentCoffeeProgram = (CoffeeProgram_IF) c.newInstance();
        currentCoffeeProgram.setEnvironment(this);
    }
    public void addOrderToRecords(Order record) {
        saleRecords.add(record);
    }
    public BigDecimal getPrice(){
        return price;
    }
    public void setPrice(BigDecimal _price) {
        price = _price;
    }
    public void displayPrice(){
        System.out.println("Price=" + price);
    }
    public void start() throws InterruptedException {
        currentCoffeeProgram.makeCoffee();
        displayPrice();
    }
    public void addCondiment(BigDecimal condimentPrice) {
        price = new BigDecimal(price.floatValue() + condimentPrice.floatValue());
    }

    //region API
    @Override
    public void setGrinding(int sec) throws InterruptedException {
        System.out.println("Grinding for " + sec + "seconds.");
        Thread.sleep(sec*1000);
    }

    @Override
    public void holdTemperature(int sec) throws InterruptedException {
        System.out.println("Holding for " + sec + "seconds.");
        Thread.sleep(sec*1000);
    }

    @Override
    public void wait(int sec) throws InterruptedException {
        System.out.println("Waiting for " + sec + "seconds.");
        Thread.sleep(sec*1000);
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
            powerOnOffEventFired(0);
        }
        else {
            System.out.println("Power On.");
            powerOnOffEventFired(1);
        }
    }

    private void powerOnOffEventFired(int result){
        for(PowerOnOffListener listener: listeners){
            listener.powerOnOff(result);
        }
    }
    //endregion

    public void displayOrders() {
        for(Order order: saleRecords) {
            System.out.println(order);
        }
    }
}
