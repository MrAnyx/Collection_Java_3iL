import java.io.Serializable;

public class Forme implements Serializable{
	

	private String nom;
	private String debut;
	private String fin;
	private String couleur;
	
	
	Forme(String[] liste){
		this.nom = liste[0];
		this.debut = liste[1];
		this.fin = liste[2];
		this.couleur = liste[3];
	}
	
	
	public String toString() {
		return this.nom+" "+this.debut+" "+this.fin+" "+this.couleur;
	}

	
	
	public String getNom() {
		return nom;
	}


	public String getDebut() {
		return debut;
	}


	public String getFin() {
		return fin;
	}


	public String getCouleur() {
		return couleur;
	}
	
	
}
