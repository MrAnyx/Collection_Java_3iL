import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Eleve> liste = new ArrayList<>();
		
		
		Eleve eleve = new Eleve("michel", "dupond", 23);
		liste.add(eleve);
		Eleve eleve1 = new Eleve("patrick", "troncard", 26);
		liste.add(eleve1);
		Eleve eleve2 = new Eleve("henry", "Allain", 56);
		liste.add(eleve2);
		Eleve eleve3 = new Eleve("xavier", "chevallereau", 15);
		liste.add(eleve3);
		
		//for
		for(int i = 0; i<4; i++) {
			System.out.println(liste.get(i).getNom());
		}
		
		System.out.println("--------------------------------");
		
		Collections.sort(liste);
		
		for(int i = 0; i<4; i++) {
			System.out.println(liste.get(i).getNom());
		}
		
//		System.out.println("--------------------------------");
//		
//		for(Eleve tmp : liste) {
//			System.out.println(tmp.getNom());
//		}
//		
//		System.out.println("--------------------------------");
//
//		
//		Iterator<Eleve> it = liste.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next().getNom());
//		}
		
	}

}
