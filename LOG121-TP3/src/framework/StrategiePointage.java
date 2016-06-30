package framework;

public interface StrategiePointage {

	public Joueur calculerLeVainqueur(final Jeu aJeu);
	
	public int calculerScoreTour(final Jeu aJeu);
}
