package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;
import javax.swing.JTable;

import gamefield.CellRendererColor;
import gamefield.Field_tablemodel;
import gamefield.IGameData;

public class Gamefield extends JPanel {
	
	private JTable gamefield;
	
	public Gamefield(IGameData gamedata) {
		setLayout(new GridBagLayout());
		gamefield = new JTable(new Field_tablemodel(gamedata));
		
		//gamefield.getColumnModel().getColumn(getRandomNumberInRange(0, 32)).setCellRenderer(new CellRendererColor());	
		System.out.println(gamefield.getValueAt(10,10));
		GridBagConstraints gc = new GridBagConstraints();
		gc.weightx = 1.0;
		gc.weighty = 1.0;
		gc.fill = GridBagConstraints.BOTH;
		add(gamefield, gc);
	}
	
	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
