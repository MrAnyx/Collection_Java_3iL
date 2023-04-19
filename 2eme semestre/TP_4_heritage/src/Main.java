
public class Main {

	public static void main(String[] args) {
		
		
		
		
		//Cercle
		
		Forme c = new Cercle();
		
		System.out.println("##########  Cercle  ###########");
		
		System.out.println(c);
		System.out.println("aire : "+c.getAire());
		System.out.println("perimetre : "+c.getPerimetre());
		
		
		System.out.println("-----------------");
		
		c = (Cercle) c;
		System.out.println(c);
		System.out.println("aire : "+c.getAire());
		System.out.println("perimetre : "+c.getPerimetre());
		
		
		
		System.out.println("\n\n##########  Rectangle  ###########");

		
		//Rectangle
		
		Forme r = new Rectangle();
		
		System.out.println(r);
		System.out.println("aire : "+r.getAire());
		System.out.println("perimetre : "+r.getPerimetre());
		
		
		System.out.println("-----------------");
		
		r = (Rectangle) r;
		System.out.println(r);
		System.out.println("aire : "+r.getAire());
		System.out.println("perimetre : "+r.getPerimetre());
		
		
		
		System.out.println("\n\n##########  Carre  ###########");

		
		//carre
		
		Forme s = new Carre();
		
		System.out.println(s);
		System.out.println("aire : "+s.getAire());
		System.out.println("perimetre : "+s.getPerimetre());
		
		
		System.out.println("-----------------");
		
		s = (Rectangle) s;
		System.out.println(s);
		System.out.println("aire : "+s.getAire());
		System.out.println("perimetre : "+s.getPerimetre());
		
		System.out.println("-----------------");

		s = (Carre) s;
		System.out.println(s);
		System.out.println("aire : "+s.getAire());
		System.out.println("perimetre : "+s.getPerimetre());
		
		
		
		
	}

}
