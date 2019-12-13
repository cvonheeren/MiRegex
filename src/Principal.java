import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		MisReglas misReglas = new MisReglas();
		Regla[] reglas = misReglas.getMisReglas();
		String expresion;
		boolean existe = false;
		int indice = -1;
		
		String entrada;
		String rango;
		
		System.out.println("Introducir regla: ");
		expresion = reader.next();
		
		while (!existe) {
			for (int i = 0; i < reglas.length; i++) {		
				if (reglas[i].getRuleName().equals(expresion)) {
					indice = i;
					existe = true;
					break;
				}
			}
			if (!existe) {
				System.out.println("Introducir regla válida: ");
				expresion = reader.next();
			} 
		}
		
	

		
		if (expresion.equals("si6")) {
			
			System.out.println("Introduce rango de numeros, ejemplo: 1-5");
			rango = reader.next();
							
			System.out.println("Introducir entrada: ");
			entrada = reader.next();
			
			if (reglas[indice].patronear(entrada, rango)) {
				System.out.println("El patrón coincide");
			} else {
				System.out.println("El patrón no coincide");
			}	
			
		} else {
			
			System.out.println("Introducir entrada: ");
			entrada = reader.next();
			
			if (reglas[indice].patronear(entrada)) {
				System.out.println("El patrón coincide");
			} else {
				System.out.println("El patrón no coincide");
			}		
			
		}
		
		reader.close();
	}

	

}
