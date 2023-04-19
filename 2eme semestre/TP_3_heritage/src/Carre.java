
public class Carre extends Rectangle{
	
	Carre(){
		super();
	}
	Carre(double cote){
		super(cote, cote);
	}
	Carre(double cote, String color, boolean remplie){
		super(cote, cote, color, remplie);
	}
	
	
	public double getCote() {
		return super.getLargeur();
	}
	public void setCote(double cote) {
		super.setLargeur(cote);
		super.setLongueur(cote);
	}
	
	
	public void setLargeur(double largeur) {
		setCote(largeur);
	}
	public void setLongueur(double longueur) {
		setCote(longueur);
	}
	
	
	public String getColor() {
		return super.getColor();
	}
	public void setColor(String color) {
		super.setColor(color);
	}
	public Boolean getRemplie() {
		return super.getRemplie();
	}
	public void setRemplie(Boolean remplie) {
		super.setRemplie(remplie);
	}
	
	
	
	public double getAire() {
		return super.getAire();
	}
	public double getPerimetre() {
		return super.getPerimetre();
	}
	
	
	
	public String toString() {
		return super.toString();
	}
}
