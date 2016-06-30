package framework;

public class Jeu implements IStrategie{

	int nbrDeJoueur;
	
	public int getNbrDeJoueur() {
		return nbrDeJoueur;
	}

	public void setNbrDeJoueur(int nbrDeJoueur) {
		this.nbrDeJoueur = nbrDeJoueur;
	}

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
