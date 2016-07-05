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
Nom du fichier: JeuTest.java
Date cree: 2016-06-30
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-30 Version initiale

 *******************************************************/
package test;
import static org.junit.Assert.*;

import org.junit.*;

import bunco.game.Bunco;
import framework.AJeu;
import framework.De;
import framework.Joueur;

public class JeuTest {

	private Bunco jeu;
	private int nbJoueur = 3;

	
	@Before
	public void faireAvant(){
		jeu = new Bunco(nbJoueur);
		jeu.initialiser();

	}
	/**
	 * Test la methode lancer tous les des
	 */
	@Test
	public void jeuLancerTest(){
		int de1 = jeu.getCollectionDe().get(0).getCurrentFace();
		int de2 = jeu.getCollectionDe().get(1).getCurrentFace();
		int de3 = jeu.getCollectionDe().get(2).getCurrentFace();
		jeu.lancerTousLesDes();
		int de1a = jeu.getCollectionDe().get(0).getCurrentFace();
		int de2a = jeu.getCollectionDe().get(1).getCurrentFace();
		int de3a = jeu.getCollectionDe().get(2).getCurrentFace();
		
		assertTrue((de1!=de1a)&&(de2!=de2a)&&(de3!=de3a));
	}
	
	/**
	 * Test la methode des pareils
	 */
	@Test
	public void jeuDesPareilTest(){
		jeu.getCollectionDe().get(0).setCurrentFace(3);
		jeu.getCollectionDe().get(1).setCurrentFace(3);
		jeu.getCollectionDe().get(2).setCurrentFace(3);
		assertTrue(jeu.isDesPareil());
	}
	
	/**
	 * Test la methode nbDeOfValue
	 */
	@Test
	public void jeuDesValue(){
		jeu.getCollectionDe().get(0).setCurrentFace(3);
		jeu.getCollectionDe().get(1).setCurrentFace(3);
		jeu.getCollectionDe().get(2).setCurrentFace(2);
		int nbValue = jeu.nbDeOfValue(3);
		assertEquals(2,nbValue);
	}
	/**
	 * Test le getter pour current tour
	 */
	@Test
	public void jeuGetTourTest(){
		int tour = jeu.getCurrentTour();
		assertEquals(tour,1);
	}
	
	/**
	 * Test le getter de playerTurn
	 */
	@Test
	public void jeuGetPlayerTurn(){
		jeu.jouerPly(2);
		Joueur joueurTurn = jeu.getCurrentPlayerTurn();
		assertEquals(joueurTurn,jeu.getCollectionJoueur().get(2));
	}
	
	/**
	 * Test le getter de la collection Trie. La valeur premiere est toutjours
	 *  plus grand ou equale a la deuxieme valeur
	 */
	@Test
	public void jeuGetCollectionTrie(){
		jeu.calculerGagnant();
		int joueur1 = jeu.getCollectionJoueurTrie().get(0).getNbrPoints();
		int joueur2 = jeu.getCollectionJoueurTrie().get(1).getNbrPoints();
		assertTrue(joueur1>=joueur2);
	}
	
	/**
	 * Test le getter de la collection
	 */
	@Test
	public void jeuGetCollection(){
		int collection = jeu.getCollectionJoueur().size();
		assertEquals(nbJoueur,collection);
	}
	
	/**
	 * Test la methode JouerPartie. Le nombre de partie maximal est atteint
	 */
	@Test
	public void jeuJouerPartieTest(){
		jeu.jouerPartie();
		assertEquals(jeu.getNbrDeTours(),6);
		
	}

}
