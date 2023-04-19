
public class Animal {
	private String nom;
	private String espece;
	private double poids;
	private double taille;
	private int caloriesJour;
	private String regime;
	
	Animal(String nom, String espece){//on suppose que l'utilisateur entre soit lion, girafe, caribou, pas autre chose
		
		//on met toutes les lettres en minuscule
		nom = nom.toLowerCase();
		
		//on met la première lettre en majuscule
		String nomTmp = nom;
		char[] listeCharNomTmp = nomTmp.toCharArray();
		listeCharNomTmp[0] = Character.toUpperCase(listeCharNomTmp[0]);
		nomTmp = new String(listeCharNomTmp);
		
		
		this.nom = nomTmp;
		this.espece = espece;
		
		if(espece.equals("Lion")) {
			this.poids = (Math.random()*200)+400;
			this.taille = (Math.random()*0.5)+1.5;
			this.caloriesJour = (int) (5*this.poids);
			this.regime = "Carnivore";
		}
		else if(espece.equals("Girafe")) {
			this.poids = (Math.random()*2000)+3000;
			this.taille = (Math.random()*3.4)+6.3;
			this.caloriesJour = (int) (1.85*this.poids);
			this.regime = "Herbivore";
		}
		else if(espece.equals("Caribou")) {
			this.poids = (Math.random()*1500)+1500;
			this.taille = (Math.random()*1.1)+2.3;
			this.caloriesJour = (int) (1.5*this.poids);
			this.regime = "Herbivore";
		}
		
		
	}

	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public int getCaloriesJour() {
		return caloriesJour;
	}

	public void setCaloriesJour(int caloriesJour) {
		this.caloriesJour = caloriesJour;
	}

	public String getRegime() {
		return regime;
	}

	public void setRegime(String regime) {
		this.regime = regime;
	}
	
	
}
