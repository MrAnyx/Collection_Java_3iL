import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;


public class Main {

	
	public static void LectureFichier(File f) {
		
		if(!f.exists()) {
			System.out.println("Impossible de trouver le fichier");
			System.exit(1);
		}
		else if(f.getParent() == null) {
			System.out.println("Impossible de trouver le répertoire");
			System.exit(1);
		}
		
		else {
			System.out.println("Nom du fichier : " + f.getName());
			System.out.println("Chemin d'accès : " + f.getPath());
			System.out.println("Taille (en octets) : " + f.length());
			
		
				
			 /*
			// avec les file stream
			FileInputStream str = new FileInputStream(f);
			char current;
			while(str.available() > 0){
				current = (char) str.read();
				System.out.println(current);
			}
			*/
			
			try {
				//avec bufferedReader
				ArrayList<String> arrayli = new ArrayList<String>();
				ArrayList<String> li = new ArrayList<String>();
	
				
				BufferedReader br = new BufferedReader(new FileReader(f));
				int nbLine = 0;
				String tmp;
				String test;
				
				while((tmp = br.readLine()) != null){
					nbLine++;
					li.add(tmp);	
				}
				
				li.removeAll(Arrays.asList(null,""));//on enleve les  sauts de lignes
				
				for(String s : li) {//on affiche chaque lignes
					test = s;
					if(test.startsWith("<p>")) {
						arrayli.add(s);
					}
				}
				
				System.out.println("il y a : "+nbLine+" lignes");
				System.out.println("----------------------------------------------------------------------");
				
				
				ArrayList<String> finalfinal = new ArrayList<String>();
				String tmp2;
				for(String s : arrayli) {
					tmp2 = s;
					tmp2 = tmp2.replaceAll("<.{1,2}>", ""); //on enleve les balises <p> ou <b> ou </b> ou </p>
					tmp2 = tmp2.replaceAll("<.*>", ""); //on enleve la dernière balise <>
					tmp2 = tmp2.replaceAll(", ", ",");
					finalfinal.add(tmp2);
				}
				
				ArrayList<Forme> listeForme = new ArrayList<Forme>();

				for (String s : finalfinal) {
					listeForme.add(new Forme(s.split(" ")));
				}
				
				for(Forme f1 : listeForme) {
					System.out.println(f1);
				}

			} 
			catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
			
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		LectureFichier(new File("./TP7/save.html"));

		
		/*
		File rep = new File(System.getProperty("user.dir"));
		File data = new File(rep.getAbsolutePath()+File.separator+"data");
		
		
		 String nomDuFichier = (String)JOptionPane.showInputDialog(
				 null,
				 "test",
				 "titre",
				 JOptionPane.QUESTION_MESSAGE,
				 null,
				 null,
				 "fichier.txt"
		 );
			
		File finalfichier = new File(data+File.separator+nomDuFichier);
		
		if(finalfichier.exists()) {
			LectureFichier(finalfichier);
		}
		else {
			System.out.println("le fichier a bien été créé");
			BufferedWriter bw = new BufferedWriter(new FileWriter(finalfichier));
			bw.close();
		}
		*/

	}

}
