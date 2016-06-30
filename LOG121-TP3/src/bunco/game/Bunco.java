package bunco.game;

import framework.AJeu;
import framework.Joueur;

public class Bunco extends AJeu {
	private final static int NBR_DE_JOUEURS = 2;
	private final static int NBR_DE_TOURS = 6;
	private final static int NBR_DE_DES = 3; 
	private final static int NBR_DE_FACES = 6;
	private final static int BUNCO_SCORE = 21;

	public Bunco(){
		super(NBR_DE_JOUEURS, NBR_DE_TOURS, NBR_DE_DES, NBR_DE_FACES);
	}

	@Override
	public void jouerTour(int indexJoueur) {
		Joueur currentJoueur = collectionJoueur.get(indexJoueur);
		boolean tourOver = false;
		
		while(!tourOver){
			lancerTousLesDes();
			
			int nbDePareil = nbDeOfValue(currentTour);
			
			if(isDesPareil()){
				currentJoueur.addPoints(BUNCO_SCORE);
				tourOver = true;
			}else if (nbDePareil > 0){
				currentJoueur.addPoints(nbDePareil);
			}else{
				tourOver = true;
			}
		}
	}
}
