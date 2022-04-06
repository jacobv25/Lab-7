package CoffeeMachine.Coffee;

import CoffeeMachine.CoffeeOS_API;
import lombok.Data;

import java.math.BigDecimal;

@Data
public abstract class AbstractCoffeeProgram implements CoffeeProgram_IF {
    protected CoffeeOS_API environment;
}
