package model;

import lombok.Data;

@Data
public abstract class AbstractCoffee implements Coffee_IF {
    private Long id;
    private String name;
    private String price;
    private float remaining;
}
