package gamefield;

import java.util.HashSet;
import java.util.Set;

import components.Particle;
import snake.SnakeHead;

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

	@Override
	public int getActiveOverall() {
		int sum = 0;
		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < 32; j++) {
				sum = sum + playfield[i][j];
			}
		}
		return sum;
	}

	@Override
	public void addSnakeHead(SnakeHead snakehead) {
		playfield[snakehead.getX()][snakehead.getY()] = 2;
	}

}
