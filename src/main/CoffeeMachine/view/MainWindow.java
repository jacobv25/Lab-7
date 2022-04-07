package main.CoffeeMachine.view;

import main.CoffeeMachine.CoffeeOS;
import main.CoffeeMachine.controller.CoffeeMenuController;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private CoffeeMenuPanel coffeeMenuPanel;
    private LedPanel ledPanel;
    private MakeButtonAndPriceLabelPanel makeButtonAndPriceLabelPanel;
    private CoffeeMenuController controller;
    private CoffeeOS os;

    public MainWindow(){

        os = new CoffeeOS();
        makeButtonAndPriceLabelPanel = new MakeButtonAndPriceLabelPanel();
        ledPanel = new LedPanel();

        coffeeMenuPanel = new CoffeeMenuPanel();
        controller = new CoffeeMenuController();
        controller.addListener(makeButtonAndPriceLabelPanel);
        controller.setOS(os);
        controller.setPriceLabel(makeButtonAndPriceLabelPanel.getPriceLabel());

        coffeeMenuPanel.addActionListeners(controller);
        os.addListener(ledPanel);

        makeButtonAndPriceLabelPanel.setController(controller);
        makeButtonAndPriceLabelPanel.addActionListener(controller);

        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);

        add(coffeeMenuPanel, BorderLayout.NORTH);
        add(ledPanel, BorderLayout.EAST);
        add(makeButtonAndPriceLabelPanel, BorderLayout.CENTER);

        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new MainWindow()
        );
    }


}
