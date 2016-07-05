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
Nom du fichier: De.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/
package framework;

public class De implements Comparable<De> {

	private int nbFaces;
	private int currentFace;
	

	/**
	 * Constructeur de De.
	 * 
	 * @param aNbFaces le nombre de faces du De.
	 */
	public De(final int aNbFaces) {
		this.nbFaces = aNbFaces;
	}
	
	/**
	 * Obtient le nombre de faces du de.
	 * 
	 * @return le nombre de faces.
	 */
	public int getNbFaces() {
		return nbFaces;
	}

	/**
	 * Modifie le nombre de faces du de.
	 * 
	 * @param nbFaces le nombre de faces.
	 */
	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	
	//A CHANGER
	/**
	 * Obtient le nombre de faces du de.
	 * 
	 * @return le nombre de faces.
	 */
	public int getCurrentFace() {
		return currentFace;
	}

	/**
	 * Modifie la face actuelle du de.
	 * 
	 * @param currentFace la face
	 */
	public void setCurrentFace(int currentFace) {
		this.currentFace = currentFace;
	}

	
	/**
	 * Roule une face du de aleatoire.
	 * 
	 * @return la face du de rouler.
	 */
	public int roulerDe() {
		this.currentFace = (int) (Math.random()*nbFaces + 1);
		return this.currentFace;
	}
	
	/**
	 * Compare la valeur de la face du de actuelle avec un autre de.
	 * 
	 * @param de le de a comparer.
	 */
	@Override
	public int compareTo(De de) throws IllegalArgumentException {
		  try{
		   int value =  de.getCurrentFace() - getCurrentFace();
		   if (value == 0) {
		    return 0;
		   } else if (value > 0){
		    return 1;
		   } else {
		    return -1;
		   }
		  }catch(Exception e){
		   throw new IllegalArgumentException();
		  }
		 }

}
