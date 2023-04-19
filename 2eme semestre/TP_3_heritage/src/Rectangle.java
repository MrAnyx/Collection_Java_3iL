
public class Rectangle extends Forme{
	private double largeur;
	private double longueur;
	
	
	Rectangle(double largeur, double longueur, String color, Boolean remplie) {
		super(color, remplie);
		this.largeur = largeur;
		this.longueur = longueur;
	}
	Rectangle(double largeur, double longueur) {
		super();
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	Rectangle(){
		super();
		this.largeur = 1;
		this.longueur = 1;
	}
	
	
	
	
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	
	
	public double getAire() {
		return this.largeur*this.longueur;
	}
	
	public double getPerimetre() {
		return 2*(this.largeur+this.longueur);
	}
	
	
	
	public String toString() {
		return super.toString()+"\nlargeur : "+this.largeur+"\nlongueur : "+this.longueur;
	}
	
	
	
	
}
