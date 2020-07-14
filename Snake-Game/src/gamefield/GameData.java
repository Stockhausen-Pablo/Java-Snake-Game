package gamefield;

import java.util.HashSet;
import java.util.Set;

import components.Particle;

public class GameData implements IGameData {
	
	private Set<IGameListener> gamelistener;

	
	public GameData() {

		gamelistener = new HashSet<>();
	}
	@Override
	public void addParticle(Particle p, int row, int col) {
		//field[row][col]
		//contracts.put(contract.getContractid(), contract);
		//contractlist.add(contract);
		
		for (IGameListener listener :gamelistener)
			listener.gameDataChanged();
	}

	@Override
	public void removeParticle(Particle p, int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGameListerner(IGameListener listener) {
		gamelistener.add(listener);
	}

	@Override
	public void removeGameListerner(IGameListener listener) {
		gamelistener.remove(listener);	
	}

}
