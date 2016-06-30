package framework.collections;

import framework.Joueur;
import framework.collections.iterateurs.IIterateur;
import framework.collections.iterateurs.IterateurJoueur;

public class CollectionJoueur extends Collection<Joueur> {

	public CollectionJoueur(int nbrDeJoueur){
		for(int i = 0; i<nbrDeJoueur; i++ ){
			this.add(new Joueur());
		}
	}
	@Override
	public IterateurJoueur createIterateur() {
		return new IterateurJoueur(this);
	}



}
