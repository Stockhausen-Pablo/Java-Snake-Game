package gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import components.Particle;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Gui extends JFrame {

	private ArrayList<Particle> particles = new ArrayList<Particle>(500);

	private int x = 0;
	private int y = 0;
	private BufferStrategy bufferstrat = null;
	private Canvas render;

	public Gui() {

	}

	public static void main(String[] args) {
		Window window = new Window(450, 280, "Particles: ");
		Test
//		window.pollInput();
//		window.loop();
	}
}
