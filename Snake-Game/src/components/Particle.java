package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Particle {
	/** Position */
	private int x;
	private int y;;
	private Color color;

	public Particle(int x, int y, Color c) {
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
