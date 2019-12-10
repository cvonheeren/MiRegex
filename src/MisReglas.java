
public class MisReglas {

	private Regla[] misReglas;
	
	public MisReglas() {
		misReglas = new Regla[3];
		misReglas[0] = new Regla1();
		misReglas[1] = new Regla2();
		misReglas[2] = new Regla3();
	}

	public Regla[] getMisReglas() {
		return misReglas;
	}
}
