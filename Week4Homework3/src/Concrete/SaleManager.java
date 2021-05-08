package Concrete;

import Abstract.SaleService;
import Week4Homework3.Entities.Campaign;
import Week4Homework3.Entities.Game;
import Week4Homework3.Entities.Gamer;
import Week4Homework3.Entities.Sale;


public class SaleManager implements SaleService{



	@Override
	public void normalPrice(Game game, Gamer gamer, Sale sale) {
		System.out.println("M��teri: " + gamer.getName() + " " + gamer.getLastName());
		System.out.println("�r�n: " + game.getGameName());
		System.out.println("�r�n Fiyat�: " + game.getPrice());
		System.out.println("Sat�� Adedi: "+ sale.getSaleAmount());
		System.out.println("Toplam tutar: " + sale.getSaleAmount() * game.getPrice());
		
	}

	@Override
	public void campaignPrice(Game game, Gamer gamer, Sale sale, Campaign campaign) {
		System.out.println("M��teri: " + gamer.getName() + " " + gamer.getLastName());
		System.out.println("�r�n: " + game.getGameName());
		System.out.println("�r�n Fiyat�: " + game.getPrice());
		System.out.println("Sat�� Adedi: "+ sale.getSaleAmount());
		System.out.println("Kampanya Ad� ve Miktar�(%): " + campaign.getCampaignName() + " " + campaign.getDiscount());
		System.out.println("Toplam tutar: " + sale.getSaleAmount() * game.getPrice());
		System.out.println("�ndirimli tutar: " +((game.getPrice() * sale.getSaleAmount()) - ((game.getPrice() * sale.getSaleAmount())*campaign.getDiscount()) / 100 ));
		
	}

}
