package Concrete;

import Abstract.GameService;
import Week4Homework3.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " adlý oyun sisteme baþarýlý bir þekilde eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " adlý oyun sistemden baþarýlý bir þekilde kaldýrýldý.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " adlý oyunun bilgileri baþarýlý bir þekilde güncellendi.");
		
	}

}
