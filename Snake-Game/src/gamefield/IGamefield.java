package gamefield;

import components.Particle;
import snake.SnakeHead;

public interface IGamefield {

	public void addParticle(Particle particle);
	
	public void addSnakeHead(SnakeHead snakehead);
	
	public void removeParticle(Particle particle);
	
	public void addGamefieldListener(IGamefieldListener gamefieldlistener);
	
	public void removeGamefieldListener(IGamefieldListener gamefieldlistener);
	
	public int getStatus(int x, int y);
	
	public int getActiveOverall();
	
}
