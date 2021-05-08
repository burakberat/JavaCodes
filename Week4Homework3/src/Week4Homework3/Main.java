package Week4Homework3;


import Concrete.CampaignManager;
import Concrete.CheckManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Week4Homework3.Entities.Campaign;
import Week4Homework3.Entities.Game;
import Week4Homework3.Entities.Gamer;
import Week4Homework3.Entities.Sale;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1, "Burak", "Orucoglu", "123456", 1996);
		CheckManager checkManager = new CheckManager();
		checkManager.checkPerson(gamer1);
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer1);
		gamerManager.delete(gamer1);
		gamerManager.update(gamer1);
		
		
		Campaign campaign1 = new Campaign(1, "Yýlbaþý indirimleri", 30, 50);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		Game game1 = new Game(1 , "Valorant", 100);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game1);
		gameManager.update(game1);
		
		Sale sale1= new Sale(1, 1, 2);
		SaleManager saleManager = new SaleManager();
		saleManager.campaignPrice(game1, gamer1, sale1, campaign1);
		saleManager.normalPrice(game1, gamer1, sale1);
	}

}
