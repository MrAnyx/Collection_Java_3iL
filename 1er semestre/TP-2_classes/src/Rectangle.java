
public class Rectangle {
	private Point A;
	private Point B;
	
	
	public Rectangle(Point p1, Point p2) {
		this.A = p1;
		this.B = p2;
	}
	
	public double getHauteur() {
		return Math.abs(this.A.get_y() - this.B.get_y());	
	}
	
	public double getLargeur() {
		return Math.abs(this.A.get_x() - this.B.get_x());		
	}
	
	public double getPerimetre() {
		return 2*getHauteur()+2*getLargeur();
	}
	
	public double getSurface() {
		return getLargeur()*getHauteur();
	}
	
	public boolean isIn(Point p) {
		double xMax = Math.max(this.A.get_x(), this.B.get_x()); //on récupère les valeurs de xMax et xMin
		double xMin = Math.min(this.A.get_x(), this.B.get_x());
		
		double yMax = Math.max(this.A.get_y(), this.B.get_y()); //on récupère les valeurs de yMax et yMin
		double yMin = Math.min(this.A.get_y(), this.B.get_y());
		
		if(p.get_x() <= xMax && p.get_x() >= xMin &&  p.get_y() <= yMax && p.get_y() >= yMin) 
			return true;
		else 
			return false;
		
	}

	public static void test() {
		Point p1 = new Point(4,3);
		Point p2 = new Point(1,1);
		
		Point p3 = new Point(3,3);
		Point p4 = new Point(4,2);
		
		Rectangle rect = new Rectangle(p1, p2);
		
		System.out.println("la hauteur du rectangle est de : " + rect.getHauteur());
		System.out.println("la largeur du rectangle est de : " + rect.getLargeur());
		System.out.println("le perimetre du rectangle est de : " + rect.getPerimetre());
		System.out.println("la surface du rectangle est de : " + rect.getSurface());
		System.out.println("le point p3 est dans le rectangle ? : " + rect.isIn(p3));
		System.out.println("le point p4 est dans le rectangle ? : " + rect.isIn(p4));
		
		
	}
	
	
	
	
	
	
}
