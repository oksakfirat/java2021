package game.dataAccess.concretes;

import game.dataAccess.abstracts.IGamerDao;
import game.entities.concretes.Gamer;


public class GamerDao implements IGamerDao {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu Eklendi: "+ gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	

	

}
