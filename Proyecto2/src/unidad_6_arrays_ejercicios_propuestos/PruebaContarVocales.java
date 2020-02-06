package unidad_6_arrays_ejercicios_propuestos;
import java.util.*;
public class PruebaContarVocales {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
			Scanner sc = new Scanner(System.in);
			ContarVocales CV1 = new ContarVocales();
			
	
		String fra;
			
			System.out.println("Escribe una frase: ");
			fra = sc.nextLine();
			
			CV1.setFrase(fra);
			
			System.out.println(CV1.getFrase());
			
			System.out.println(CV1.cuentaVocales());
			
			
			
	}

}
