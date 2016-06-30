package framework;

import bunco.game.Bunco;

public class CreateurJeu {

	public AJeu creerJeu(String stringJeu) {
		if("Bunco".equals(stringJeu)){
			return new Bunco();
		}
		else{
			return new Bunco();	
		}		
	}
}
