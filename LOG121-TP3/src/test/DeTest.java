package test;

import static org.junit.Assert.*;
import org.junit.*;
import framework.De;

public class DeTest{

	private De de1;
	private De de2;

	@Before
	public void faireAvant(){
		de1 = new De(6);
		de2 = new De(6);
	}

	/**
	 * Test le constructeur
	 */
	@Test
	public void deConstructorTest(){
		int desiredFaces = 5;
		De de = new De (desiredFaces);
		assertEquals(de.getNbFaces(), desiredFaces);
	}

	/**
	 * Test le setter et le getter de Nombre de Facce
	 */
	@Test
	public void deSetGetNbFacesTest(){
		int desiredFaces = 6;
		de1.setNbFaces(desiredFaces);
		assertEquals(desiredFaces,de1.getNbFaces());
	}
	
	/**
	 * Test le setter et le getter de Current Face
	 */
	@Test
	public void deSetGetCurrentFaceTest(){
		int desiredFaces = 6;
		de1.setCurrentFace(desiredFaces);
		assertEquals(desiredFaces,de1.getCurrentFace());
	}
	/**
	 * Test la methode compare - de1 est plus petit que de2
	 */
	@Test
	public void deCompareSuperieurTest(){
		de1.setCurrentFace(4);
		de2.setCurrentFace(5);
		assertTrue(de1.compareTo(de2)==1);
	}

	/**
	 * Test la methode compare - de1 est plus grand que de2
	 */
	@Test
	public void deCompareInferieurTest(){
		de1.setCurrentFace(4);
		de2.setCurrentFace(5);
		assertTrue(de2.compareTo(de1)==-1);
	}
	/**
	 * Test la methode compare quand c'est equal
	 */
	@Test
	public void deCompareSameTest(){
		int desiredFaces = 4;
		de1.setCurrentFace(desiredFaces);
		assertTrue(de1.compareTo(de1)==0);
	}

	/**
	 * Test la methode compare quand elle compare a null
	 */
	@Test(expected=IllegalArgumentException.class)
	public void deCompareNullTest(){
		de1.setCurrentFace(4);
		de1.compareTo(null);
	}
}
