package framework.collections.iterateurs;

public interface IIterateur<T> {

	/**
	 * Verifie si la collection a un prochain element apres le curseur.
	 * 
	 * @return vrai si la collection a un element suivant, faux sinon
	 */
	public boolean hasNext();
	
	/**
	 * Retourne l'objet de la collection.
	 * 
	 * @return l'objet a l'index specifie
	 */
	public T next();
}
