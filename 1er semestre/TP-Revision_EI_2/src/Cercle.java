
public class Cercle implements Figure2D{
	private int rayon;
	
	Cercle(int r){
		this.rayon = r;
	}
	
	public double perimetre() {
		return 2*Math.PI*this.rayon;
	}

	public double aire() {
		return Math.pow(this.rayon, 2)*Math.PI;
	}

}
