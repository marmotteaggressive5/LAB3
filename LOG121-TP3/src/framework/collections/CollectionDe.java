package framework.collections;

import framework.De;
import framework.collections.iterateurs.IterateurDe;

public class CollectionDe extends Collection<De>{
	public CollectionDe(int nbrDeDes, int nbrDeFaces){
		for(int i = 0; i<nbrDeDes; i++ ){
			this.add(new De(nbrDeFaces));
		}
	}

	@Override
	public IterateurDe createIterateur() {
		// TODO Auto-generated method stub
		return new IterateurDe(this);
	}
}
