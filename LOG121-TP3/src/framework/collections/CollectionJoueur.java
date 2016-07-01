package framework.collections;

import framework.Joueur;
import framework.collections.iterateurs.IterateurJoueur;

public class CollectionJoueur extends Collection<Joueur> {

	public CollectionJoueur(int nbrDeJoueur){
		for(int i = 0; i<nbrDeJoueur; i++ ){
			this.add(new Joueur(i));
		}
	}
	/**
	 * Cree et retourne un iterateur de la collection de joueur.
	 * 
	 * @return une instance d'iterateur de joueur.
	 */
	@Override
	public IterateurJoueur createIterateur() {
		return new IterateurJoueur(this);
	}
}
