package CoffeeMachine.view;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private CoffeeMenuPanel coffeeMenuPanel;
    private LedPanel ledPanel;
    private MakeButtonAndPriceLabelPanel makeButtonAndPriceLabelPanel;

    public MainWindow(){

        makeButtonAndPriceLabelPanel = new MakeButtonAndPriceLabelPanel();
        ledPanel = new LedPanel();
        coffeeMenuPanel = new CoffeeMenuPanel(makeButtonAndPriceLabelPanel.getPriceLabel());

        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);
        add(coffeeMenuPanel, BorderLayout.NORTH);
        add(ledPanel, BorderLayout.CENTER);
        add(makeButtonAndPriceLabelPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new MainWindow()
        );
    }


}
