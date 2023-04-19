import javax.swing.JOptionPane;

public class Calculatrice {

	
	public static float sum(float a, float b) {
		return a+b;
	}
	
	public static float sous(float a, float b) {
		return a-b;
	}
	
	public static float mult(float a, float b) {
		return a*b;
	}
	
	public static float div(float a, float b) {
		return a/b;
	}
	
	
	
	public static void main(String[] args) {
		
		Boolean continuer = false;
		do {
			Object[] tabSigne = {"sum", "sous", "mult", "div", "quit"};
			
			String var1 = (String)JOptionPane.showInputDialog(null, "Entrez un première valeur : ", "Première Valeur", JOptionPane.PLAIN_MESSAGE, null, null, "0");
			String signe = (String)JOptionPane.showInputDialog(null, "Selectionnez un type d'operation : ", "Signe", JOptionPane.PLAIN_MESSAGE, null, tabSigne, "default");
			String var2 = (String)JOptionPane.showInputDialog(null, "Entrez une deuxième valeur : ", "Deuxième valeur", JOptionPane.PLAIN_MESSAGE, null, null, "0");
			
			
			float n1 = Float.parseFloat(var1); //pour convertir en float
			float n2 = Float.parseFloat(var2);
			
			/*
			switch(signe) {
				case "sum":
					System.out.println(sum(n1,n2));
					break;
					
				case "sous":
					System.out.println(sous(n1,n2));
					break;
					
				case "mult":
					System.out.println(mult(n1,n2));
					break;
					
				case "div":
					System.out.println(div(n1,n2));
					break;
					
					OU
			*/
			
			if(signe.equals("sum")) {
				System.out.println(n1 + " + " + n2 + " = " + sum(n1,n2));
			}
			else if(signe.equals("sous")) {
				System.out.println(n1 + " - " + n2 + " = " + sous(n1,n2));
			}
			else if(signe.equals("mult")) {
				System.out.println(n1 + " x " + n2 + " = " + mult(n1,n2));
			}
			else if(signe.equals("div")) {
				System.out.println(n1 + " / " + n2 + " = " + div(n1,n2));
			}
			else if(signe.equals("quit")) {
				continuer = true;
			}
			
		}while(continuer == false);
		
	}

}
