package framework;

public abstract class AIterateur<T> implements IIterateur<T>{

	private Collection<T> collection;
	private int index;
	
	/**
	 * Constructeur
	 * 
	 * @param aCollection
	 */
	public AIterateur(final Collection<T> aCollection) {
		this.collection = aCollection;
	}
	
	/**
	 * Verifie si la collection a un prochain element apres le curseur.
	 * 
	 * @return vrai si la collection a un element suivant, faux sinon
	 */
	public boolean hasNext() {
		return index < collection.size();
	}
	
	/**
	 * Retourne l'objet de la collection.
	 * 
	 * @return l'objet a l'index specifie
	 */
	public T next() {
		return collection.get(index++);
	}

}
