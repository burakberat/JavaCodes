package Concrete;

import Abstract.CampaignService;
import Week4Homework3.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� ba�ar�l� bir �ekilde olu�turuldu.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� ba�ar�l� bir �ekilde kald�r�ld�.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� ba�ar�l� bir �ekilde g�ncellendi.");
		//System.out.println("Yeni indirim miktar�: " );
		//System.out.println("Yeni ge�erlilik s�resi: ");
		
	}

}
