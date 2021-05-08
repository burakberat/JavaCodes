package Week4Homework3.Entities;

public class Sale implements Entity {
	private int id;
	private int gamerId;
	private int saleAmount;
	
	public Sale() {
		
	}

	public Sale(int id, int gamerId, int saleAmount) {
		super();
		this.id = id;
		this.gamerId = gamerId;
		this.saleAmount = saleAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public int getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(int saleAmount) {
		this.saleAmount = saleAmount;
	}

	
	
	
}
