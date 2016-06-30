package framework;

public class CollectionDe extends Collection<De>{

	@Override
	public IIterateur<De> createIterateur() {
		// TODO Auto-generated method stub
		return new IterateurDe(this);
	}

}
