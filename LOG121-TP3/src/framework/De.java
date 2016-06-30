package framework;

public class De implements Comparable<De> {

	private int nbFaces;
	private int currentFace;
	
	public De(final int nbFaces) {
		this.nbFaces = nbFaces;
	}
	
	@Override
	public int compareTo(De de) {
		
		return 0;
	}

	public int roulerDe() {
		return (int) (Math.random()*nbFaces + 1);
	}

	public int getCurrentFace() {
		return currentFace;
	}

	public void setCurrentFace(int currentFace) {
		this.currentFace = currentFace;
	}
	
}
