import java.io.Serializable;

public class Dauphin extends Animal implements Serializable{
	
	private int tailleNageoire;
	
	Dauphin(String bouche, String regime, String habitat, int nageoire){
		super(bouche, regime, habitat);
		this.tailleNageoire = nageoire;
	}
	
	
	
	
	public void sauverUnNageur() {
		System.out.println("hier, j'ai sauver un nageur de "+this.habitat);
	}

	@Override
	public void deplacement() {
		System.out.println("je me ddeplace dans "+this.habitat);
		
	}
	@Override
	public void manger() {
		System.out.println("j'aime manger "+this.regimeAlimentaire);
		
	}
	
	public String getTypeBouche() {
		return this.typeDeBouche;
	}
	public String getRegime() {
		return this.regimeAlimentaire;
	}
	public String getHabitat() {
		return this.habitat;
	}
	public int getTailleNageoire() {
		return this.tailleNageoire;
	}
	
	
	public String toString() {
		return this.typeDeBouche+"-"+this.regimeAlimentaire+"-"+this.habitat+"-"+this.tailleNageoire;
	}
	
}
