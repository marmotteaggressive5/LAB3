package framework;

public class CollectionJoueur extends Collection<Joueur> {

	@Override
	public IIterateur<Joueur> createIterateur() {
		return new IterateurJoueur(this);
	}



}
