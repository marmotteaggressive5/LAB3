/******************************************************
Cours:   LOG121
Session: E2016
Groupe:  02
Projet: Laboratoire #3
Etudiant(e)s: Philippe Torres-Brisebois
			  Nelson Chao
			  Samuel Crotteau
			  Laurent Theroux-Bombardier
Professeur : Francis Cardinal
Nom du fichier: Joueur.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/
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

	public void addPoints(int valeur) {
		this.nbrPoints+=valeur;
	}
	/**
	 * Compare le nombre de points avec un autre joueur.
	 * 
	 * @param joueur le joueur en comparaison.
	 */
	@Override
	public int compareTo(Joueur joueur) throws IllegalArgumentException{
		try{
			int value = joueur.getNbrPoints() - getNbrPoints();

			if (value == 0) {
				return 0;
			} else if (value > 0) {
				return 1;
			} else {
				return -1;
			}
		}catch(Exception e){
			throw new IllegalArgumentException();
		}
	}

}
