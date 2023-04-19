
public class CercleRedimensionnable extends Cercle implements Redimensionnable{

	CercleRedimensionnable(double r) {
		super(r);
	}

	@Override
	public void redimensioner(double pourcentage) {
		rayon = rayon*(pourcentage/100);
	}

}
