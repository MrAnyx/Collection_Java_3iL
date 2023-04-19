
public class Main {

	public static void main(String[] args) {
		
		System.out.println("----------- Avant -----------");

		CercleRedimensionnable c = new CercleRedimensionnable(10);
		System.out.println("Périmetre : "+c.getPerimetre());
		System.out.println("Aire : " + c.getAire());
		
		
		System.out.println("\n----------- Après -----------");
		c.redimensioner(80);
		System.out.println("Périmetre : "+c.getPerimetre());
		System.out.println("Aire : " + c.getAire());

	}

}
