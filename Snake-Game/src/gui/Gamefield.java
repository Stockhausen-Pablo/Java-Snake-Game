package gui;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import gamefield.GameData;
import gamefield.Gametablemodel;
import gamefield.IGamefield;

public class Gamefield extends JFrame {
	
	IGamefield igf;
	
	public Gamefield() {
		IGamefield gamedata = new GameData();
		JTable gamefield = new JTable(new Gametablemodel(gamedata));
		
		//Object rowData[] = { "Row1-Column1", "Row1-Column2", "Row1-Column3" };
		//Object columnNames[] = { "Column One", "Column Two", "Column Three" };

		//DefaultTableModel gamefieldmodel = new DefaultTableModel(32, 32);


		//gamefieldmodel.setValueAt("R", 2, 1);
		//gamefield.setModel(gamefieldmodel);
		
		
		int[][] p = new int[32][32];
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length; j++) {
				//System.out.println(p[i][j]);
			}
		}
		//System.out.println(p.length);

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
		//Test
		Gamefield gamefield = new Gamefield();
	}

}
