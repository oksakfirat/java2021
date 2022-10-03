package game.dataAccess.abstracts;

import game.entities.concretes.Game;

public interface IGameDao {
	void add(Game game);
	void delete(Game game); 

}
