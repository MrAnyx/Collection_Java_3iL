
public class Random {
	private int nb_rand;
	
	public Random() {
		this.nb_rand = (int)(Math.random()*10);
	}
	public void get() {
		System.out.println(this.nb_rand);
	}
	
	public void afficher_triangle_random() {
		Triangle t = new Triangle(this.nb_rand);
		t.afficher_triangle();
	}
	
	public static void test() {
		Random nb1 = new Random();
		nb1.get();
		nb1.afficher_triangle_random();
		
		Random nb2 = new Random();
		nb2.get();
		nb2.afficher_triangle_random();
	}
	
}
