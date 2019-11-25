package unidad_1.Ejercicios2;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args){
		
		System.out.println("Introducimos un número entero y nos dice si es par o impar");
		
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		
		System.out.print("Introduce un número entero: ");
		num1 = entrada.nextInt();
		
		if (num1%2==0)
		System.out.printf("El número %d%s%n", num1, " es par");
		else
		System.out.printf("El número %d%s%n", num1, " es impar");
	}
}
		
		
