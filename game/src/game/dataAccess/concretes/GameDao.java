package game.dataAccess.concretes;

import game.dataAccess.abstracts.IGameDao;
import game.entities.concretes.Game;

public class GameDao implements IGameDao{

	@Override
	public void add(Game game) {
		System.out.println("Oyun Eklendi..."+ game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}



}
