
public class Eleve extends Personne{
	
	private String annee;
	private String groupe;
	private double fraisScola;
	
	Eleve(String nom, String prenom, String annee, String groupe, double fraisScola){
		super(nom, prenom);
		this.annee = annee;
		this.groupe = groupe;
		this.fraisScola = fraisScola;
	}
	
	
	
	
	public String toString() {
		return super.toString()+" | année : "+this.annee+" | groupe : "+this.groupe+" | frais : "+this.fraisScola;
	}

	
	
	
	
	
	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public double getFraisScola() {
		return fraisScola;
	}

	public void setFraisScola(double fraisScola) {
		this.fraisScola = fraisScola;
	}
	
	
	
}
