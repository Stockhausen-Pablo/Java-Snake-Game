package gamefield;

import javax.swing.table.AbstractTableModel;

public class Gametablemodel extends AbstractTableModel {

	private IGamefield gamefield;
	
	public Gametablemodel(IGamefield Gamefield) {
		this.gamefield = Gamefield;
		gamefield.addGamefieldListener(new IGamefieldListener() {
			
			@Override
			public void ParticlesChanged() {
				fireTableStructureChanged();
			}
		});
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 32;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 32;
	}

	@Override
	public Object getValueAt(int row, int col) {
		Object ret = null;
		ret = gamefield.getStatus(row, col);
		return ret;
	}

}
