
public class Eleve implements Comparable<Eleve>{
	private String nom;
	private String prenom;
	private int age;
	
	Eleve(String nom, String prenom, int age){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Eleve autre) {
		return this.nom.compareTo(autre.getNom());
	}
	
	
	
	
	
	
}
