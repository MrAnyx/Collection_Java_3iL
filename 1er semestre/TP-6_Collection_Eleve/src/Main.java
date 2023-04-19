import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Eleve> listeEleve = new ArrayList<Eleve>();		
		for(int i = 0; i<5; i++) {
			Eleve tmp = new Eleve();
			listeEleve.add(tmp);
		}
		
		
		System.out.print("pas triée -----> ");
		System.out.print(listeEleve);
		
		Collections.sort(listeEleve);//faisable grave a l'implementation de l'interface comparable dans la class Eleve avec la methode compareTo()
		
		System.out.print("\ntriée ---------> ");
		System.out.print(listeEleve);
		
		
		
		//affichage
		//1ère méthode - for
		System.out.print("\n\n1ère methode : for ------->");
		for(int i = 0; i<listeEleve.size(); i++) {
			System.out.print(" " + listeEleve.get(i));
		}
		
		System.out.println("");
		
		//2eme methode - for each
		System.out.print("2ème methode : for each -->");
		for(Eleve tmp : listeEleve) {
			System.out.print(" "+tmp);
		}
		
		System.out.println("");
		
		//3eme méthode - iterator
		Iterator<Eleve> it = listeEleve.iterator();
		System.out.print("3ème methode : iterator -->");
		while(it.hasNext()) {
			System.out.print(" " + it.next());
		}

	}

}

