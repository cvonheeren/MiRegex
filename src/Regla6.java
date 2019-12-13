import java.util.ArrayList;

public class Regla6 extends Regla{
		
	public Regla6() {
		setRuleName();
	}
	
	boolean validarRango = true;
	
	//Limite de rango de solo numeros
	@Override
	public boolean patronear(String entrada , String rango) {
		
		String[] parts = rango.split("-"); 
		
		
		ArrayList<Character> rangos = new ArrayList<Character>();
			
			char caracter1 = parts[0].charAt(0);
			char caracter2 = parts[1].charAt(0);
			
			for (int i = caracter1; i<=caracter2; i++) {			
				rangos.add((char) i);
			}
				
			
	    boolean bandera = true;
	    
	    for (char charCadena:entrada.toCharArray()) {
	        boolean banderaTemp = false;
	        for (char charNumero:rangos) {
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
		this.name = "si6";
	}

}
