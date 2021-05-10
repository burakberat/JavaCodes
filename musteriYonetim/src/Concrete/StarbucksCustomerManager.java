package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CheckService checkService;

	public StarbucksCustomerManager(CheckService checkService) {
		super();
		this.checkService = checkService;
	}
	
	@Override
	public void save(Customer customer) {
		if(checkService.checkPerson(customer)) {
			System.out.println("Doðrulama Baþarýlý...");
			super.save(customer);
		}
		else {
			System.out.println("Doðrulama Baþarýsýz");
		}
	}
	
	

}
