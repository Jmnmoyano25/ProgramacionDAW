package unidad_1.Ejercicios3;

import java.util.Scanner;
public class NotaClase{
	public static void main(String[] args){
		System.out.println("Calculamos la nota que te corresponde según el resultado obtenido");

		Scanner entrada = new Scanner(System.in);
		
		float nota;
		
		System.out.print("Escribe tu nota del 0 al 10: ");
		nota = entrada.nextFloat();
		
		if (nota < 5)
		System.out.println("Tu nota es Insuficiente");
		
		else if (nota < 6)
		System.out.println("Tu nota es Suficiente");
		
		else if (nota < 7)
		System.out.println("Tu nota es Bien");
		
		else if (nota < 9)
		System.out.println("Tu nota es Notable");
		
		else if (nota  < 10)
		System.out.println("Tu nota es Sobresaliente");
		
		else if (nota == 10)
		System.out.println("Tu nota es Matricula de honor ¡¡Enorabuena!!");
		
		else 
		System.out.println("Introduce un numero entre 0 y 10");
		
	}
}

