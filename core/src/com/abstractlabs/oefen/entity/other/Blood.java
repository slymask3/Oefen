package com.abstractlabs.oefen.entity.other;

import com.abstractlabs.oefen.Assets;
import com.abstractlabs.oefen.Map;
import com.abstractlabs.oefen.entity.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;

public class Blood extends Entity {
	private float r, g, b;
    private int tick;
    private float state;
	
	public Blood(float x, float y, float r, float g, float b, Map map) {
		super(null, x, y, 0, 0, map, null, 0, 0, 0);
		this.r = r;
		this.g = g;
		this.b = b;
		this.tick = 50;
		this.state = 0;
	}
	
	@Override
    public void draw(Batch batch, float alpha){
    	state += Gdx.graphics.getDeltaTime();
        batch.setColor(r, g, b, 1);
        batch.draw(Assets.blood.getKeyFrame(state, 1), x, y, 32, 32);
        batch.setColor(1, 1, 1, 1);
        System.out.println("state == "+state);
    }
    
    @Override
    public void act(float delta){
    	tick--;
    	
    	if(tick <= 0) {
    		this.getParent().removeActor(this);
    	}
    }
}