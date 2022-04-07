package main.CoffeeMachine;

import main.CoffeeMachine.Orders.CoffeeOrder;
import lombok.SneakyThrows;

import java.math.BigDecimal;
import java.util.Scanner;

import static main.CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.CAPPUCCINO;
import static main.CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.ESPRESSO;
import static main.CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.LATTE;
import static main.CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.MOCHA;
import static main.CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.REGULAR;
import static main.CoffeeMachine.model.CMM_Util.*;


public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPowered = true;
        Coffee_OS_CLI os = new Coffee_OS_CLI();
        String input;
        boolean condition;
        CoffeeOrder newCoffeeOrder;
        Long id = 0L;
        String name = "Coffee";
        BigDecimal price;
        String description = " ";


        while(isPowered) {
            System.out.println("enter 1 for regular coffee.\n" +
                    "enter 2 for Mocha coffee.\n" +
                    "enter 3 for Latte coffee.\n" +
                    "enter 4 for Cappuccino coffee.\n" +
                    "enter 5 for Espresso coffee.\n" +
                                "enter enter 'x' when done.");
            input = scanner.nextLine();
            while(!input.equals("1") & !input.equals("2") & !input.equals("3") &
                    !input.equals("4")
                    & !input.equals("5") && !input.equalsIgnoreCase("x")){
                System.out.println("bad input: " + input);
                System.out.println("enter 1 for regular coffee.\n" +
                        "enter 2 for Mocha coffee.\n" +
                        "enter 3 for Latte coffee.\n" +
                        "enter 4 for Cappuccino coffee.\n" +
                        "enter 5 for Espresso coffee.\n" +
                        "enter 'd' when done.\n" +
                        "enter 'x' to exit.");
                input = scanner.next();
            }
            switch (input){
                case "1":
                    os.setChosenCoffeeType(REGULAR);
                    description = "Regular Coffee\n";
                    break;
                case "2":
                    os.setChosenCoffeeType(MOCHA);
                    description = "Mocha Coffee\n";
                    break;
                case "3":
                    os.setChosenCoffeeType(LATTE);
                    description = "Latte Coffee\n";
                    break;
                case "4":
                    os.setChosenCoffeeType(CAPPUCCINO);
                    description = "Cappuccino Coffee\n";
                    break;
                case "5":
                    os.setChosenCoffeeType(ESPRESSO);
                    description = "Espresso Coffee\n";
                    break;
                case "d":
                    break;
                case "x":
                    os.displayOrders();
                    System.exit(0);
            }
            condition = true;
            while(condition) {
                System.out.println("Enter 1 for creme, 2 for Vanilla, 3 for Chocolate\nEnter 'd' when done.\nEnter 'x to exit");
                input = scanner.nextLine();
                while (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equalsIgnoreCase("d") && !input.equalsIgnoreCase("x")) {
                    System.out.println("bad input: " + input);
                    System.out.println("Enter 1 for creme, 2 for Vanilla, 3 for Chocolate\nEnter 'd' when done.\nEnter 'x to exit");
                    input = scanner.next();
                }
                switch (input) {
                    case "1":
                        os.addCondiment(VANILLA);
                        description = description + "\t+1 Vanilla\n";
                        break;
                    case "2":
                        os.addCondiment(CREAM);
                        description = description + "\t+1 Cream\n";
                        break;
                    case "3":
                        os.addCondiment(CHOCOLATE);
                        description = description + "\t+1 Chocolate\n";
                        break;
                    case "d":
                        condition = false;
                        break;
                    case "x":
                        os.displayOrders();
                        System.exit(0);
                }
            }
            price = os.getPrice();
            newCoffeeOrder = new CoffeeOrder();
            newCoffeeOrder.setId(id);
            newCoffeeOrder.setName(name);
            newCoffeeOrder.setPrice(price);
            newCoffeeOrder.setDescription(description);
            os.addOrderToRecords(newCoffeeOrder);
            os.start();
//            isPowered = false;
        }
    }
}
