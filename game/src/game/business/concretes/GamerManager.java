package game.business.concretes;

import game.business.abstracts.IGamerService;
import game.core.abstracts.IMernisAdapter;
import game.dataAccess.abstracts.IGamerDao;
import game.entities.concretes.Gamer;

public class GamerManager implements IGamerService {

	IMernisAdapter mernisAdapter;

	IGamerDao gamerDao;

	public GamerManager(IGamerDao gamerDao, IMernisAdapter mernisAdapter) {
		this.mernisAdapter = mernisAdapter;
		this.gamerDao = gamerDao;

	}

	@Override
	public void add(Gamer gamer) {
		if (mernisAdapter.kimlikdogrulama(gamer)) {
			gamerDao.add(gamer);

		} else {
			System.out.println("Hatalı veri girişi yapıldı");
		}

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
