import javax.swing.JOptionPane;

public class Eleve implements Comparable<Eleve>{
	private String nom;
	private String prenom;
	
	public Eleve(){
		String prenom1 = (String)JOptionPane.showInputDialog(null, "Entrez un prenom : ", "Prenom", JOptionPane.PLAIN_MESSAGE, null, null, "");
		String nom1 = (String)JOptionPane.showInputDialog(null, "Entrez un nom : ", "Nom", JOptionPane.PLAIN_MESSAGE, null, null, "");

		this.nom = nom1;
		this.prenom = prenom1;
	}
	
	public String toString() {
		return this.prenom + this.nom;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public int compareTo(Eleve autreEleve) {
		return (this.prenom.compareTo(autreEleve.getPrenom()) != 0) ? this.nom.compareTo(autreEleve.getNom()) : this.prenom.compareTo(autreEleve.getPrenom());
	}
	
	
}
	
	
	
