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
Nom du fichier: IIterateur.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/
package framework.collections.iterateurs;

public interface IIterateur<T> {

	/**
	 * Verifie si la collection a un prochain element apres le curseur.
	 * 
	 * @return vrai si la collection a un element suivant, faux sinon
	 */
	public boolean hasNext();
	
	/**
	 * Retourne l'objet de la collection.
	 * 
	 * @return l'objet a l'index specifie
	 */
	public T next();
}
