
public class Main {

	public static void main(String[] args) {
		
		System.out.println("----------- Avant -----------");

		CercleRedimensionnable c = new CercleRedimensionnable(10);
		System.out.println("P�rimetre : "+c.getPerimetre());
		System.out.println("Aire : " + c.getAire());
		
		
		System.out.println("\n----------- Apr�s -----------");
		c.redimensioner(80);
		System.out.println("P�rimetre : "+c.getPerimetre());
		System.out.println("Aire : " + c.getAire());

	}

}
