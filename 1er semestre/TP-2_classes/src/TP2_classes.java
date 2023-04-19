
import javax.swing.JOptionPane;

public class TP2_classes {

	
	public static void main(String[] args) {
		boolean continuer = true;
		
		
		do {
			Object[] menu = {"triangle", "test_triangle", "random", "test_random", "points", "points_test", "rectangle", "rectangle_test", "cercle", "cercle_test", "triangle2", "triangle2_test", "quitter"};
			String signe = (String)JOptionPane.showInputDialog(null, "Selectionnez un type d'operation : ", "Signe", JOptionPane.PLAIN_MESSAGE, null, menu, "default");
			
			
			if(signe.equals("triangle")) {
				
				String hauteur_entry = (String)JOptionPane.showInputDialog(null, "Entrez une hauteur pour le triangle : ", "Triangle", JOptionPane.PLAIN_MESSAGE, null, null, "1");
				int hauteur = Integer.parseInt(hauteur_entry);
				
				Triangle t = new Triangle(hauteur);//on peut mettre n'importe quelle valeur, c'est juste pour le test
				t.afficher_triangle();
			}
			
			else if(signe.equals("test_triangle")) {
				Triangle.test();
			}
			else if(signe.equals("random")) {
				Random rand = new Random();
				rand.get();
				rand.afficher_triangle_random();
			}	
			
			
			else if(signe.equals("test_random")) {
				Random nb_random = new Random();
				nb_random.test();
			}
			
			else if(signe.equals("points_test")) {
				Point.test();
				
			}
			else if(signe.equals("points")) {
				
				String x1_entry = (String)JOptionPane.showInputDialog(null, "x1 : ", "Point1", JOptionPane.PLAIN_MESSAGE, null, null, "0");
				String y1_entry = (String)JOptionPane.showInputDialog(null, "y1 : ", "Point1", JOptionPane.PLAIN_MESSAGE, null, null, "0");

				String x2_entry = (String)JOptionPane.showInputDialog(null, "x2 : ", "Point2", JOptionPane.PLAIN_MESSAGE, null, null, "0");
				String y2_entry = (String)JOptionPane.showInputDialog(null, "y2 : ", "Point2", JOptionPane.PLAIN_MESSAGE, null, null, "0");
				
				int x1 = Integer.parseInt(x1_entry);
				int y1 = Integer.parseInt(y1_entry);
				
				int x2 = Integer.parseInt(x2_entry);
				int y2 = Integer.parseInt(y2_entry);
				
				Point p1 = new Point(x1,y1);
				Point p2 = new Point(x2,y2);
				
				p1.distance();//distance a l'origine
				p2.distance();
				p2.distance(p1);//entre p1 et p2
				p2.distance(10, 10);//entre p2 et le point (9,9)
				
				System.out.println(p1);
				System.out.println(p2);
				
			}
			
			else if(signe.equals("rectangle")) {
				String x1_entry = (String)JOptionPane.showInputDialog(null, "x1 : ", "rectangle", JOptionPane.PLAIN_MESSAGE, null, null, "0");
				String y1_entry = (String)JOptionPane.showInputDialog(null, "y1 : ", "rectangle", JOptionPane.PLAIN_MESSAGE, null, null, "0");

				String x2_entry = (String)JOptionPane.showInputDialog(null, "x2 : ", "rectangle", JOptionPane.PLAIN_MESSAGE, null, null, "0");
				String y2_entry = (String)JOptionPane.showInputDialog(null, "y2 : ", "rectangle", JOptionPane.PLAIN_MESSAGE, null, null, "0");
				
				Point p1 = new Point(Integer.parseInt(x1_entry),Integer.parseInt(y1_entry));
				Point p2 = new Point(Integer.parseInt(x2_entry),Integer.parseInt(y2_entry));
				
				Point p = new Point(1,5);
				
				Rectangle rect = new Rectangle(p1, p2);
				
			
				System.out.println(rect.getHauteur());
				System.out.println(rect.getLargeur());
				System.out.println(rect.getPerimetre());
				System.out.println(rect.getSurface());
				System.out.println(rect.isIn(p));
			
			}
			
			else if(signe.equals("rectangle_test")) {
				Rectangle.test();
			}
			
			else if(signe.equals("cercle")) {
				String x1_entry = (String)JOptionPane.showInputDialog(null, "x1 : ", "cercle", JOptionPane.PLAIN_MESSAGE, null, null, "0");
				String y1_entry = (String)JOptionPane.showInputDialog(null, "y1 : ", "cercle", JOptionPane.PLAIN_MESSAGE, null, null, "0");

				String ray = (String)JOptionPane.showInputDialog(null, "Rayon : ", "cercle", JOptionPane.PLAIN_MESSAGE, null, null, "0");

				
				
				Point p1 = new Point(Integer.parseInt(x1_entry),Integer.parseInt(y1_entry));
				double rayon = Integer.parseInt(ray);
				
				Point p = new Point(2,3);
				
				Cercle circle = new Cercle(p1, rayon);
				
				System.out.println("le périmetre du cercle est de : " + circle.getPerimetre());
				System.out.println("la surface du cercle est de : " + circle.getSurface());
				System.out.println("le point p est dans le cercle ? :" + circle.isIn(p));
				
				
			}
			
			else if(signe.equals("cercle_test")) {
				Rectangle.test();
			}
			
			else if(signe.equals("triangle2")) {
				String x1_entry = (String)JOptionPane.showInputDialog(null, "x1 : ", "triangle2", JOptionPane.PLAIN_MESSAGE, null, null, "0");
				String y1_entry = (String)JOptionPane.showInputDialog(null, "y1 : ", "triangle2", JOptionPane.PLAIN_MESSAGE, null, null, "0");

				String x2_entry = (String)JOptionPane.showInputDialog(null, "x2 : ", "triangle2", JOptionPane.PLAIN_MESSAGE, null, null, "0");
				String y2_entry = (String)JOptionPane.showInputDialog(null, "y2 : ", "triangle2", JOptionPane.PLAIN_MESSAGE, null, null, "0");

				String x3_entry = (String)JOptionPane.showInputDialog(null, "x3 : ", "triangle2", JOptionPane.PLAIN_MESSAGE, null, null, "0");
				String y3_entry = (String)JOptionPane.showInputDialog(null, "y3 : ", "triangle2", JOptionPane.PLAIN_MESSAGE, null, null, "0");

				
				
				
				Point p1 = new Point(Integer.parseInt(x1_entry),Integer.parseInt(y1_entry));
				Point p2 = new Point(Integer.parseInt(x2_entry),Integer.parseInt(y2_entry));
				Point p3 = new Point(Integer.parseInt(x3_entry),Integer.parseInt(y3_entry));
				
				Triangle2 tritri = new Triangle2(p1, p2, p3);
				
				System.out.println("le périmetre du triangle est de : " + tritri.getPerimetre());
				System.out.println("le triangle est-il équialeral ? : " + tritri.isEquialteral());
				System.out.println("le triangle est-il isocele ? :" + tritri.isIsocele());
				System.out.println("le triangle est-il rectangle ? : " + tritri.isRectangle());
				
			}
			
			else if(signe.equals("triangle2_test")) {
				Triangle2.test();
			}
			
			
			
			else if(signe.equals("quitter")) {
				continuer = false;
			}
		
			
			
			
			
			
		}while(continuer != false);
		
		
		
	}

}
