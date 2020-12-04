package br.com.devmos.pacman.model;

import java.awt.image.BufferedImage;

public class Player extends Entity {
	public boolean right;
	public boolean up;
	public boolean left;
	public boolean down;
	
	public Player(int x, int y, int width, int height, int speed, BufferedImage sprite) {
		super(x, y, width, height, speed, sprite);
	}
	
	public void update() {
		
	}
	
	public void render() {
		
	}
}
