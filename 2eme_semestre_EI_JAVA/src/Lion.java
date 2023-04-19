import java.io.Serializable;

public class Lion extends Animal implements Serializable{
	
	private int epaisseurCriniere;
	
	Lion(String bouche, String regime, String habitat, int criniere){
		super(bouche, regime, habitat);
		this.epaisseurCriniere = criniere;
	}
	
	
	
	public void attaquerUnVillageois() {
		System.out.println("j'attaque un villageois grâce à ma "+this.typeDeBouche);
	}

	@Override
	public void deplacement() {
		System.out.println("je me deplace en marchant dans "+this.habitat);
		
	}
	@Override
	public void manger() {
		System.out.println("j'ai l'habiture de manger "+this.regimeAlimentaire);
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
	public int getEpaisseurCriniere() {
		return this.epaisseurCriniere;
	}
	
	public String toString() {
		return this.typeDeBouche+"-"+this.regimeAlimentaire+"-"+this.habitat+"-"+this.epaisseurCriniere;
	}
	
	
}
