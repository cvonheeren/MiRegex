
public class MisReglas {

	private Regla[] misReglas;
	
	public MisReglas() {
		misReglas = new Regla[2];
		misReglas[0] = new Regla1();
		misReglas[1] = new Regla2();
	}

	public Regla[] getMisReglas() {
		return misReglas;
	}
}
