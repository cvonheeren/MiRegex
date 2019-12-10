
public class Regla3 extends Regla{
	
	public Regla3() {
		setRuleName();
	}

	//Valida si la primera letra de la palabra esta en mayuscula.
	@Override
	public boolean patronear(String entrada) {
		
		String primeraLetra = entrada.substring(0,1);
		String primeraLetraMayuscula = entrada.substring(0,1).toUpperCase();
		
		if (primeraLetra.equals(primeraLetraMayuscula)) {
			return true;
	 	}else {
	 		return false;
	 	}	
	
	}

	public void setRuleName() {
		this.name = "si3";
	}
	
}
