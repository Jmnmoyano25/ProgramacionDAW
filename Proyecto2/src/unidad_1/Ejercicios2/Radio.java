package unidad_1.Ejercicios2;

import java.util.Scanner;

public class Radio{
	public static void main(String[] args){
		System.out.println("Para el diametro, circunferencia y area de un circulo");
	
		Scanner entrada = new Scanner(System.in);
		
		int radio;
		float perimetro, area, circunferencia, pi;
		
		System.out.print("Ingresa el radio:  ");
		radio = entrada.nextInt();
		
		System.out.print("Ingresa pi: ");
		pi = entrada.nextFloat();
		
		perimetro = 2 * radio * pi;
		
		System.out.printf("El perimetro es:%f%n", perimetro);
		
		System.out.println("ahora vamos a por el área");
		
		System.out.print("Ingresa el radio:  ");
		radio = entrada.nextInt();
		
		System.out.print("Ingresa pi: ");
		pi = entrada.nextFloat();
				
		area = radio * radio * pi;
		
		System.out.printf("El área es:%f%n", area);
	}
}
		
		
