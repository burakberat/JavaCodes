package Week4Homework3.Entities;

public class Campaign implements Entity {
	private int id;
	private String campaignName;
	private int totalDay;
	private double discount;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName,int totalDay, double discount) {
		this.id = id;
		this.campaignName = campaignName;
		this.totalDay = totalDay;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	
	public int getTotalDay() {
		return totalDay;
	}

	public void setTotalDay(int totalDay) {
		this.totalDay = totalDay;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
