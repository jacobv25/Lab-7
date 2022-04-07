package main.CoffeeMachine.Image;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    private ImageIcon imageIcon;
    private JLabel label;

    public ImagePanel(ImageIcon imageIcon) {

        this.imageIcon = imageIcon;
        label = new JLabel(this.imageIcon);
        add(label);
    }

    @Override
    public Component add(Component component) {
        int size = getComponents().length;
        System.out.println("size=" + size);
        if(size != 0) {
            remove(size-1);
        }
        return super.add(component);
    }

}
