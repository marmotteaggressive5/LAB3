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
Nom du fichier: IterateurJoueur.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/
package framework.collections.iterateurs;

import framework.Joueur;
import framework.collections.CollectionJoueur;

public class IterateurJoueur extends AIterateur<Joueur>{
	
	/**
	 * Constructeur de Iterateur de joueur
	 * 
	 * @param aColJoueur
	 */
	public IterateurJoueur(final CollectionJoueur aColJoueur) {
		super(aColJoueur);
	}
}
