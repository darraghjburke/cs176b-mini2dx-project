package com.mystudio.gamename;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import org.mini2Dx.core.game.BasicGame;
import org.mini2Dx.core.graphics.Graphics;

public class MyMini2DxGame extends BasicGame {
	public static final String GAME_IDENTIFIER = "com.mystudio.gamename";

  private Texture texture;
  private float x,y;
	
	@Override
    public void initialise() {
      texture = new Texture("cs_logo.jpg");
      x = 0;
      y = 50;
    }
    
    @Override
    public void update(float delta) {
      if (Gdx.input.isKeyPressed(Keys.DPAD_RIGHT)) {
        x += delta * 300;
      }
      if (Gdx.input.isKeyPressed(Keys.DPAD_LEFT)) {
        x -= delta * 300;
      }
      if (Gdx.input.isKeyPressed(Keys.DPAD_UP)) {
        y -= delta * 300;
      }
      if (Gdx.input.isKeyPressed(Keys.DPAD_DOWN)) {
        y += delta * 300;
      }
    }
    
    @Override
    public void interpolate(float alpha) {
    
    }
    
    @Override
    public void render(Graphics g) {
        //g.drawTexture(texture, 0f, 0f);
        g.setColor(Color.WHITE);
        g.setLineHeight(1);
        g.drawRect(x, y, 128, 128);
    }
}
