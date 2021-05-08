package Concrete;

import Abstract.CampaignService;
import Week4Homework3.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý baþarýlý bir þekilde oluþturuldu.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý baþarýlý bir þekilde kaldýrýldý.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasý baþarýlý bir þekilde güncellendi.");
		//System.out.println("Yeni indirim miktarý: " );
		//System.out.println("Yeni geçerlilik süresi: ");
		
	}

}
