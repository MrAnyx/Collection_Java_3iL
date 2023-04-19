
public class Cylindre extends Cercle{
	private double hauteur;
	
	
	Cylindre(){
		super();
		this.hauteur = 1.0;
	}
	
	Cylindre(double r){
		super(r);
		this.hauteur = 1.0;
	}
	
	Cylindre(double r, double h){
		super(r);
		this.hauteur = h;
	}
	
	Cylindre(double r, String c, double h){
		super(r, c);
		this.hauteur = 1.0;

	}
	
	
	

	//public abstract String toString();
	
	public String toString() {
		return super.toString()+" et une hauteur de : " + this.hauteur;
	}

	
	
	
	
	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	public double getAire() {
		return 2*super.getAire()+(2*Math.PI*super.getRayon())*this.hauteur;
	}
	
	public double getVolume() {
		return super.getAire()*this.hauteur;
	}
	
	
}
