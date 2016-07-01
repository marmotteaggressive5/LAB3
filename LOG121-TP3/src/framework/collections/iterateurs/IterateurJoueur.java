package framework.collections.iterateurs;

import framework.Joueur;
import framework.collections.CollectionJoueur;

public class IterateurJoueur extends AIterateur<Joueur>{
	
	/**
	 * Constructeur de Iterateur de joueur
	 * 
	 * @param aColJoueur
	 */
	public IterateurJoueur(final CollectionJoueur aColJoueur) {
		super(aColJoueur);
	}
}
