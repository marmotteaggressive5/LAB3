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
Nom du fichier: JoueurTest.java
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

import framework.De;
import framework.Joueur;

public class JoueurTest {
	
	private Joueur joueur1;
	private Joueur joueur2;

	@Before
	public void faireAvant(){
		joueur1 = new Joueur(1);
		joueur2 = new Joueur(2);
	}
	
	/**
	 * Test le constructeur
	 */
	@Test
	public void joueurConstructorTest(){
		int desiredId = 3;
		Joueur joueur = new Joueur(desiredId);
		assertEquals(joueur.getId(),desiredId);
	}
	
	/**
	 * Test le setter et le getter pour Id
	 */
	@Test
	public void joueurSetGetTestId(){
		int desiredId = 0;
		joueur1.setId(desiredId);
		assertEquals(joueur1.getId(),desiredId);
	}
	
	/**
	 * Test le setter et le getter pour le nombre de points
	 */
	@Test
	public void joueurSetGetTestPoint(){
		int desiredPoints = 2;
		joueur1.setNbrPoint(desiredPoints);
		assertEquals(desiredPoints,joueur1.getNbrPoints());
	}
	
	/**
	 * Test la methode qui rajoute des points
	 */
	@Test
	public void joueurAddPointTest(){
		int desiredPointage = 3;
		joueur1.setNbrPoint(0);
		joueur1.setNbrPoint(joueur1.addPoints(desiredPointage));
		assertEquals(joueur1.getNbrPoints(),desiredPointage);
	}
	
	/**
	 * Test la methode compare - de1 est plus petit que de2
	 */
	@Test
	public void joueurCompareSuperieurTest(){
		joueur1.setNbrPoint(2);
		joueur2.setNbrPoint(7);
		assertTrue(joueur1.compareTo(joueur2)==1);
	}

	/**
	 * Test la methode compare - de1 est plus grand que de2
	 */
	@Test
	public void joueurCompareInferieurTest(){
		joueur1.setNbrPoint(2);
		joueur2.setNbrPoint(7);
		assertTrue(joueur2.compareTo(joueur1)==-1);
	}
	
	/**
	 * Test la methode compare quand c'est equal
	 */
	@Test
	public void joueurCompareSameTest(){
		int desiredFaces = 4;
		joueur1.setNbrPoint(desiredFaces);
		assertTrue(joueur1.compareTo(joueur1)==0);
	}

	/**
	 * Test la methode compare quand elle compare a null
	 */
	@Test(expected=IllegalArgumentException.class)
	public void joueurCompareNullTest(){
		joueur1.setNbrPoint(4);
		joueur1.compareTo(null);
	}
	
	
}
