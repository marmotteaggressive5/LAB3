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
Nom du fichier: CalculPointageBunco.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/
package framework;

import framework.collections.CollectionDe;
import framework.collections.CollectionJoueur;
import framework.collections.iterateurs.IterateurDe;

public abstract class AJeu{
	protected int currentTour;
	

	protected int nbrDeJoueurs;
	protected int nbrDeTours;
	protected CollectionDe collectionDe;
	protected CollectionJoueur collectionJoueur;
	protected StrategiePointage algoPointage;
	protected Joueur currentPlayerTurn;
	protected CollectionJoueur collectionJoueurTrier;
	
	public void lancerTousLesDes(){
		IterateurDe iterateur = collectionDe.createIterateur();
		while (iterateur.hasNext()) {
			De currentDe = iterateur.next();
			currentDe.roulerDe();
		}
	}
	public boolean isDesPareil(){
		boolean result = true;
		IterateurDe iterateur = collectionDe.createIterateur();
		
		De premierDe = iterateur.next();
		while (iterateur.hasNext()) {
			De currentDe = iterateur.next();
			if(currentDe.compareTo(premierDe) != 0){
				result = false;
			}
		}
		
		return result;
	}
	public int nbDeOfValue(int valeurChercher){
		int result = 0;
		IterateurDe iterateur = collectionDe.createIterateur();

		while (iterateur.hasNext()) {
			De currentDe = iterateur.next();
			if(currentDe.getCurrentFace() == valeurChercher){
				result++;
			}
		}
		
		return result;
	}
	
	public int getCurrentTour() {
		return currentTour;
	}
	public Joueur getcurrentPlayerTurn() {
		return currentPlayerTurn;
	}
	public CollectionJoueur getCollectionJoueur() {
		return collectionJoueur;
	}
	
	public abstract void initialiser();
	public abstract void jouerPly(int indexJoueur);
	public abstract void jouerTour();
	public abstract void calculerGagnant();
	
	public void jouerPartie(){
		initialiser();
		for(int i = 0;i<this.nbrDeTours;i++){
			jouerTour();
		}
		calculerGagnant();
	}
}