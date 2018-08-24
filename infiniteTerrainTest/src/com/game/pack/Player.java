package com.game.pack;

public class Player {

	private int posX;
	private int posY;
	
	public Player(int posX, int posY) {
		this.setPosX(posX);
		this.setPosY(posY);
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
}
