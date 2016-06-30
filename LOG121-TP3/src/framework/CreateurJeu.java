package framework;

import bunco.game.Bunco;

public class CreateurJeu {

	public AJeu creerJeu(String stringJeu) {
		if("Bunco".equals(stringJeu)){
			return new Bunco();
		}
		else{
			//faire un else if pour chaque jeu
			return new Bunco();	
		}		
	}
}
