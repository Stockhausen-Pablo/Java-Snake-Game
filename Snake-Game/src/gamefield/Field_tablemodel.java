package gamefield;

import java.awt.Color;

import javax.swing.table.AbstractTableModel;

public class Field_tablemodel extends AbstractTableModel {

	private IGameData gamedata;
	
	private CellRendererColor cellr;
	
	private static String[] COLUMN_TITLES = new String[32];

	public Field_tablemodel(IGameData g) {
		this.gamedata = g;
		gamedata.addGameListerner(new IGameListener() {
			@Override
			public void gameDataChanged() {
				fireTableStructureChanged();
			}
		});
	}
	@Override
	public int getRowCount() {
		return 32;
	}

	@Override
	public int getColumnCount() {
		return 32;
	}

	@Override
	public Object getValueAt(int row, int col) {
		Object ret = null;
		for (int i = 0; i < row; i++) {
			//ret =0;
		}
		/*
		switch (col) {
		case 0:
			ret = 1;
			break;
		case 1:
			ret = 2;
			break;
		case 2:
			ret =3;
			break;
		case 3:
			ret = 4;
			break;
		case 4:
			ret = 5;
			break;
		}
		*/
		return ret;
	}

	@Override
	public boolean isCellEditable(int row, int col) {
		return false;
	}

	@Override
	public String getColumnName(int column) {
		return COLUMN_TITLES[column];
	}

}
