package me.railrunner16.gamelib.obj;

import javax.swing.ImageIcon;
import java.util.HashMap;

public abstract class LivingObject extends GameObject {
    private boolean alive = true;

    public LivingObject(HashMap<String, ImageIcon> sprites) {
        super("", 0, 0, sprites);
    }

    public void kill() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;

        this.alive = false;
    }
}
