package framework.collections.iterateurs;

import framework.collections.Collection;

public abstract class AIterateur<T> implements IIterateur<T>{

	private Collection<T> collection;
	private int index;
	
	public AIterateur(final Collection<T> aCollection) {
		this.collection = aCollection;
	}
	
	public boolean hasNext() {
		return index < collection.size();
	}
	
	public T next() {
		return collection.get(index++);
	}

}
