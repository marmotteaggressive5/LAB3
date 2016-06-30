package framework;

import bunco.game.CalculPointageBunco;
import framework.collections.CollectionDe;
import framework.collections.CollectionJoueur;
import framework.collections.iterateurs.IterateurDe;

public abstract class AJeu{
	protected int currentTour = 1;
	protected int nbrDeJoueurs;
	protected int nbrDeTours;
	protected CollectionDe collectionDe;
	protected CollectionJoueur collectionJoueur;
	StrategiePointage algoPointage = new CalculPointageBunco();
	public AJeu(int nbrDeJoueurs, int nbrDeTours, int nbrDeDes, int nbrDeFaces){
		this.nbrDeJoueurs = nbrDeJoueurs;
		this.nbrDeTours = nbrDeTours;
		this.collectionJoueur = new CollectionJoueur(nbrDeJoueurs);
		this.collectionDe = new CollectionDe(nbrDeDes, nbrDeFaces);
	}
	public void lancerTousLesDes(){
		IterateurDe iterateur = collectionDe.createIterateur();
		
		while (iterateur.hasNext()) {
			De currentDe = iterateur.next();
			currentDe.roulerDe();
			System.out.println(currentDe.getCurrentFace());
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
	public void jouerPartie(){
	
	}
	
	
	
	
	public abstract void jouerTour(int indexJoueur);
}