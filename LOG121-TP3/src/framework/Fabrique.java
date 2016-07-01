package framework;

import bunco.game.Bunco;

public class Fabrique {
	public static AJeu creerJeu(String stringJeu) {
		AJeu newAJeu = null;
				
		if(stringJeu.equals("Bunco 2P")){
			newAJeu = new Bunco(2);
		}
		
		return newAJeu;
	}
}
