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
Nom du fichier: CollectionJoueur.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/
package framework.collections;

import framework.Joueur;
import framework.collections.iterateurs.IterateurJoueur;

public class CollectionJoueur extends Collection<Joueur> {

	public CollectionJoueur(int nbrDeJoueur){
		for(int i = 0; i<nbrDeJoueur; i++ ){
			this.add(new Joueur(i));
		}
	}
	/**
	 * Cree et retourne un iterateur de la collection de joueur.
	 * 
	 * @return une instance d'iterateur de joueur.
	 */
	@Override
	public IterateurJoueur createIterateur() {
		return new IterateurJoueur(this);
	}
}
