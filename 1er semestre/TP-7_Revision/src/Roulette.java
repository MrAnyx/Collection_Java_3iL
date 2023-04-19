import javax.swing.JOptionPane;

public class Roulette {
	private int nbValeurFinal;
	private int choixVal;
	private int randomVal;
	
	Roulette(int nbValeur){
		nbValeurFinal = nbValeur;
		String[] tabValeur = new String[nbValeur];
		for(int i = 0; i<nbValeur; i++) {
			tabValeur[i] = Integer.toString(i+1);
		}
		String choixValTab = (String)JOptionPane.showInputDialog(null, "Choisissez une valeur", "valeur : ", JOptionPane.PLAIN_MESSAGE, null, tabValeur, "");
		
		choixVal = Integer.parseInt(choixValTab);
		randomVal = (int)Math.floor(Math.random()*nbValeur)+1;
		
		if(choixVal == randomVal) {
			nbValeurFinal = (int) Math.floor(nbValeur/2);
		}
		else {
			nbValeurFinal++;
			if(nbValeurFinal>100)nbValeurFinal = 100;
		}
		
		System.out.println("il y a " + this.getNbValeur() + " valeur(s) dans le tableau");
		System.out.println("vous avez choisi le nombre : " + this.getChoixNb());
		System.out.println("le nombre random choisi est : " + this.getRandomVal());
	}
	
	int getNbValeur() {
		return this.nbValeurFinal;
	}
	int getChoixNb() {
		return  this.choixVal;
	}
	int getRandomVal() {
		return  this.randomVal;
	}

}

