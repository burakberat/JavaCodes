package Abstract;

import Week4Homework3.Entities.Game;
import Week4Homework3.Entities.Campaign;
import Week4Homework3.Entities.Gamer;
import Week4Homework3.Entities.Sale;

public interface SaleService {
	void normalPrice(Game game, Gamer gamer, Sale sale);
	void campaignPrice(Game game, Gamer gamer, Sale sale, Campaign campaign);
}
