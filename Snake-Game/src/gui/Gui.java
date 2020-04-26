package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import gamefield.GameData;
import gamefield.IGameData;


public class Gui extends JFrame {
	
	private Gamefield gamefield;
	
	public Gui() {
		
		super("Snake");
		setLayout(new GridBagLayout());
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				IGameData gamedata = new GameData();
				
				gamefield = new Gamefield(gamedata);
				
				GridBagConstraints gc = new GridBagConstraints();
				gc.insets = new Insets(10, 10, 10, 10);
				gc.gridx = 1;
				gc.gridy = 1;
				gc.weightx = 2.0;
				gc.weighty = 1.0;
				gc.fill = GridBagConstraints.BOTH;

				getContentPane().add(gamefield, gc);
				pack();
				setLocationRelativeTo(null);
				setSize(900, 600);
				setVisible(true);
			}
		});
	}

	
	public static void main(String[] args) {
		Gui gui = new Gui(); 
	}
}
