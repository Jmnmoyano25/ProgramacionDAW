import java.util.Scanner;

public class AritmeticaBasica{
	public static void main(String[] args){
	
		Scanner entrada = new Scanner(System.in);
		
		float numero1, numero2, suma, resta, producto, diferencia;
		
		System.out.println("Para sumar");
		
		System.out.print("Escriba el pirmer número: ");
		numero1 = entrada.nextFloat();
		
		System.out.print("Escriba el segundo número: ");
		numero2 = entrada.nextFloat();
		
		suma = numero1 + numero2;
		
		System.out.printf("la suma es %f%n", suma);
		
		System.out.println("Para restar");
		
		System.out.print("Escriba el pirmer número: ");
		numero1 = entrada.nextFloat();
		
		System.out.print("Escriba el segundo número: ");
		numero2 = entrada.nextFloat();
		
		resta = numero1 - numero2;
		
		System.out.printf("la resta es %f%n", resta);
		
		System.out.println("Para el producto");
		
		System.out.print("Escriba el pirmer número: ");
		numero1 = entrada.nextFloat();
		
		System.out.print("Escriba el segundo número: ");
		numero2 = entrada.nextFloat();
		
		producto = numero1 * numero2;
		
		System.out.printf("El producto es %f%n", producto);
		
		System.out.println("Para la diferencia");
		
		System.out.print("Escriba el pirmer número: ");
		numero1 = entrada.nextFloat();
		
		System.out.print("Escriba el segundo número: ");
		numero2 = entrada.nextFloat();
		
		diferencia = numero1 / numero2;
		
		System.out.printf("La diferencia es %f%n", diferencia);
	}
}
		
		
