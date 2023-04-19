import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("2f5yrFGi8q");
		liste.add("nZ0m7DrQfC");
		liste.add("4etgvGr0At");
		liste.add("de5xgKxM18");
		liste.add("98iUSwarHH");
		liste.add("0gIL8RVIME");
		liste.add("ZZ01199RTY");
		liste.add("REfU5cpHoL");
		liste.add("7i6VZMOGvu");
		liste.add("4KHD5LnjpL");
		
		//tri de la liste
		Collections.sort(liste);
		
		//affichage
		//1ère méthode - for
		System.out.print("1ère methode : for ------->");
		for(int i = 0; i<liste.size(); i++) {
			System.out.print(" " + liste.get(i));
		}
		
		System.out.println("\n");
		
		//2eme methode - for each
		System.out.print("2ème methode : for each -->");
		for(String tmp : liste) {
			System.out.print(" "+tmp);
		}
		
		System.out.println("\n");
		
		//3eme méthode - iterator
		Iterator<String> it = liste.iterator();
		System.out.print("3ème methode : iterator -->");
		while(it.hasNext()) {
			System.out.print(" " + it.next());
		}
		

	}

}








