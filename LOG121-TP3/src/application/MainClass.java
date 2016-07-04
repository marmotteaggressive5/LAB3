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
Nom du fichier: MainClass.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/

package application;

import framework.AJeu;
import framework.Fabrique;

public class MainClass {
	public static void main(String[] args) {
		AJeu game = Fabrique.creerJeu("Bunco 2P");
		
		game.jouerPartie();
	}
}
