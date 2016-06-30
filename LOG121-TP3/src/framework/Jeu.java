package framework;

public class Jeu implements StrategiePointage{
	int nbrDeJoueur;
	int nbrDeTours;
	StrategiePointage algoPointage = new CalculPointageBunco();

	@Override
	public Joueur calculerLeVainqueur(final Jeu aJeu) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int calculerScoreTour(final Jeu aJeu) {
		// TODO Auto-generated method stub
		return 0;
	}
}
