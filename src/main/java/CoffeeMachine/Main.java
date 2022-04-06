package CoffeeMachine;

import CoffeeMachine.Coffee.CoffeeProgram_IF;

import java.io.IOException;
import java.util.Scanner;

import static CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.REGULAR;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPowered = true;
        CoffeeOS os = new CoffeeOS();
        String input;

        while(isPowered) {
            System.out.println("press 1 to make regular coffee.");
            input = scanner.nextLine();
            while(!input.equals("1")){
                System.out.println("bad input: " + input +". press 1 to make regular coffee.");
                input = scanner.next();
            }
            switch (input){
                case "1":
                    try {
                        os.setChosenCoffeeType(REGULAR);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
            }
            isPowered = false;
        }
    }
}
