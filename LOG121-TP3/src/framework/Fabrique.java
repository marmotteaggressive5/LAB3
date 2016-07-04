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
Nom du fichier: Fabrique.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/
package framework;

import bunco.game.Bunco;

public class Fabrique {
	public static AJeu creerJeu(String stringJeu) {
		AJeu newAJeu = null;
				
		if(stringJeu.equals("Bunco 2P")){
			newAJeu = new Bunco(2);
		}
		
		return newAJeu;
	}
}
