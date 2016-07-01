package framework.collections;

import framework.collections.iterateurs.IIterateur;

public abstract class Collection<T> {

	private Node first;
	private Node last;
	private int nbElement;

	/**
	 * Constructeur
	 */
	public Collection() {
	}

	/**
	 * Retourne le nombre d'elements dans la liste
	 * 
	 * @return la taille de la liste
	 */
	public int size() {
		return nbElement;
	}

	/**
	 * Ajoute tous les elements d'une collection dans la collection
	 * 
	 * @param collection
	 */
	public void addAll(final Collection<T> collection) {
		for (int i = 0; i < collection.size(); i++) {
			this.add(collection.get(i));
		}
	}

	/**
	 * Ajoute un objet dans la liste
	 * 
	 * @param ele un objet a ajouter 
	 */
	public void add(T ele) {
		Node newNode = new Node(ele);
		if (nbElement == 0) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = last.next;
		}
		nbElement++;
	}

	/**
	 * Obtient l'objet de la liste a l'index desire
	 * 
	 * @param index l'index de l'objet
	 * @return un Object desirer
	 */
	public T get(int index) {
		Node result = first;
		for (int i = 0; i <= index - 1; i++) {
			result = result.next;
		}

		return result.element;
	}

	/**
	 * Retourne le noeud 
	 * 
	 * @param index l'index du noeud
	 * @return le noeud
	 */
	private Node getNode(int index) {
		Node result = first;
		for (int i = 0; i <= index - 1; i++) {
			result = result.next;
		}

		return result;
	}

	/**
	 * Retourne une string contenant les informations
	 * sur les objets dans la liste
	 */
	public String toString() {
		String result = "";
		Node current = first;
		while (current.next != null) {
			result += current.element + " - ";
			current = current.next;
		}
		return result;
	}

	/**
	 * Echange l'objet avec l'objet suivant 
	 * dans la liste
	 * 
	 * @param index l'index de l'objet a echanger
	 */
	public void swapWithNext(int index) {
		T temp = get(index);
		getNode(index).element = get(index + 1);
		getNode(index + 1).element = temp;
	}

	/**
	 * Vide la liste chainee
	 */
	public void clear() {
		first = null;
		last = null;
		nbElement = 0;
	}
	
	/**
	 * Cree un iterateur pour la collection actuelle.
	 * 
	 * @return un iterateur de la collection. 
	 */
	public abstract IIterateur<T> createIterateur();


	private class Node {
		private Node next = null;
		private T element = null;

		public Node(T element) {
			this.element = element;
		}
	}
}
