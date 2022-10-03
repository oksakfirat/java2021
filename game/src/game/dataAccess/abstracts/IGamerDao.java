package game.dataAccess.abstracts;
import game.entities.concretes.Gamer;

public interface IGamerDao {
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);

}
