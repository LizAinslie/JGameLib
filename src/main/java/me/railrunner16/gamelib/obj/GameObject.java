package me.railrunner16.gamelib.obj;

import lombok.Getter;
import lombok.Setter;

import javax.swing.ImageIcon;
import java.awt.Rectangle;

@Setter
public class GameObject extends Rectangle {
    private ImageIcon img;
    @Getter private boolean hidden = true;

    public GameObject(ImageIcon img, int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        this.img = img;
    }

    public GameObject(ImageIcon img, int x, int y) {
        this(img, x, y, img.getIconWidth(), img.getIconHeight());
    }

    public void show() {
        this.
    }
}
