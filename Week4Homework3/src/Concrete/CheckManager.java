package Concrete;

import Abstract.CheckService;
import Week4Homework3.Entities.Gamer;

public class CheckManager implements CheckService {

	@Override
	public void checkPerson(Gamer gamer) {
		
		if(gamer.getNationalIdentity() == "123456" && gamer.getLastName() == "Orucoglu" && gamer.getName() == "Burak" && gamer.getBirthDate() == 1996)
		{
			System.out.println("Do�rulama Ba�ar�l�");
		}
		else
		{
			System.out.println("Do�rulama Hatal�");
		}
	}

	

}
