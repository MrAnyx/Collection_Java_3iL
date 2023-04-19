
public class Cercle {
	private Point P;
	private double rayon;
	
	public Cercle(Point p, double ray) {
		this.P = p;
		this.rayon = ray;
	}
	
	public double getPerimetre() {
		return 2*Math.PI*this.rayon;
	}
	
	public double getSurface() {
		return Math.PI*Math.pow(this.rayon, 2);
	}
	
	public boolean isIn(Point test) {
		if(this.P.distance(test) > this.rayon) 
			return false;
		else 
			return true;
	}
	
	public static void test() {
		Point p1 = new Point(2,2);
		Point p2 = new Point(2,3);
		double ray = 2;
		
		Cercle circle = new Cercle(p1, ray);
		
		System.out.println("le périmetre du cercle est de : " + circle.getPerimetre());
		System.out.println("la surface du cercle est de : " + circle.getSurface());
		System.out.println("le point p2 est dans le cercle ? :" + circle.isIn(p2));
	}
}
