
public class Personne {
	
	private String nom;
	private String prenom;
	
	Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	public String toString() {
		return "nom : "+this.nom+" | prenom : "+this.prenom;
	}

	
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
}
	
	
	
