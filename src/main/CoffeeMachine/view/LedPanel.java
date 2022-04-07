package main.CoffeeMachine.view;

import jdk.swing.interop.SwingInterOpUtils;
import main.CoffeeMachine.Listeners.PowerOnOffListener;
import main.CoffeeMachine.model.CMM_Util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static main.CoffeeMachine.model.CMM_Util.GREEN_LED;
import static main.CoffeeMachine.model.CMM_Util.RED_LED;

public class LedPanel extends JPanel implements PowerOnOffListener {
    private final JLabel redLed;
    private final JLabel greenLed;
//    private JLabel coffeeLED;
    private boolean isRunning;
//    private int coffeeVal;
    public LedPanel(){
        isRunning=false;
        redLed = new JLabel(CMM_Util.getInstance().loadImage(RED_LED));
        greenLed = new JLabel(CMM_Util.getInstance().loadImage(GREEN_LED));
        setLayout(new FlowLayout());
        add(redLed);
        add(greenLed);
        greenLed.setVisible(false);
        redLed.setVisible(true);
        setVisible(true);
    }

    public void changeState(){

        if(isRunning) {
            greenLed.setVisible(true);
            redLed.setVisible(false);
        }
        else {
            greenLed.setVisible(false);
            redLed.setVisible(true);
        }
    }

    @Override
    public void powerOnOff(int result) {
        if(result==0){
            isRunning = false;
        }
        else { isRunning = true; }
        changeState();
    }
}
