package main.CoffeeMachine.Orders;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class CoffeeOrder extends Order{
    private String description;
}
