package game;

import game.business.abstracts.ICampaignService;
import game.business.abstracts.IGameService;
import game.business.abstracts.IGamerService;
import game.business.concretes.CampaignManager;
import game.business.concretes.GameManager;
import game.business.concretes.GamerManager;
import game.core.concretes.MernisAdapter;
import game.dataAccess.concretes.GamerDao;
import game.entities.concretes.Campaign;
import game.entities.concretes.Game;
import game.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("fırat");
		gamer.setLastName("okşak");
		gamer.setEmail("Exsaple@gamil.com");
		gamer.setNationaltyId("2345677654");
		gamer.setDateOfBirth(1995);
		IGamerService gamerService = new GamerManager(new GamerDao(), new MernisAdapter());
		gamerService.add(gamer);

		Game game1 = new Game();
		game1.setGameName("Need For Speed");
		game1.setId(1);
		game1.setPrice(1000);
		IGameService game = new GameManager();
		game.add(game1);

		Campaign campaign = new Campaign();
		campaign.setDiscountPrice(10);
		ICampaignService campaignService = new CampaignManager();
		campaignService.Hesapla(campaign, game1);

		Game game2 = new Game();
		game2.setGameName("GTA");
		game2.setId(2);
		game2.setPrice(2000);
		IGameService gameService = new GameManager();
		gameService.add(game2);
		Campaign campaign2 = new Campaign();
		campaign2.setDiscountPrice(20);
		ICampaignService campaignService1 = new CampaignManager();
		campaignService1.Hesapla(campaign2, game2);

	}

}
