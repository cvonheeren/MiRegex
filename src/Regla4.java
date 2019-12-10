
public class Regla4 extends Regla{
	
	public Regla4() {
		setRuleName();
	}
	
	//Valida si en la cadena hay numeros.
	@Override
	public boolean patronear(String entrada) {
		
		char[] numeros = {'0','1','2','3','4','5','6','7','8','9'};
		
		char[] palabra = entrada.toCharArray();
		
		boolean validar = false;
		
		for (int i=0; i<numeros.length; i++) {
			for (int x=0; x<palabra.length; x++) {
				if(numeros[i] == palabra[x]) {
					validar = true;
				}
			}		
		}
		return validar;
	}
	
	public void setRuleName() {
		this.name = "si4";
	}

}
