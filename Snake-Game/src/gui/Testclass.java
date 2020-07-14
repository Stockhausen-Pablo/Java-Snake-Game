package gui;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Testclass extends JFrame {
	
	public Testclass() {
		JTable t = new JTable();
		Object rowData[] = { "Row1-Column1", "Row1-Column2", "Row1-Column3" };

		Object columnNames[] = { "Column One", "Column Two", "Column Three" };
		DefaultTableModel model = new DefaultTableModel(32, 32);
		model.setValueAt("test", 2, 1);
		t.setModel(model);
		
		int[][] p = new int[32][32];
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length; j++) {
				System.out.println(p[i][j]);
			}
		}
		System.out.println(p.length);
		
		add(t);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Testclass t = new Testclass();
	}
}
