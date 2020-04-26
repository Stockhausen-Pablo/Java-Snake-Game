package gamefield;

import components.Particle;

public interface IGameData {
	
	public void addParticle(Particle p, int row, int col);
	
	public void removeParticle(Particle p, int row, int col);
	
	public void addGameListerner(IGameListener gamelistener);
	
	public void removeGameListerner(IGameListener gamelistener);
	
}
