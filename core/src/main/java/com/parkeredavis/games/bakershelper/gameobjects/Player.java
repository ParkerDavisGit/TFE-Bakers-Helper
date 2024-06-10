package com.parkeredavis.games.bakershelper.gameobjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player extends HasSprite {
    // Random Variables
    int x;
    int y;

    public Player() {
        super("player");

        x = 10;
        y = 350;
    }

    public void draw(SpriteBatch batch) {
        batch.draw(images.get(0), x, y);
    }
}
