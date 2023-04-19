
public class Rectangle implements Figure2D{
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

	public double perimetre() {
		return 2*(getHauteur()+getLargeur());
		
	}
	
	public double aire() {
		return getHauteur()*getLargeur();
	}
	

}
