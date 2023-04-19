
public class Cercle implements Figure2D{
	private Point P;
	private double rayon;
	
	public Cercle(Point p, double ray) {
		this.P = p;
		this.rayon = ray;
	}
	
	public double perimetre() {
		return 2*Math.PI*this.rayon;
		
	}
	
	public double aire() {
		return Math.PI*Math.pow(this.rayon, 2);
	}
}
