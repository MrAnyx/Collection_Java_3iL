import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		Zoo zoo = new Zoo();
		Nourriture n1 = new Nourriture("gazon", 158);
		Nourriture n2 = new Nourriture("viande", 537);
		Nourriture[] listeNourriture = {n1, n2};
		
		zoo.setNourriture(listeNourriture);
		String choix = "";
		Object[] listeChoix = {"Ajouter un Animal", "Calculer les besoins en nourriture", "Quitter"};
		
		
		while(!choix.equals("Quitter")) {
			choix = (String)JOptionPane.showInputDialog(null,
					"Faites un choix",
					"Menu",
					JOptionPane.PLAIN_MESSAGE,
					null,
					listeChoix,
					"0");
			
			if(choix.equals("Ajouter un Animal")) {
				
				Object[] listeEspeceAnimaux = {"Lion", "Girafe", "Caribou"};
				String nomAnimalchoix = (String)JOptionPane.showInputDialog(null,
							"Entrez le nom de l'animal",
							"Zoo",
							JOptionPane.PLAIN_MESSAGE,
							null,
							null,
							"Michel");
				
				String especeAnimalchoix = (String)JOptionPane.showInputDialog(null,
							"Quelle est l'espèce de l'animal",
							"Zoo",
							JOptionPane.PLAIN_MESSAGE,
							null,
							listeEspeceAnimaux,
							"0");
				
				zoo.ajouterAnimal(nomAnimalchoix, especeAnimalchoix);
				
			}
			else if(choix.equals("Calculer les besoins en nourriture")) {
				zoo.afficherBesoins();
			}
		}
	}
	
	
	
	
	
	
	
}
