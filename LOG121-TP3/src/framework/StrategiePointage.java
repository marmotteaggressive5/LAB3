package framework;

public interface StrategiePointage {

	public Joueur calculerLeVainqueur(final AJeu aJeu);
	
	public int calculerScoreTour(final AJeu aJeu);
}
