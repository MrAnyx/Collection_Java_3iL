
public abstract class Forme {
	protected String color;
	protected Boolean remplie;
	
	
	
	Forme(String color, Boolean remplie){
		this.color = color;
		this.remplie = remplie;
	}
	Forme(){
		this.color = "noir";
		this.remplie = true;
	}
	
	
	
	
	public String toString() {
		return "couleur : " + this.color+ "\nremplie : "+this.remplie;
	}
	
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getRemplie() {
		return remplie;
	}
	public void setRemplie(Boolean remplie) {
		this.remplie = remplie;
	}
	
	public abstract double getAire();
	public abstract double getPerimetre();
	
	
	
}
