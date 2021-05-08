package Concrete;

import Abstract.GamerService;
import Week4Homework3.Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getName() + " adlý oyuncu sisteme baþarýlý bir þekilde kayýt oldu.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName() + " adlý oyuncu sistemden baþarýlý bir þekilde silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getName() + " adlý oyuncunun bilgileri baþarýlý bir þekilde güncellendi.");
		
	}

}
