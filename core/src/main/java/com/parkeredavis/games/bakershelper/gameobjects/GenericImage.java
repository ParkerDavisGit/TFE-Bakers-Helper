package com.parkeredavis.games.bakershelper.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GenericImage extends HasSprite
{
    // Class Variables
    private int x;
    private int y;

    public GenericImage(String imageName, int new_x, int new_y)
    {
        // Piping this up to HasSprite
        super(imageName);

        // Other variable assignments
        x = new_x;
        y = new_y;
    }

    public void draw(SpriteBatch batch)
    {
        batch.draw(images.get(0), x, y);
    }
}
