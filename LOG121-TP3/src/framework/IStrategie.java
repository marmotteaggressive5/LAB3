package framework;

public interface IStrategie {

	public Joueur calculerLeVainqueur(final Jeu aJeu);
	
	public int calculerScoreTour(final Jeu aJeu);
}
