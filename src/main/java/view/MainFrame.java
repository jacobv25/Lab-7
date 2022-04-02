package view;

import controller.CoffeeMenuController;

import javax.swing.*;
import java.awt.*;
import java.util.PrimitiveIterator;

public class MainFrame extends JFrame {

    private CoffeeMenu coffeeMenu;
    private LedComponent ledComponent;
    private SouthernComponent southernComponent;

    public MainFrame(){

        southernComponent = new SouthernComponent();
        ledComponent = new LedComponent();
        coffeeMenu = new CoffeeMenu(southernComponent.getPriceLabel());

        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);
        add(coffeeMenu, BorderLayout.NORTH);
        add(ledComponent, BorderLayout.CENTER);
        add(southernComponent, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new MainFrame()
        );
    }
}
