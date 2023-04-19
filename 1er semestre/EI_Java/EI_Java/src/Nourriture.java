
public class Nourriture {
	private String type;
	private double calories;
	
	Nourriture(String type, double calories){
		this.type = type;
		this.calories = calories;
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}
}
