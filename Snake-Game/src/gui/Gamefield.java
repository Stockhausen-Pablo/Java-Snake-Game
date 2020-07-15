package gui;

import java.awt.Color;
import java.awt.Component;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import components.Particle;
import gamefield.GameData;
import gamefield.Gametablemodel;
import gamefield.IGamefield;

public class Gamefield extends JFrame {
	
	IGamefield igf;
	
	public Gamefield() {
		IGamefield gamedata = new GameData();
		DefaultTableCellRenderer color_particles = new DefaultTableCellRenderer();
		color_particles.setForeground(Color.red);
		
		
		
		gamedata.addParticle(new Particle(2, 10, Color.GREEN));
		gamedata.addParticle(new Particle(2, 11, Color.GREEN));
		gamedata.addParticle(new Particle(2, 12, Color.GREEN));
		
		JTable gamefield = new JTable(new Gametablemodel(gamedata)) {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int col) {
				Component comp = super.prepareRenderer(renderer, row, col);
				Object value = getModel().getValueAt(row, col);
				if (value.equals(1)) {
					comp.setBackground(Color.red);
				}else if (value.equals(2)) {
					comp.setBackground(Color.green);
				}else {
					comp.setBackground(Color.white);
				}				
				return comp;	
			}
		};
		
		Boolean running = true;
		while (running) {
			re
		}
		
		add(gamefield);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);

	}

	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

	public static void main(String[] args) {
		Gamefield gamefield = new Gamefield();
	}

}
