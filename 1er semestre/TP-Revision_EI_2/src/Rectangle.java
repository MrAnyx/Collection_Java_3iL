
public class Rectangle implements Figure2D{
	private Point p;
	
	Rectangle(Point p){
		this.p = p;
	}
	
	
	
	public double perimetre() {
		return 2*(this.p.get_x()+this.p.get_y());
	}

	
	public double aire() {
		return this.p.get_x()*this.p.get_y();
	}
	
}
