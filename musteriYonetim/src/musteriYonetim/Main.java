package musteriYonetim;

import Abstract.BaseCustomerManager;
import Adapters.MernisSeviceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer= new Customer(1, "Burak", "Orucoglu", "05.01.1996", "123456789");
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisSeviceAdapter());
		baseCustomerManager.save(customer);

	}

}
