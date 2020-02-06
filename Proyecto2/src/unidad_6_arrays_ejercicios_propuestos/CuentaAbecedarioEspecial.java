package unidad_6_arrays_ejercicios_propuestos;
import java.util.*;
public class CuentaAbecedarioEspecial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] contador = new int[3];
		char[] abc = new char[3];
		String frase;
		
		abcd = "[A-Z]"
		
		abc[0] = 'a';
		abc[1] = 'e';
		abc[2] = 'i';
		
		System.out.println("Cual es la frase: ");
		frase = sc.nextLine();
		
		for(int i = 0; i < frase.length(); i++) {
			for(int j = 0; j < abc.length; j++) {
				if(frase.charAt(i) == abc[j]) {
					contador[j]++;
				}
			}
		}
		
		String resultado = "";
		String res_letra;
		String res_contador;
		//String[] copia_contador = new String[3];
		//String[] copia_abc = new String[3];
		
		for (int j = 0; j < abc.length; j++) {
			
			System.out.println(abc[j]+ " se repite "+contador[j]);
			//copia_contador[j] = Integer.toString(cuentaVocales()[j]);
			
			//copia_abc[j] = Character.toString(this.abc[j]);
			
			//resultado = (copia_abc[j]+ "se repite "+copia_contador[j]);
			//resultado = "jolo";
		}
		
		
	}

}
