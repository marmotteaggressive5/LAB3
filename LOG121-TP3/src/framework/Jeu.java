package framework;

import bunco.game.CalculPointageBunco;

public class Jeu {
	private int nbrDeJoueur;
	private int nbrDeTours;
	private StrategiePointage algoPointage = new CalculPointageBunco();
	
	
	public int getNbrDeTours() {
		return nbrDeTours;
	}

	public void setNbrDeTours(int nbrDeTours) {
		this.nbrDeTours = nbrDeTours;
	}

	public StrategiePointage getAlgoPointage() {
		return algoPointage;
	}

	public void setAlgoPointage(StrategiePointage algoPointage) {
		this.algoPointage = algoPointage;
	}

	public int getNbrDeJoueur() {
		return nbrDeJoueur;
	}

	public void setNbrDeJoueur(int nbrDeJoueur) {
		this.nbrDeJoueur = nbrDeJoueur;
	}
}
