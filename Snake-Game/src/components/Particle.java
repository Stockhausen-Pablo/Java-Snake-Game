package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Particle {
	/** Position */
	private int x;
	private int y;;
	private Color color;

	public void render(Graphics g) {
		Graphics2D g2d = (Graphics2D) g.create();

		g2d.setColor(color);
		//g2d.fillRect(x - (size / 2), y - (size / 2), size, size);

		g2d.dispose();
	}

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
