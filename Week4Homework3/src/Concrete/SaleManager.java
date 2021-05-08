package Concrete;

import Abstract.SaleService;
import Week4Homework3.Entities.Campaign;
import Week4Homework3.Entities.Game;
import Week4Homework3.Entities.Gamer;
import Week4Homework3.Entities.Sale;


public class SaleManager implements SaleService{



	@Override
	public void normalPrice(Game game, Gamer gamer, Sale sale) {
		System.out.println("Müþteri: " + gamer.getName() + " " + gamer.getLastName());
		System.out.println("Ürün: " + game.getGameName());
		System.out.println("Ürün Fiyatý: " + game.getPrice());
		System.out.println("Satýþ Adedi: "+ sale.getSaleAmount());
		System.out.println("Toplam tutar: " + sale.getSaleAmount() * game.getPrice());
		
	}

	@Override
	public void campaignPrice(Game game, Gamer gamer, Sale sale, Campaign campaign) {
		System.out.println("Müþteri: " + gamer.getName() + " " + gamer.getLastName());
		System.out.println("Ürün: " + game.getGameName());
		System.out.println("Ürün Fiyatý: " + game.getPrice());
		System.out.println("Satýþ Adedi: "+ sale.getSaleAmount());
		System.out.println("Kampanya Adý ve Miktarý(%): " + campaign.getCampaignName() + " " + campaign.getDiscount());
		System.out.println("Toplam tutar: " + sale.getSaleAmount() * game.getPrice());
		System.out.println("Ýndirimli tutar: " +((game.getPrice() * sale.getSaleAmount()) - ((game.getPrice() * sale.getSaleAmount())*campaign.getDiscount()) / 100 ));
		
	}

}
