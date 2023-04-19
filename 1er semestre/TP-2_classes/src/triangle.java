import javax.swing.JOptionPane;

public class Triangle {
	
	private int hauteur;
	
	
	public Triangle(int hauteur){
		this.hauteur = hauteur;
	}
	
	
	public void afficher_triangle() {
		for(int i = 0; i<this.hauteur; i++) {
			
			for(int k=this.hauteur-1; k>i; k--) {
				System.out.print(" ");
			}
			for(int j = 1; j<i*2+2; j++) {
				
				System.out.print("o");
			}
				
			System.out.println("");
		}
		
	}
	
	public static void test() {
		Triangle t = new Triangle(5);
		t.afficher_triangle();
	}
}













