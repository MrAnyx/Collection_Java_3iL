import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Figure2D> liste = new ArrayList<Figure2D>();
		
		for(int i = 0; i<10; i++) {
			if(i < 5) {	
				double x = (int)(Math.random()*10);
				double y = (int)(Math.random()*10);
				Point p1 = new Point(x, y);
				Point p2 = new Point(0,0);
				Rectangle rect = new Rectangle(p1, p2);
				liste.add(rect);
			}
			else {
				double rayon = (int)(Math.random()*10);
				Point p1 = new Point(0,0);
				Cercle cercle = new Cercle(p1, rayon);
				liste.add(cercle);
			}
		}
		
		
		//avec for each
		double sommeAire = 0;
		double sommePerimetre = 0;
		for(Figure2D tmp : liste) {
			sommeAire+=tmp.aire();
			sommePerimetre+=tmp.perimetre();
		}
		System.out.println("avec le for each : ");
		System.out.println("la somme des aires vaut : "+sommeAire);
		System.out.println("la somme des perimetres vaut : "+sommePerimetre);

		
		//avec iterator
		sommeAire = 0;
		sommePerimetre = 0;
		Iterator<Figure2D> it = liste.iterator();
		while(it.hasNext()) {
			Figure2D test = it.next();
			sommeAire+=test.aire();
			sommePerimetre+=test.perimetre();
		}
		System.out.println("\navec le iterator : ");
		System.out.println("la somme des aires vaut : "+sommeAire);
		System.out.println("la somme des perimetres vaut : "+sommePerimetre);

		
		
	}

}
