
public class Cercle {

	private double rayon;
	private String couleur;
	
	
	//constructeur vide
	Cercle(){
		this.rayon = 1.0;
		this.couleur = "bleu";
	}
	
	//constructeur avec un seul argument
	Cercle(double r){
		this.rayon = r;
		this.couleur = "bleu";
	}
	
	//constructeur avec tous les arguments
	Cercle(double r, String c){
		this.rayon = r;
		this.couleur = c;
	}

	
	
	
	
	public String toString() {
		return "Le cercle a un rayon de : "+this.rayon+" et est de couleur : "+this.couleur;
	}
	
	
	
	
	

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
	
	
	public double getAire() {
		return Math.PI*Math.pow(this.rayon, 2);
	}
	
	
}
