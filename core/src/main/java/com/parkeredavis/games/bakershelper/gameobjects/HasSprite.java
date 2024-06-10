package com.parkeredavis.games.bakershelper.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class HasSprite {
    protected ArrayList<Texture> images;

    public HasSprite(String imageName) {
        images = new ArrayList<Texture>();
        images.add(new Texture(imageName.concat(".png")));
    }

    public void draw(SpriteBatch batch) {
        System.out.println("BASE DRAW CALLED - DRAW METHOD NOT RE-DEFINED");
    }

    public void dispose() {
        for (Texture img : images) {
            img.dispose();
        }
    }
}
