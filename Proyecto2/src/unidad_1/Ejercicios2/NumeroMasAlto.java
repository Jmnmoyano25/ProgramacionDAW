package unidad_1.Ejercicios2;

import java.util.Scanner;

public class NumeroMasAlto{
	public static void main(String[] args){
		System.out.println("Calculamos el núºmero más alto");
	
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, max;
		
		System.out.print("Escribe el primer número: ");
		num1 = entrada.nextInt();
				
		System.out.print("Escribe el siguiente número: ");
		num2 = entrada.nextInt();
		
		max = Math.max(num1,num2);
		
		//igual = (max = 0);
		
		System.out.printf("El %d%s%n", max, " es el número más alto");
		//System.out.printf("%d%s%n", igual, " estos nÃºmeros son iguales");
		}
}
		
		
