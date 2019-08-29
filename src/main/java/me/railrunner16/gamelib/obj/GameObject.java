package me.railrunner16.gamelib.obj;

import lombok.Getter;
import lombok.Setter;

import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Component;
import java.util.HashMap;

@Setter @Getter
public abstract class GameObject extends Rectangle {
    private HashMap<String, ImageIcon> sprites;
    private ImageIcon currentSprite;
    private boolean hidden = true;
    private String label;

    public GameObject(String label, int x, int y, int width, int height, HashMap<String, ImageIcon> sprites) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.label = label;

        this.sprites = sprites;
    }

    public GameObject(String label, int x, int y, HashMap<String, ImageIcon> sprites) {
        this(label, x, y, sprites.values().toArray(new ImageIcon[]{})[0].getIconWidth(), sprites.values().toArray(new ImageIcon[]{})[0].getIconHeight(), sprites);
    }

    public void show() {
        this.setHidden(false);
    }

    public void hide() {
        this.setHidden(true);
    }

    public void draw(Graphics g, Component c) {
        if (!this.isHidden()) {
            g.drawImage(this.currentSprite.getImage(), this.x, this.y, this.width, this.height, c);
        }
    }

    public void setSprite(String spriteKey) {
        this.setCurrentSprite(this.sprites.get(spriteKey));
    }

    public abstract void update();
}
