package framework;

public class De implements Comparable<De> {

	private int nbFaces;
	private int currentFace;
	

	public De(final int aNbFaces) {
		this.nbFaces = aNbFaces;
	}
	
	public int getNbFaces() {
		return nbFaces;
	}

	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	
	public int getCurrentFace() {
		return currentFace;
	}

	public void setCurrentFace(int currentFace) {
		this.currentFace = currentFace;
	}

	

	public int roulerDe() {
		this.currentFace = (int) (Math.random()*nbFaces + 1);
		return this.currentFace;
	}
	
	@Override
	public int compareTo(De de) {
		int value =  de.getCurrentFace() - getCurrentFace();
		
		if (value == 0) {
			return 0;
		} else if (value > 0){
			return 1;
		} else {
			return -1;
		}
	}	

}
