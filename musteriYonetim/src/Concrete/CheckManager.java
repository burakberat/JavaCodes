package Concrete;

import Abstract.CheckService;
import Entities.Customer;

public class CheckManager implements CheckService {

	@Override
	public boolean checkPerson(Customer customer) {
		return true;
		
	}

}
