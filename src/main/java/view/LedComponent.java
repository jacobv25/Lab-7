package view;

import javax.swing.*;
import java.awt.*;

public class LedComponent extends JPanel {
    private JLabel runningLED;
    private JLabel coffeeLED;
    private int runningVal;
    private int coffeeVal;
    public LedComponent(){
        runningVal=0;
        coffeeVal=0;
        runningLED = new JLabel("RUNNING=" + runningVal);
        coffeeLED = new JLabel("COFFEE=  " + coffeeVal);
        setLayout(new FlowLayout());
        add(runningLED);
        add(coffeeLED);
        setVisible(true);
    }
}
