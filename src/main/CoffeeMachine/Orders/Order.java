package main.CoffeeMachine.Orders;

import lombok.Data;

import java.math.BigDecimal;

@Data
public abstract class Order {
    private Long id;
    private String name;
    private BigDecimal price;
}
