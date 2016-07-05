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
import static org.junit.Assert.assertTrue;

import org.junit.*;

import framework.AJeu;
import framework.Joueur;
import bunco.game.Bunco;


public class BuncoTest {

	private Bunco jeu;
	private int nbrDeJoueurs = 3;
	
	@Before
	public void faireAvant(){
		jeu = new Bunco(nbrDeJoueurs);
		jeu.initialiser();
	}
	
	/**
	 * Test le constructeur
	 */
	@Test
	public void buncoConstructorTest(){
		int desiredId = 3;
		Bunco jeuTest = new Bunco(desiredId);
		assertEquals(jeuTest.getNbrDeJoueurs(),desiredId);
	}
	
	/**
	 * Test la methode JouerTour
	 */
	@Test
	public void buncoJouerTourTest(){
		int tourInitiale = jeu.getCurrentTour();
		jeu.jouerTour();
		int tourApres = jeu.getCurrentTour();
		assertEquals(tourInitiale+1,tourApres);
	}
	
	/**
	 * Test la  methode getter de nombre de joueur
	 */
	@Test
	public void buncoGetterJoueurTest(){
		int nbrJoueur = jeu.getNbrDeJoueurs();
		assertEquals(nbrJoueur,nbrDeJoueurs);
	}
	
	/**
	 * Test la  methode getter de nombre de joueur
	 */
	@Test
	public void buncoGetterTourTest(){
		int tour = jeu.getCurrentTour();
		assertEquals(tour,1);
	}
	
	/**
	 * Test la methode  jouerPly
	 */
	@Test
	public void buncoPlyTest(){
		int indexJoueur = 1;
		jeu.jouerPly(indexJoueur);
		Joueur joueur = jeu.getcurrentPlayerTurn();
		int scoreInitiale = joueur.getNbrPoints();
		
		for(int i=0;i<100;i++){
			jeu.jouerPly(indexJoueur);
		}
		int scoreFinale = joueur.getNbrPoints();
		System.out.println(scoreInitiale);
		System.out.println(scoreFinale);
		
		assertTrue(scoreFinale>scoreInitiale);
	}
	
}
