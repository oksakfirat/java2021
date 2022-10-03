package game.business.concretes;

import game.business.abstracts.ICampaignService;
import game.entities.concretes.Campaign;
import game.entities.concretes.Game;

public class CampaignManager implements ICampaignService {

	@Override
	public void Hesapla(Campaign campaign,Game game) {
		System.out.println(game.getGameName()+ " "+"İndirimsiz Fiyatı: "+game.getPrice());
		System.out.println("indirim oranı yüzde "+campaign.getDiscountPrice()+ " uygulanmıştır.");
		double indirim=game.getPrice()-(game.getPrice()*campaign.getDiscountPrice())/100;
		System.out.println("İndirimli Fiyat "+indirim);
		
	}

	

}
