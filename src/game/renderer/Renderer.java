package game.renderer;

import game.GameObject;

import java.awt.*;

public abstract class Renderer {
    abstract public void render(Graphics g, GameObject master);

    public static void main(String[] args) {
        Renderer renderer = new Renderer() {
            @Override
            public void render(Graphics g, GameObject master) {
                System.out.println("render");
            }
        };

        renderer.render(null, null);
    }
}
