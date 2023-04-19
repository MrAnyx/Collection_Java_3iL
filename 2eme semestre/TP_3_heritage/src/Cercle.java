
public class Cercle extends Forme{
	private double rayon;
	
	Cercle(){
		super();
		this.rayon = 1;
	}
	Cercle(double rayon){
		super();
		this.rayon = rayon;
	}
	Cercle(String color, Boolean remplie, double rayon){
		super(color, remplie);
		this.rayon = rayon;
	}
	
	
	public String toString() {
		return super.toString()+"\nrayon : "+this.rayon;
	}
	
	
	
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
	
	
	public double getAire() {
		return Math.PI*Math.pow(this.rayon, 2);
	}
	
	public double getPerimetre() {
		return Math.PI*this.rayon*2;
	}
	
	
	
	
}
