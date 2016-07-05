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
	//attributes
	protected int currentTour;
	protected int nbrDeJoueurs;
	protected int nbrDeTours;
	protected CollectionDe collectionDe;
	protected CollectionJoueur collectionJoueur;
	protected StrategiePointage algoPointage;
	protected Joueur currentPlayerTurn;
	protected CollectionJoueur collectionJoueurTrier;
	
	//methods
	/**
	 * change la valeur de la face courrante de tout les des de 
	 * la collectionsDe de facons aléatoire
	 */
	public void lancerTousLesDes(){
		IterateurDe iterateur = collectionDe.createIterateur();
		while (iterateur.hasNext()) {
			De currentDe = iterateur.next();
			currentDe.roulerDe();
		}
	}
	/**
	 * retourne true si tout les dés ont la meme face courrante
	 * @return isDesPareil?
	 */
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
	/**
	 * retourne le nb de dés dans la collection avec comme valeur courrante la valeur rechercher
	 * 
	 * @param valeurChercher
	 * @return nb de dé avec la valeur rechercher
	 */
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
	
	//Pattern Method template
	
	/**
	 * Initialise avec les valeur initiale d'une partie
	 */
	public abstract void initialiser();
	/**
	 * Simule un pli
	 */
	public abstract void jouerPly(int indexJoueur);
	/**
	 * Simule toute unn tour
	 */
	public abstract void jouerTour();
	/**
	 * Calcule le gagnant de la partie
	 */
	public abstract void calculerGagnant();
	
	/**
	 * Simule toute une partie
	 */
	public void jouerPartie(){
		initialiser();
		for(int i = 0;i<this.nbrDeTours;i++){
			jouerTour();
		}
		calculerGagnant();
	}
	
	//Getter/Setter
	public CollectionDe getCollectionDe() {
		return collectionDe;
	}
	public int getNbrDeTours() {
		return nbrDeTours;
	}
	public StrategiePointage getAlgoPointage() {
		return algoPointage;
	}
	public void setCurrentPlayerTurn(Joueur currentPlayerTurn) {
		this.currentPlayerTurn = currentPlayerTurn;
	}
	public int getCurrentTour() {
		return currentTour;
	}
	public Joueur getCurrentPlayerTurn() {
		return currentPlayerTurn;
	}
	public CollectionJoueur getCollectionJoueur() {
		return collectionJoueur;
	}
	public CollectionJoueur getCollectionJoueurTrie(){
		return collectionJoueurTrier;
	}
	
}