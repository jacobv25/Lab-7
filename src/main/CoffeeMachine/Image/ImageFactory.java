package main.CoffeeMachine.Image;

import javax.swing.*;

public class ImageFactory {

    private String path;


    public void setPath(String path) {
        this.path = path;
    }

    public ImageIcon loadImage() {
        try {
            return new ImageIcon(getClass().getResource(path));
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
