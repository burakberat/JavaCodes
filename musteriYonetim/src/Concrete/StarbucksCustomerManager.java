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
			System.out.println("Do�rulama Ba�ar�l�...");
			super.save(customer);
		}
		else {
			System.out.println("Do�rulama Ba�ar�s�z");
		}
	}
	
	

}
