public class Point2D {
	protected float x;
	protected float y;
	
	
	
	Point2D(float x, float y){
		this.x = x;
		this.y = y;
	}
	Point2D(){
		this.x = 0;
		this.y = 0;
	}
	
	
	public String toString() {
		return "(" + this.x+", "+this.y+")";
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	
	
}
