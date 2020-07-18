package snake;

import java.awt.Color;

public class SnakeHead {

	private int x;
	private int y;;
	private Color color;
	
	public SnakeHead(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.color = c;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
}
