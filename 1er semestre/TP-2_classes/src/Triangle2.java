
public class Triangle2 {
	private Point p1;
	private Point p2;
	private Point p3;
	
	public Triangle2(Point A, Point B, Point C) {
		this.p1 = A;
		this.p2 = B;
		this.p3 = C;
	}
	
	public double getPerimetre(){
		return this.p1.distance(this.p2)+this.p2.distance(this.p3)+this.p3.distance(this.p1);
	}
	
	
	public boolean isEquialteral() {
		if(this.p1.distance(this.p2) == this.p2.distance(this.p3) && this.p2.distance(this.p3) == this.p3.distance(this.p1)) return true;
		else return false;
	}
	
	
	public boolean isIsocele() {
		if(	this.p1.distance(this.p2) == this.p2.distance(this.p3) || 
			this.p2.distance(this.p3) == this.p3.distance(this.p1) ||
			this.p3.distance(this.p1) == this.p1.distance(this.p2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isRectangle() {
		if(	(int)Math.pow(this.p1.distance(this.p2), 2) + Math.pow(this.p2.distance(this.p3), 2) == (int)Math.pow(this.p3.distance(this.p1), 2) ||
			(int)Math.pow(this.p2.distance(this.p3), 2) + Math.pow(this.p1.distance(this.p3), 2) == (int)Math.pow(this.p2.distance(this.p1), 2) ||
			(int)Math.pow(this.p3.distance(this.p1), 2) + Math.pow(this.p1.distance(this.p2), 2) == (int)Math.pow(this.p2.distance(this.p3), 2)){
			return true;
		}
		else return false;
	}
	
	
	public static void test() {
		Point p1 = new Point(0,0);
		Point p2 = new Point(0,4);
		Point p3 = new Point(2,2);
		
		Triangle2 tri = new Triangle2(p1, p2, p3);
		
		System.out.println("le périmetre du triangle est de : " + tri.getPerimetre());
		System.out.println("le triangle est-il équialeral ? : " + tri.isEquialteral());
		System.out.println("le triangle est-il isocele ? : " + tri.isIsocele());
		System.out.println("le triangle est-il rectangle ? : " + tri.isRectangle());
	}
	
	
}
