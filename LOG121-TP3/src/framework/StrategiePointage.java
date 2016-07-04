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
Nom du fichier: StrategiePointage.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/
package framework;

import framework.collections.CollectionJoueur;

public interface StrategiePointage {


	/**
	 * Calcule le vainqueur de la partie.
	 * 
	 * @param aJeu le jeu  joue.
	 * @return le joueur vainqueur de la partie.
	 */
	public CollectionJoueur calculerLeVainqueur(AJeu aJeu);

	/**
	 * Calcul le score d'un tour de la partie.
	 * 
	 * @param le jeu joue.
	 * @return le score du tour.
	 */
	public boolean calculerScorePly(AJeu aJeu);

}
