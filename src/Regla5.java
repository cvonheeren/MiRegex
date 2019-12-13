
public class Regla5 extends Regla{
	
	public Regla5() {
		setRuleName();
	}
	
	
	//Valida si solo hay letras en minuscula
	@Override
	public boolean patronear(String entrada) {

		char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	
		boolean validar = true;
		
		
		for (char entradaChar : entrada.toCharArray()) {
			boolean validarTemp = false;
			for (char letrasChar : letras) {
				if (entradaChar != letrasChar) {					
					validarTemp |= false;
				}else {
					validarTemp |= true;
				}
			}
			validar &= validarTemp;
		}	
		
		return validar;
	
	}
	
	
	public void setRuleName() {
		this.name = "si5";
	}

}


