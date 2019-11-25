package unidad_1.Ejercicios2;

import java.util.Scanner;

public class Multiplos{
	public static void main(String[] args){
		System.out.println("Daremos dos número enteros y nos dira si es múltiplo del otro");
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Escribe un número entero: ");
		num1 = entrada.nextInt();
		
		System.out.print("Escribe otro número entero: ");
		num2 = entrada.nextInt();
		
	
		
		if ((num1%2)/(num2%2)==0){
			System.out.printf("Los números introducidos %d y %d son multiplos\n", num1, num2);
		}
		else {
			System.out.printf("Los números introducidos %d y %d no son multiplos\n", num1, num2);
		}
	}
}
		
