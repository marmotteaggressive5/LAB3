package framework;

public class Joueur implements Comparable<Joueur>{

	private int nbrPoints;
	private int nbrDeParJoueur;
	
	public int getNbrPoints() {
		return nbrPoints;
	}

	public void setNbrPoints(int nbrPoints) {
		this.nbrPoints = nbrPoints;
	}

	@Override
	public int compareTo(Joueur joueur) {
		// add some code
		return 0;
	}

}
