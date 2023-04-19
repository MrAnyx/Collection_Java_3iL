import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Main {

	public static void LectureFichier(File f) {

		String dir = f.getParent();
		if (dir == null) {
			System.out.println("Impossible de trouver le répertoire");

		} else if (!f.exists()) {
			System.out.println("Impossible de trouver le fichier");
			System.exit(1);
		}

		else {
			System.out.println("Nom du fichier : " + f.getName());
			System.out.println("Chemin d'accès : " + f.getPath());
			System.out.println("Taille (en octets) : " + f.length());
			try {

				/*
				 * // avec les file stream FileInputStream str = new FileInputStream(f); char
				 * current; while(str.available() > 0){ current = (char) str.read();
				 * System.out.println(current); }
				 */

				// avec bufferedReader

				int nbDigit = 0;
				int nbChar = 0;
				int nbwhiteSpace = 0;
				BufferedReader br = new BufferedReader(new FileReader(f));
				int c;
				while ((c = br.read()) != -1) {

					System.out.print((char) c);
					if (Character.isDigit((char) c)) {
						nbDigit++;
					} else if (Character.isAlphabetic((char) c)) {
						nbChar++;
					} else if (Character.isWhitespace((char) c)) {
						nbwhiteSpace++;
					}
				}

				System.out.println("\nil y a " + nbDigit + " nombre(s)");
				System.out.println("il y a " + nbChar + " lettre(s)");
				System.out.println("il y a " + nbwhiteSpace + " espace(s)");
				System.out.println(
						"il y a " + String.format("%.2f", (double) 100 * nbDigit / f.length()) + " % de nombres");

				br.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public static void main(String[] args) throws Exception {

		LectureFichier(new File("./data/fichier"));

		
//		
//		File rep = new File(System.getProperty("user.dir"));
//		File data = new File(rep.getAbsolutePath() + File.separator + "data");
//
//		String nomDuFichier = (String) JOptionPane.showInputDialog(null, "test", "titre", JOptionPane.QUESTION_MESSAGE,
//				null, null, "fichier.txt");
//
//		File finalfichier = new File(data + File.separator + nomDuFichier);
//
//		if (finalfichier.exists()) {
//			LectureFichier(finalfichier);
//		} else {
//			System.out.println("le fichier a bien été créé");
//			BufferedWriter bw = new BufferedWriter(new FileWriter(finalfichier));
//			bw.close();
//		}
		

	}

}
