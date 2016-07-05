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

	/**
	 * Constructeur de Bunco
	 * @param nbrDeJoueurs
	 */
	public Bunco(int nbrDeJoueurs){
		this.nbrDeJoueurs = nbrDeJoueurs;
		this.algoPointage = new CalculPointageBunco();
	}
	
	/**
	 * Initialise tout les valeur pour commencer une partie
	 */
	@Override
	public void initialiser() {
		this.currentTour = 1;
		this.nbrDeTours = NBR_DE_TOURS;
		this.collectionJoueur = new CollectionJoueur(this.nbrDeJoueurs);
		this.collectionDe = new CollectionDe(NBR_DE_DES, NBR_DE_FACES);
	}
	
	/**
	 * Simule un pli(portion d'un tour pour un joueur) et augmente le score du joueur en question
	 * @param indexJoueur
	 */
	@Override
	public void jouerPly(int indexJoueur) {
		this.currentPlayerTurn = collectionJoueur.get(indexJoueur);
		
		do{
			lancerTousLesDes();
		}while(algoPointage.calculerScorePly(this));
	}
	
	/**
	 * Simule un tour (nb de joueur * nb de pli) grace a une boucle et augmente la valeur du tour de la partie
	 */
	@Override
	public void jouerTour() {
		for(int i = 0;i<this.nbrDeJoueurs;i++){
			jouerPly(i);
		}
		this.currentTour++;
	}
	
	/**
	 * Appelle la fonction de la strategie de pointage qu va permettre de classer les joueur en ordre decroissant selon leur score
	 */
	@Override	
	public void calculerGagnant() {
		collectionJoueurTrier = algoPointage.calculerLeVainqueur(this);
	}

	/**
	 * getter pour l'attribut nbrDeJoueurs
	 * @return nbrDeJoueurs
	 */
	public int getNbrDeJoueurs(){
		return nbrDeJoueurs;
	}
	
	/**
	 * getter pour l'attribut currentTour
	 * @return currentTour
	 */
	public int getCurrentTour(){
		return currentTour;
	}
	
	/**
	 * setter pour l'attribut currentTour
	 * @return currentTour
	 */
	public void setCurrentTour(int currentTour){
		this.currentTour=currentTour;
	}
	
}
