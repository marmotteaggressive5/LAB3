package framework;

public class CollectionJoueur extends Collection<Joueur> {

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
