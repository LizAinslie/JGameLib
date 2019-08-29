package me.railrunner16.gamelib.obj;

import javax.swing.ImageIcon;

public class LivingObject extends GameObject {
    private boolean alive = true;

    public LivingObject(ImageIcon img) {
        super(img, 0, 0);
    }
}
