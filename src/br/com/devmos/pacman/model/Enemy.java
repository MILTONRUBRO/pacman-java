package br.com.devmos.pacman.model;

import java.awt.Graphics;

public class Enemy {
	
	private double x;
	private double y;
	private static int WIDTH = 40;
	private static int HEIGHT = 5;

	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void update() {
		
	}
	
	public void render(Graphics graphics) {

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static int getWIDTH() {
		return WIDTH;
	}

	public static void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}

	public static int getHEIGHT() {
		return HEIGHT;
	}

	public static void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}
	
}