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
Nom du fichier: BuncoTest.java
Date cree: 2016-06-30
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-30 Version initiale

 *******************************************************/

package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bunco.game.Bunco;


public class BuncoTest {

	/**
	 * Test le constructeur
	 */
	@Test
	public void joueurConstructorTest(){
		int desiredId = 3;
		Bunco jeu = new Bunco(desiredId);
		assertEquals(jeu.nbrDeJoueurs(),desiredId);
	}
	
	
}

/**
 * http://junit.sourceforge.net/javadoc/org/junit/Assert.html
 * http://stackoverflow.com/questions/15718746/how-do-i-junit-test-a-constructor
 */