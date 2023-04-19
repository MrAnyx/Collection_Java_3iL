import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	public static ArrayList<Animal> creationArrayList() {
		ArrayList<Animal> liste = new ArrayList<Animal>();
		liste.add(new Dauphin("bouche de dauphin", "poisson", "mer", 55));
		liste.add(new Dauphin("bouche de dauphin", "poisson", "aquarium", 57));
		liste.add(new Dauphin("bouche de dauphin", "poisson", "mer", 64));
		liste.add(new Lion("machoire", "viande", "afrique", 49));
		liste.add(new Lion("machoire", "viande", "inde", 78));
		liste.add(new Lion("machoire", "viande", "chine", 28));
		System.out.println("ArrayList créée !");
		return liste;
	}
	
	
	public static void saveTexte(ArrayList<Animal> l, File f) {

		try {
			PrintWriter pw = new PrintWriter(new FileWriter(f));
			for (Animal a : l) {
				pw.write(a.toString() + "\n");
			}
			System.out.println("Le fichier texte a bien été créé et le contenu de l'arraylist est sauvegardé !");
			pw.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void convertToBin(File text, File bin) {

		String dir = text.getParent();
		if (dir == null) {
			System.out.println("Impossible de trouver le répertoire");

		} else if (!text.exists()) {
			System.out.println("Impossible de trouver le fichier");
			System.exit(1);
		} else {

			try {
				
				//lecture du fichier texte et création de l'arraylist
				BufferedReader br = new BufferedReader(new FileReader(text));
				String line;
				ArrayList<Animal> liste = new ArrayList<Animal>();
				String[] tmp;
				while((line = br.readLine()) != null) {
					if(line.startsWith("bouche")) {
						tmp = line.split("-");
						liste.add(new Dauphin(tmp[0], tmp[1], tmp[2], Integer.parseInt(tmp[3])));
					}else {
						tmp = line.split("-");
						liste.add(new Lion(tmp[0], tmp[1], tmp[2], Integer.parseInt(tmp[3])));
					}
				}
				
				System.out.println("Lecture du fichier texte réussie");
				
				
				//écriture dans le fichier binaire
				ObjectOutputStream oas = new ObjectOutputStream(new FileOutputStream(bin));
				for(Animal a : liste) {
					oas.writeObject(a);
					//oas.writeUTF("\n");
				}
				
				System.out.println("Ecriture dans le fichier binaire réussie");
				
				
				//fermeture des flux
				oas.close();
				br.close();
				
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
	
	
	public static void LectureBinaire(File f) {
		String dir = f.getParent();
		if (dir == null) {
			System.out.println("Impossible de trouver le répertoire");

		} else if (!f.exists()) {
			System.out.println("Impossible de trouver le fichier");
			System.exit(1);
		} else {
			try {
				
				DataInputStream dis = new DataInputStream(new FileInputStream(f));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				while(dis.available() > 0) {
					System.out.print(dis.read()+" ");
				}
				
				Animal a;
				while((a = (Animal) ois.readObject())!= null) {
					System.out.println(a.toString());
				}
				
				System.out.println("Lecture du fichier binaire réussie");
				
				dis.close();
				
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {

		//creation de l'arrayliste
		ArrayList<Animal> liste = creationArrayList();

		//sauvegarde dans le fichier texte
		saveTexte(liste, new File("./saveTexte.txt"));
		
		//sauvegarde dans le fichier binaire en objets
		convertToBin(new File("./saveTexte.txt"), new File("./saveBin.bin"));

		//lecture et affichage du fichier binaire
		LectureBinaire(new File("./saveBin.bin"));
		
			
	}

}
