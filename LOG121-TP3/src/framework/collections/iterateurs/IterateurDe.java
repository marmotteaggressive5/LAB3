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
Nom du fichier: IterateurDe.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/
package framework.collections.iterateurs;

import framework.De;
import framework.collections.CollectionDe;

public class IterateurDe extends AIterateur<De> {
	/**
	 * Constructeur de Iterateur De
	 * 
	 * @param aColDe la collection de de a iterer
	 */
	public IterateurDe(final CollectionDe aColDe) {
		super(aColDe);
	}
}
