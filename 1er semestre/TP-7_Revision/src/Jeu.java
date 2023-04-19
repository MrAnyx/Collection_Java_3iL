
public class Jeu {
	
	private Roulette r;
	private int maxiCur;
	private int miniCur;
	private int maxiAbs;
	private int miniAbs;
	
	Jeu(){
		
	}
	
	void play(int nbValeur, int nbParties) {
		this.maxiAbs = 1;
		this.miniAbs = 1;
		for(int i = 0; i<nbParties; i++) {
			
		
			this.r = new Roulette(nbValeur);
			this.maxiCur = this.r.getNbValeur();
			this.miniCur = this.r.getNbValeur();
			while(this.r.getNbValeur() > 1) {
				this.r = new Roulette(this.r.getNbValeur());
				if(this.r.getNbValeur()<miniCur)miniCur = this.r.getNbValeur();
				if(this.r.getNbValeur()>maxiCur)maxiCur = this.r.getNbValeur();
			}
			
			if(maxiAbs < maxiCur)maxiAbs = maxiCur;
			if(miniAbs > miniCur)miniAbs = miniCur;
			
			
			System.out.println("Game O-O-OVER !!");
			
			
		}
	}
	
	int getMaxi() {
		return this.maxiAbs;
	}
	int getMini() {
		return this.miniAbs;
	}
	
}
