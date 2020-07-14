package gamefield;

import java.util.HashSet;
import java.util.Set;

import components.Particle;

public class GameData implements IGamefield {
	
	int[][] playfield;
	private Set<IGamefieldListener> listeners;
	
	public GameData() {
		playfield = new int[32][32];
		listeners = new HashSet<>();
	}
	
	
	@Override
	public void addParticle(Particle particle) {
		playfield[particle.getX()][particle.getY()] = 1;
	}

	@Override
	public void removeParticle(Particle particle) {
		playfield[particle.getX()][particle.getY()] = 0;
	}

	@Override
	public void addGamefieldListener(IGamefieldListener gamefieldlistener) {
		listeners.add(gamefieldlistener);
	}

	@Override
	public void removeGamefieldListener(IGamefieldListener gamefieldlistener) {
		listeners.remove(gamefieldlistener);
	}
	
	public int getStatus(int x, int y) {
		return playfield[x][y]; 
	}

}
