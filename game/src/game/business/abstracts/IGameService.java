package game.business.abstracts;

import game.entities.concretes.Game;

public interface IGameService {
	public void add(Game game);
	public void delete(Game game);

}
