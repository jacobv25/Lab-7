package main.CoffeeMachine.Coffee;

import main.CoffeeMachine.CoffeeOS_API;
import lombok.Data;

import java.util.Date;

@Data
public abstract class AbstractCoffeeProgram implements CoffeeProgram_IF {
    protected Date executionDate; //when the program was executed.
    protected CoffeeOS_API environment;
}
