
public class Personnel extends Personne{
	private String ecole;
	private double paie;
	
	Personnel(String nom, String prenom, String ecole, double paie){
		super(nom, prenom);
		this.ecole = ecole;
		this.paie = paie;
	}
	
	
	
	
	
	public String toString() {
		return super.toString()+" | école : "+this.ecole+" | paie : "+this.paie;
	}





	public String getEcole() {
		return ecole;
	}
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	public double getPaie() {
		return paie;
	}
	public void setPaie(double paie) {
		this.paie = paie;
	}
	
	
	
	
	
	
	

}
