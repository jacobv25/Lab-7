package main.CoffeeMachine;

import main.CoffeeMachine.Coffee.CoffeeProgram_IF;
import main.CoffeeMachine.Orders.Order;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import static main.CoffeeMachine.model.CMM_Util.*;

public class Coffee_OS_CLI implements CoffeeOS_API{

    private BigDecimal price;
    private List<Order> saleRecords;
    private CoffeeProgram_IF currentCoffeeProgram;

    public void addOrderToRecords(Order record) {
        saleRecords.add(record);
    }

    public Coffee_OS_CLI(){
        saleRecords = new ArrayList<>();
    }

    public void setChosenCoffeeType(CoffeeProgram_IF.CoffeeType type) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String compiledClassLocation = new File(".").getCanonicalPath();
        System.out.println(compiledClassLocation);
        URL[] classPath = { new File(compiledClassLocation).toURI().toURL()};
        ClassLoader classLoader = new URLClassLoader(classPath);

        Class c = null;

        switch (type){
            case REGULAR:
                c = classLoader.loadClass("main.CoffeeMachine.Coffee_CLI.RegularCoffee_CLI");
                price = REGULAR;
                break;
            case MOCHA:
                c = classLoader.loadClass("main.CoffeeMachine.Coffee_CLI.MochaCoffee_CLI");
                price = MOCHA;
                break;
            case LATTE:
                c = classLoader.loadClass("main.CoffeeMachine.Coffee_CLI.LatteCoffee_CLI");
                price = LATTE;
                break;
            case CAPPUCCINO:
                c = classLoader.loadClass("main.CoffeeMachine.Coffee_CLI.CappuccinoCoffee_CLI");
                price = CAPPUCCINO;
                break;
            case ESPRESSO:
                c = classLoader.loadClass("main.CoffeeMachine.Coffee_CLI.EspressoCoffee_CLI");
                price = ESPRESSO;
                break;
        }
        currentCoffeeProgram = (CoffeeProgram_IF) c.newInstance();
        currentCoffeeProgram.setEnvironment(this);
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

    public BigDecimal getPrice(){
        return price;
    }
    public void setPrice(BigDecimal _price) {
        price = _price;
    }

    public void displayOrders() {
        for(Order order: saleRecords) {
            System.out.println(order);
        }
    }
}
