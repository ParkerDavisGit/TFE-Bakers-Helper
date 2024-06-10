package com.parkeredavis.games.bakershelper;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.parkeredavis.games.bakershelper.gameobjects.GenericImage;
import com.parkeredavis.games.bakershelper.gameobjects.HasSprite;
import com.parkeredavis.games.bakershelper.gameobjects.Player;

import java.util.ArrayList;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class BakersHelper extends ApplicationAdapter {
    // System Stuff
    private SpriteBatch batch;

    // Game Objects
    Player player;

    // Arrays for various tasks
    ArrayList<HasSprite> drawList;

    @Override
    public void create()
    {
        // System Objects
        batch = new SpriteBatch();

        // Initializing Player
        player = new Player();

        // Draw List Test
        drawList = new ArrayList<HasSprite>();
        drawList.add(new GenericImage("libgdx", 100, 100));
        drawList.add(new GenericImage("libgdx", 10, 10));
        drawList.add(new GenericImage("libgdx", 300, 400));
        drawList.add(player);
    }

    @Override
    public void render()
    {
        Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        // BATCH BEGIN //
        for(HasSprite obj : drawList)
        {
            obj.draw(batch);
        }

        // BATCH END //
        batch.end();
    }

    @Override
    public void dispose()
    {
        batch.dispose();
        for(HasSprite obj : drawList)
        {
            obj.dispose();
        }
    }
}
