package Concrete;

import Abstract.GamerService;
import Week4Homework3.Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getName() + " adl� oyuncu sisteme ba�ar�l� bir �ekilde kay�t oldu.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName() + " adl� oyuncu sistemden ba�ar�l� bir �ekilde silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getName() + " adl� oyuncunun bilgileri ba�ar�l� bir �ekilde g�ncellendi.");
		
	}

}
