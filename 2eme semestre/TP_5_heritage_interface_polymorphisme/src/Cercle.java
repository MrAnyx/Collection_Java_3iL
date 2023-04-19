
public class Cercle implements ObjetGeometrique{
	
	protected double rayon;
	
	Cercle(double r){
		this.rayon = r;
	}

	@Override
	public double getPerimetre() {
		return Math.PI*this.rayon*2;
	}

	@Override
	public double getAire() {
		return Math.PI*Math.pow(this.rayon, 2);
	}

}
