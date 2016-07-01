package framework;

import framework.collections.CollectionJoueur;

public interface StrategiePointage {


	/**
	 * Calcule le vainqueur de la partie.
	 * 
	 * @param aJeu le jeu  joue.
	 * @return le joueur vainqueur de la partie.
	 */
	public CollectionJoueur calculerLeVainqueur(AJeu aJeu);

	/**
	 * Calcul le score d'un tour de la partie.
	 * 
	 * @param le jeu joue.
	 * @return le score du tour.
	 */
	public boolean calculerScorePly(AJeu aJeu);

}
