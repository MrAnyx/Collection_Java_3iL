
public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Point p) {
		double res;
		res = Math.sqrt(Math.pow(this.x-p.x, 2) + Math.pow(this.y-p.y, 2));
		//System.out.println("La distance entre le point (" + this.x + "," + this.y + ") et le point (" + p.x + "," + p.y + ") vaut : " + res);
		return res;
	}
	
	public double distance() {
		Point tmp = new Point(0,0);
		double res = distance(tmp);
		return res;
	}
	
	
	public double distance(int x, int y) {
		Point tmp = new Point(x,y);
		double res = distance(tmp);
		return res;
	}
	
	public String toString() {

		String var;
		var = "x = " + this.x + ", y = " + this.y;
		return var;
		
	}
	
	//getters pour x et y
	public double get_x() {
		return this.x;
	}
	
	public double get_y() {
		return this.y;
	}
	public double[] get_xy() {
		double[] tab_coord = new double[2];
		tab_coord[0] = get_x();
		tab_coord[1] = get_y();
		return tab_coord;
	}
	
	public void set_x(double x) {
		this.x = x;
	}
	public void set_y(double y) {
		this.y = y;
	}
	public void set_xy(double x, double y) {
		set_x(x);
		set_y(y);
	}
	
	
	
	public static void test() {
		Point p1 = new Point(2,2);
		Point p2 = new Point(4,3);
		
		p1.distance();//distance a l'origine
		p2.distance();
		p2.distance(p1);//entre p1 et p2
		p2.distance(9, 9);//entre p2 et le point (9,9)
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.set_xy(0,9);
		System.out.println("la nouvelle valeur de p1 est : ");
		System.out.println(p1);
	}
	
	
}
