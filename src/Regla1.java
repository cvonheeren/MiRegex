
public class Regla1 extends Regla {
	
	public Regla1() {
		setRuleName();
	}
	
	// Valida si solo son numeros.
	@Override
	public boolean patronear(String entrada) {
		char numeros[] = {'1','2','3','4','5','6','7','8','9','0'};
	    boolean bandera = true;
	    
	    for (char charCadena:entrada.toCharArray()) {
	        boolean banderaTemp = false;
	        for (char charNumero:numeros) {
	            if (charCadena != charNumero){
	            banderaTemp |= false;
	        } else {
	            banderaTemp |= true;
	        }
	    }
	        bandera &= banderaTemp;
	    }
	    return bandera;
		
	}
	
	public void setRuleName() {
		this.name = "si1";
	}
}
