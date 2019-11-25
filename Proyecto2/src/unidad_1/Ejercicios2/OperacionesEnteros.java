package unidad_1.Ejercicios2;

import java.util.Scanner;

public class OperacionesEnteros{
	public static void main(String[] args){
		System.out.println("Suma, promedio, producto, máximo y mínimo de 3 números enteros");
	
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c;
		float suma, promedio, producto, max, min, x, y; 
		
		System.out.print("Ingresa a:  ");
		a = entrada.nextInt();
		
		System.out.print("Ingresa b:  ");
		b = entrada.nextInt();
		
		System.out.print("Ingresa c:  ");
		c = entrada.nextInt();
		
		suma = a + b + c;
		
		promedio = (a + b + c) / 3;
		
		producto = a * b * c;
		
		x = Math.max(a,b);
		
		max = Math.max(x,c);
		
		y = Math.min(a,b);
		
		min = Math.min(y,c);
		
		System.out.printf("La suma es:%f%n", suma);
				
		System.out.printf("El promedio es:%f%n", promedio);
		
		System.out.printf("El producto es:%f%n", producto);
				
		System.out.printf("El número mayor es:%f%n", max);
				
		System.out.printf("El número menor es:%f%n", min);
		
		
	}
}
		
		
