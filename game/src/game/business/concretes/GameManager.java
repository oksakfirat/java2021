package game.business.concretes;

import game.business.abstracts.IGameService;
import game.entities.concretes.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
	
		System.out.println("Oyun Eklendi..."+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}

}
