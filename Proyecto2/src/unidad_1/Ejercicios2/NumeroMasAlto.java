package unidad_1.Ejercicios2;

import java.util.Scanner;

public class NumeroMasAlto{
	public static void main(String[] args){
		System.out.println("Calculamos el n��mero m�s alto");
	
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, max;
		
		System.out.print("Escribe el primer n�mero: ");
		num1 = entrada.nextInt();
				
		System.out.print("Escribe el siguiente n�mero: ");
		num2 = entrada.nextInt();
		
		max = Math.max(num1,num2);
		
		//igual = (max = 0);
		
		System.out.printf("El %d%s%n", max, " es el n�mero m�s alto");
		//System.out.printf("%d%s%n", igual, " estos números son iguales");
		}
}
		
		
