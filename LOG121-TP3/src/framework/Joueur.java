package framework;

public class Joueur implements Comparable<Joueur>{

	private int nbrPoints;
	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id=id;
	}

	public Joueur(int id) {
		this.id = id;
	}
	/**
	 * Obtient le nombre de points du joueur.
	 * 
	 * @return le nombre de points du joueur.
	 */
	public int getNbrPoints() {
		return nbrPoints;
	}

	/**
	 * Modifie le nombre de points actuelle du joueur.
	 * 
	 * @param le nombre de points du joueur
	 */
	public void setNbrPoint(int nbrPoints){
		this.nbrPoints = nbrPoints;
	}

	//Devrait setter le pointage?
	public int addPoints(int valeur) {
		return nbrPoints+valeur;
	}
	/**
	 * Compare le nombre de points avec un autre joueur.
	 * 
	 * @param joueur le joueur en comparaison.
	 */
	@Override
	public int compareTo(Joueur joueur) {
		int value = joueur.getNbrPoints() - getNbrPoints();

		if (value == 0) {
			return 0;
		} else if (value > 0) {
			return 1;
		} else {
			return -1;
		}
	}

}
