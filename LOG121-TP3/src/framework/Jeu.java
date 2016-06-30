package framework;

import bunco.game.CalculPointageBunco;

public class Jeu {
	private int nbrDeJoueur;
	private int nbrDeTours;
	private StrategiePointage algoPointage = new CalculPointageBunco();
	
	/**
	 * Obtient le nombre de tours.
	 * 
	 * @return le nombre de tours.
	 */
	public int getNbrDeTours() {
		return nbrDeTours;
	}

	/**
	 * Modifie le nombre de tours.
	 * 
	 * @param nbrDeTours le nombre de tours.
	 */
	public void setNbrDeTours(int nbrDeTours) {
		this.nbrDeTours = nbrDeTours;
	}

	/**
	 * Obtient la strategie de pointage.
	 * 
	 * @return la strategie de pointage.
	 */
	public StrategiePointage getAlgoPointage() {
		return algoPointage;
	}

	/**
	 * Modifie la strategie de pointage.
	 * 
	 * @param algoPointage la strategie de pointage.
	 */
	public void setAlgoPointage(StrategiePointage algoPointage) {
		this.algoPointage = algoPointage;
	}

	/**
	 * Obtient le nombre de joueur dans la partie.
	 * 
	 * @return le nombre de joueur.
	 */
	public int getNbrDeJoueur() {
		return nbrDeJoueur;
	}

	/**
	 * Modifie le nombre de joueur dans la partie.
	 * 
	 * @param nbrDeJoueur le nombre de joueur.
	 */
	public void setNbrDeJoueur(int nbrDeJoueur) {
		this.nbrDeJoueur = nbrDeJoueur;
	}
}
