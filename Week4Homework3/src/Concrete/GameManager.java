package Concrete;

import Abstract.GameService;
import Week4Homework3.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " adl� oyun sisteme ba�ar�l� bir �ekilde eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " adl� oyun sistemden ba�ar�l� bir �ekilde kald�r�ld�.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " adl� oyunun bilgileri ba�ar�l� bir �ekilde g�ncellendi.");
		
	}

}
