import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void LectureFichier(File f1, File f2) {

		String dir = f1.getParent();
		if (dir == null) {
			System.out.println("Impossible de trouver le répertoire");

		} else if (!f1.exists()) {
			System.out.println("Impossible de trouver le fichier");
			System.exit(1);
		}

		else {
			try {

				// Lecture fichier ligne par ligne question 2
				System.out.println("################# Ligne #################");
				BufferedReader br = new BufferedReader(new FileReader(f1));
				String tmp;
				int nbLine = 0;
				while ((tmp = br.readLine()) != null) {
					//System.out.println(tmp); //pour afficher le fichier en texte
					nbLine++;
				}
				System.out.println("il y a : " + nbLine + " lignes");

				
				
				
				
				
				
				// lecture du fichier octet par octet  question 3
				System.out.println("################ octets #################");

				DataInputStream dis = new DataInputStream(new FileInputStream(f1));
				System.out.println("le fichier fait : " + dis.available() + " octets");
				while (dis.available() > 0) {
					System.out.print(dis.readByte() + "\t"); //affichage bytes pas bytes	
				}


				System.out.println("\n############### reprise TP7 écriture binaire fichier html ################");
				
				
				//parse html 
				ArrayList<String> arrayLiJustP = new ArrayList<String>();
				ArrayList<String> arrayLiSansSpace = new ArrayList<String>();

				BufferedReader br2 = new BufferedReader(new FileReader(f2));
				int nbLine2 = 0;
				String tmp3;
				String test;

				while ((tmp3 = br2.readLine()) != null) {
					nbLine2++;
					arrayLiSansSpace.add(tmp3);
				}

				arrayLiSansSpace.removeAll(Arrays.asList(null, ""));// on enleve les sauts de lignes

				for (String s : arrayLiSansSpace) {// on affiche chaque lignes
					test = s;
					if (test.startsWith("<p>")) {
						arrayLiJustP.add(s);
					}
				}


				ArrayList<String> finalfinal = new ArrayList<String>();
				String tmp4;
				for (String s : arrayLiJustP) {
					tmp4 = s;
					tmp4 = tmp4.replaceAll("<.{1,2}>", ""); // on enleve les balises <p> ou <b> ou </b> ou </p>
					tmp4 = tmp4.replaceAll("<.*>", ""); // on enleve la dernière balise <>
					tmp4 = tmp4.replaceAll(", ", ",");
					finalfinal.add(tmp4);
				}
				
				
				//fin parse html
				
				//question 6 écriture des formes
				ArrayList<Forme> listeForme = new ArrayList<Forme>();

				for (String s : finalfinal) {
					listeForme.add(new Forme(s.split(" ")));
				}
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("./save.bin")));
				System.out.println("fichier créé");
				for(Forme f : listeForme) {
					dos.writeUTF(f.toString());
				}
				System.out.println("copie du texte dans le fichier binaire");
				
				
				
				
				//question 5
				System.out.println("################# lecture du fichier binaire #################");
				DataInputStream dis2 = new DataInputStream(new FileInputStream(new File("./save.bin")));
				
				while(dis2.available() > 0) {
					System.out.print(dis2.readUTF() + "\n");
				}
				
				
				// écriture des formes dans un fichier binaire
				ObjectOutputStream oas = new ObjectOutputStream(new FileOutputStream(new File("./save2.bin")));
				for(Forme forme : listeForme) {
					oas.writeObject(forme);
				}
				
				
				System.out.println("##################################### lecture fichier forme #########################################");
				//Lecture fichier des formes
				// !!!! il faut que forme implements serializable
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("./save2.bin")));
				Forme f;
				while((f = (Forme) ois.readObject())!=null) {
					System.out.println(f);
				}
				
				
				br.close();
				br2.close();
				dos.close();
				dis.close();
				dis2.close();
				oas.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public static void main(String[] args) {
		LectureFichier(new File("./save.html"), new File("./save.html"));
	}

}
