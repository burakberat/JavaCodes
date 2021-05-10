package Adapters;

import Abstract.CheckService;
import Entities.Customer;

public class MernisSeviceAdapter implements CheckService{

	@Override
	public boolean checkPerson(Customer customer) {
		
		return true;
	}
	
}
