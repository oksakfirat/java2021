package game.business.abstracts;
import game.entities.concretes.Gamer;

public interface IGamerService {
	public void add(Gamer gamer);
	public void delete(Gamer gamer);
	public void update(Gamer gamer);

}
