package gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;


public class Gui extends JFrame {
	
	private BufferedImage buffer;
	
	public Gui() {

	}
	
	@Override
	public void paint(Graphics g) {
		Dimension dim = getContentPane().getSize();
		
		//Graphics2D g2 = (Graphics2D) g;
		
		if (buffer == null ||
				buffer.getWidth() != dim.width ||
				buffer.getHeight() != dim.height) {
				buffer = new BufferedImage(dim.width, dim.height, BufferedImage.TYPE_4BYTE_ABGR_PRE);
		}
			
		
		Graphics2D g2 = buffer.createGraphics();
		g2.setColor(Color.RED);
		
		g2.scale(dim.getWidth(), dim.height);
		g2.fillRect(0, 0, dim.width, dim.height);
		
		g.drawImage(buffer, 0, getSize().height - dim.height, null);
		
	}
	
	public static void main(String[] args) {
		Gui gui = new Gui();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(600,600);
		gui.setVisible(true);
		Runnable r = new Runnable() {
			public void run() {
				gui.repaint();
			}
		};
		while(true) {
			SwingUtilities.invokeLater(r);
			try {
				Thread.sleep(16);
			} catch (InterruptedException e) {
			}
		}
	}
}
