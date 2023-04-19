
public class Main {

	public static void main(String[] args) {
	
		
		
		Jeu J = new Jeu();
		J.play(3, 2);
		
		
		System.out.println("Votre score Max est de : " + J.getMaxi());
		System.out.println("Votre Score Min est de : " + J.getMini());
		
	}

}

