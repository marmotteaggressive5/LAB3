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
Nom du fichier: Bunco.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/

package bunco.game;

import framework.AJeu;
import framework.Joueur;
import framework.collections.CollectionDe;
import framework.collections.CollectionJoueur;

public class Bunco extends AJeu {
	//General Constants
	private final static int NBR_DE_TOURS = 6;
	private final static int NBR_DE_DES = 3; 
	private final static int NBR_DE_FACES = 6;
	
	//Attribute
	private int nbrDeJoueurs ;

	public Bunco(int nbrDeJoueurs){
		this.nbrDeJoueurs = nbrDeJoueurs;
		this.algoPointage = new CalculPointageBunco();
	}
	
	@Override
	public void initialiser() {
		this.currentTour = 1;
		this.nbrDeTours = NBR_DE_TOURS;
		this.collectionJoueur = new CollectionJoueur(this.nbrDeJoueurs);
		this.collectionDe = new CollectionDe(NBR_DE_DES, NBR_DE_FACES);
	}
	
	@Override
	public void jouerPly(int indexJoueur) {
		this.currentPlayerTurn = collectionJoueur.get(indexJoueur);
		
		do{
			lancerTousLesDes();
		}while(algoPointage.calculerScorePly(this));
	}
	
	@Override
	public void jouerTour() {
		System.out.println("  TOUR NUMERO " + currentTour);
		
		for(int i = 0;i<this.nbrDeJoueurs;i++){
			jouerPly(i);
		}
		this.currentTour++;
	}
	
	@Override	
	public void calculerGagnant() {
		collectionJoueurTrier = algoPointage.calculerLeVainqueur(this);
	}

	public int getNbrDeJoueurs(){
		return nbrDeJoueurs;
	}
	
	public int getCurrentTour(){
		return currentTour;
	}
	public void setCurrentTour(int currentTour){
		this.currentTour=currentTour;
	}
	
}
