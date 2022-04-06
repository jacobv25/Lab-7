package CoffeeMachine;

import CoffeeMachine.Coffee.CoffeeProgram_IF;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import static CoffeeMachine.Coffee.CoffeeProgram_IF.CoffeeType.REGULAR;
import static CoffeeMachine.model.CMM_Util.VANILLA;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPowered = true;
        CoffeeOS os = new CoffeeOS();
        String input;

        while(isPowered) {
            System.out.println("enter 1 to make regular coffee. enter 'x' when done.");
            input = scanner.nextLine();
            while(!input.equals("1") && !input.equalsIgnoreCase("x")){
                System.out.println("bad input: " + input +". press 1 to make regular coffee. enter 'x' to exit.");
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
                    break;
                case "x":
                    System.exit(0);
            }

            System.out.println("enter 1 to add creme. enter 'x' when done.");
            input = scanner.nextLine();
            while(!input.equals("1") && !input.equalsIgnoreCase("x")){
                System.out.println("bad input: " + input +". press 1 to add creme. enter 'x' to exit.");
                input = scanner.next();
            }
            switch (input){
                case "1":
                    os.addCondiment(VANILLA);
                    break;
                case "x":
                    System.exit(0);
            }

            os.start();

            isPowered = false;
        }
    }
}
