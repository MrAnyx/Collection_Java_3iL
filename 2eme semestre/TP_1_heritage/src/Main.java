
public class Main {

	public static void main(String[] args) {
		
		Cercle c = new Cercle();
		System.out.println(c);
		System.out.println("Aire : " + c.getAire());
		System.out.println("Couleur : " + c.getCouleur());
		System.out.println("Rayon : " + c.getRayon());
		
		System.out.println("--------------------------------------------------------------------------------");
		
		Cylindre cyl = new Cylindre(2, 4);
		System.out.println(cyl);
		System.out.println("Volume : " + cyl.getVolume());
		System.out.println("Hauteur : " + cyl.getHauteur());
		System.out.println("Couleur : " + cyl.getCouleur());
		System.out.println("Rayon : " + cyl.getRayon());
		System.out.println("Aire : " + cyl.getAire());

		
	}

}
