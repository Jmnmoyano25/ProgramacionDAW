package unidad_6_arrays_ejercicios_propuestos;
import java.util.*;

public class PruebaConteoAbecedario {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner sc = new Scanner(System.in);
		ConteoAbecedario abc = new ConteoAbecedario();
		
		String fra;

		System.out.println("Escribe una frase: ");
		fra = sc.nextLine();
		
			//damos formato al atributo frase
		abc.setFrase(fra);
		
			//pasamos frase a minusculas
		abc.pasarMinusculas(fra);
		
			//imprimimos abc y contador			
		abc.imprimeArray(abc.cuentaVocales());
		

		
	}
}
	
