package bunco.game;


import framework.AJeu;
import framework.Joueur;
import framework.StrategiePointage;
import framework.collections.CollectionJoueur;

public class CalculPointageBunco implements StrategiePointage {
	//Score Constants
	private final static int BUNCO_SCORE = 21;
	private final static int CHIFFRE_IDENTIQUE_SCORE = 5;
	private final static int NB_DE_POUR_BUNCO = 3;

	/**
	 * Calcule le vainqueur de la partie.
	 * 
	 * @param aJeu le jeu  joue.
	 * @return le joueur vainqueur de la partie.
	 */
	@Override
	public CollectionJoueur calculerLeVainqueur(AJeu aJeu) {
		CollectionJoueur joueursTrier = aJeu.getCollectionJoueur();
		
		for(int i=0;i<joueursTrier.size();i++){
			for(int j=0;j<joueursTrier.size()-1;j++){
				Joueur joueurA = joueursTrier.get(j);
				Joueur joueurB = joueursTrier.get(j);
				
				if(joueurA.getNbrPoints() < joueurB.getNbrPoints()){
					joueursTrier.swapWithNext(i);
				}
			}
		}
		
		return joueursTrier;
	}

	/**
	 * Calcul le score d'un ply de la partie.
	 * 
	 * @param le jeu joue.
	 * @return le score du tour.
	 */
	@Override
	public boolean calculerScorePly(AJeu game) {
		boolean finDuPly = false;
		int pointage = 0 ;
		int currentTour = game.getCurrentTour();
		int nbDesGagnants = game.nbDeOfValue(currentTour);
		Joueur currentJoueur = game.getcurrentPlayerTurn();
		
		if(nbDesGagnants==NB_DE_POUR_BUNCO){//Bunco!
			pointage += BUNCO_SCORE;
			finDuPly = true;
		}else if (nbDesGagnants > 0){//combo, ply continue
			pointage += nbDesGagnants;
			finDuPly = false;
		}else if(game.isDesPareil()){//all chiffre pareil mais pas Bunco, ply continue
			pointage += CHIFFRE_IDENTIQUE_SCORE;
			finDuPly = false;
		}else{
			finDuPly = true;
		}
		
		currentJoueur.addPoints(pointage);
		
		return finDuPly;
	}

}
