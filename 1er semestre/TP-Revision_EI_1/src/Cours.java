
public class Cours {
	private int salle;
	private String nomCours;
	private String prof;
	
	Cours(int salle, String nomCours, String prof){
		try {
			setSalle(salle);
			setNomCours(nomCours);
			setProf(prof);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public int getSalle() {
		return salle;
	}

	public void setSalle(int salle) throws Exception{
		if(salle > 0) {
			this.salle = salle;
		}
		else {
			throw(new Exception("Erreur : salle invalide"));
		}
	}

	public String getNomCours() {
		return nomCours;
	}

	public void setNomCours(String nomCours) throws Exception{
		if(!nomCours.equals("test")) {
			this.nomCours = nomCours;
		}
		else {
			throw(new Exception("Erreur : cours invalide"));
		}
		
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) throws Exception{
		if(!prof.equals("test")) {
			this.prof = prof;
		}
		else {
			throw(new Exception("Erreur : prof invalide"));
		}
		
	}
	
	public String toString(){
		return "Le cours de "+this.nomCours+" se passe en salle "+this.salle+" avec "+this.prof;
	}
	
	
}
