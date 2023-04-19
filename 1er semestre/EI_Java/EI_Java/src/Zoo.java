import java.text.DecimalFormat;//pour le format des decimales
import java.text.NumberFormat;

public class Zoo {
	private Animal[] animaux;
	private Nourriture[] nourriture;
	private int nombreAnimaux;
	
	Zoo(){
		this.nombreAnimaux = 0;
		animaux = new Animal[50];
		nourriture = new Nourriture[50];
	}
	
	public void ajouterAnimal(String nomAnimal, String especeAnimal) {

		Animal a = new Animal(nomAnimal, especeAnimal);
		this.animaux[this.nombreAnimaux] = a;
		this.nombreAnimaux++;
		
	}
	
	public void ajouterNourriture(String type, double calories) {

		Nourriture n = new Nourriture(type, calories);
		this.nourriture[this.nombreAnimaux] = n;
		
	}
	
	public void afficherBesoins() {
		
		NumberFormat format = new DecimalFormat("#0.00"); //pour le format des decimales  
		
		double totalCalorieCarnivore = 0;
		double totalCalorieHerbivore = 0;
		
		
		/*
                           /\
                          //\\
                       ~~~~~~~~~~          _____________________________
                >>-----| o    o |---->    /                             \
                      (|   ^^   |)   OOOO/ Bonjour je m'appelle sanklote \
                       |▓ ---- ▓|OOOO    \_______________________________/
                       |▓▓▓▓▓▓▓▓|
                          |  |
                     ____/    \____
                    /              \
                    |   |      |   |
                    |   |      |   |
                    |   |      |   |
                    |   |      |   |
                    \___|______|___/
                        |/    \| |
                        |  ||  | |_| 
                        |  ||  |
                        |  ||  |
                        |  ||  |
                        |__||__|
               |\_______|  ||  |_______/|
               \___________||___________/
            
         

		*/
		
		
		
		for(int i = 0; i<this.nombreAnimaux; i++) {
			if(this.animaux[i].getRegime().equals("Carnivore")) {
				totalCalorieCarnivore += this.animaux[i].getCaloriesJour();
			}
			
			else if(this.animaux[i].getRegime().equals("Herbivore")) {
				totalCalorieHerbivore += this.animaux[i].getCaloriesJour();
			}
			
		}
		System.out.println("Les animaux carnivores doivent manger : "+ totalCalorieCarnivore +" calories au total");
		System.out.println("il faut donc : "+ format.format(Math.ceil(totalCalorieCarnivore/537))+"Kg de viande");
		System.out.println("\nLes animaux herbivore doivent manger : "+ totalCalorieHerbivore +" calories au total");
		System.out.println("il faut donc : "+ format.format(Math.ceil(totalCalorieHerbivore/158))+"Kg de gazon");
	}
	
	

	public Animal[] getAnimaux() {
		return animaux;
	}

	public void setAnimaux(Animal[] animaux) {
		this.animaux = animaux;
	}

	public Nourriture[] getNourriture() {
		return nourriture;
	}

	public void setNourriture(Nourriture[] nourriture) {
		this.nourriture = nourriture;
	}

	public int getNombreAnimaux() {
		return nombreAnimaux;
	}

	public void setNombreAnimaux(int nombreAnimaux) {
		this.nombreAnimaux = nombreAnimaux;
	}
	
	
}
