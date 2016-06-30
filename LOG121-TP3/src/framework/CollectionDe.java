package framework;

public class CollectionDe extends Collection<De>{

	/**
	 * Creer un iterateur de la collection de de
	 * 
	 * @return un iterateur de la collection
	 */
	@Override
	public IterateurDe createIterateur() {
		return new IterateurDe(this);
	}

}
