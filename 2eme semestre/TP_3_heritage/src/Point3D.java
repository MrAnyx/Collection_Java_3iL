public class Point3D extends Point2D{
	protected float z;
	
	
	Point3D(float x, float y, float z){
		super(x, y);
		this.z = z;
	}
	Point3D(){
		super();
		this.z = 0;
	}
	
	
	
	public String toString() {
		return "("+this.x+", "+this.y+", "+this.z+")";
	}
	
	
	
	
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	
	
	
	
}
