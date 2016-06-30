package framework;

public class De implements Comparable<De> {

	private int nbFaces;
	private int currentFace;
	
	public De(final int aNbDe) {
		this.nbFaces = aNbDe;
	}
	
	@Override
	public int compareTo(De de) {
		
		return 0;
	}

	public int roulerDe() {
		return (int) (Math.random()*nbFaces + 1);
	}
	
}
