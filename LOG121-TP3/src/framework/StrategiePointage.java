package framework;

public interface StrategiePointage {


	/**
	 * Calcule le vainqueur de la partie.
	 * 
	 * @param aJeu le jeu  joue.
	 * @return le joueur vainqueur de la partie.
	 */
	public Joueur calculerLeVainqueur(final Jeu aJeu);

	/**
	 * Calcul le score d'un tour de la partie.
	 * 
	 * @param le jeu joue.
	 * @return le score du tour.
	 */
	public int calculerScoreTour(final Jeu aJeu);

}
