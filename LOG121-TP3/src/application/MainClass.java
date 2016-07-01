package application;

import framework.AJeu;
import framework.Fabrique;

public class MainClass {
	public static void main(String[] args) {
		AJeu game = Fabrique.creerJeu("Bunco 2P");
		
		game.jouerPartie();
	}
}
