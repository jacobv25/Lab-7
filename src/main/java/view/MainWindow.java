package view;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private CoffeeMenuComponent coffeeMenuComponent;
    private LedComponent ledComponent;
    private MakeButtonAndPriceLabelComponent makeButtonAndPriceLabelComponent;

    public MainWindow(){

        makeButtonAndPriceLabelComponent = new MakeButtonAndPriceLabelComponent();
        ledComponent = new LedComponent();
        coffeeMenuComponent = new CoffeeMenuComponent(makeButtonAndPriceLabelComponent.getPriceLabel());

        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);
        add(coffeeMenuComponent, BorderLayout.NORTH);
        add(ledComponent, BorderLayout.CENTER);
        add(makeButtonAndPriceLabelComponent, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new MainWindow()
        );
    }
}
