
public class Regla2 extends Regla {
	
	public Regla2() {
		setRuleName();
	}
	
	@Override
	public boolean patronear(String entrada) {
		if (entrada.length() == 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setRuleName() {
		this.name = "si2";
	}
}
