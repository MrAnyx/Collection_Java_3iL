import java.io.Serializable;

public abstract class Animal implements Serializable{
	
	protected String typeDeBouche;
	protected String regimeAlimentaire;
	protected String habitat;
	
	
	Animal(String bouche, String regime, String habitat){
		this.typeDeBouche = bouche;
		this.regimeAlimentaire = regime;
		this.habitat = habitat;
	}
	
	
	
	public abstract void deplacement(); //on va devoir redéfinire les fonctions deplacement et manger
	public abstract void manger();
	
	
	
	
	
	
	
	
}
