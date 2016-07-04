/******************************************************
Cours:   LOG121
Session: E2016
Groupe:  02
Projet: Laboratoire #3
Etudiant(e)s: Philippe Torres-Brisebois
			  Nelson Chao
			  Samuel Crotteau
			  Laurent Theroux-Bombardier
Professeur : Francis Cardinal
Nom du fichier: CollectionDe.java
Date cree: 2016-06-23
Date dern. modif. 2016-07-05
 *******************************************************
Historique des modifications
 *******************************************************
2016-06-23 Version initiale

 *******************************************************/
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
