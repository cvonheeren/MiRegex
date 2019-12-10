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
		
		System.out.println("Introduccir regla: ");
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
				System.out.println("Introduccir regla válida: ");
				expresion = reader.next();
			} 
		}
		
		
		System.out.println("Introducir entrada: ");
		entrada = reader.next();
		if (reglas[indice].patronear(entrada)) {
			System.out.println("El patrón coincide");
		} else {
			System.out.println("El patrón no coincide");
		}
		
		
		reader.close();
	}

	

}
