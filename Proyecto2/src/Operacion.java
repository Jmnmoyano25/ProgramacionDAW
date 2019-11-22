import java.util.Scanner;

public class Operacion{
	public static void main(String[] args){
		System.out.println("(numero1 * numero2 - numero3 * numero4) / (numero5 - numero6)");
	
		Scanner entrada = new Scanner(System.in);
		
		float numero1, numero2, producto1, 
		numero3, numero4, producto2, resta1, numero5,
		numero6, resta2, resultado;
		
		System.out.print("Numero1:  ");
		numero1 = entrada.nextFloat();
		
		System.out.print("Número2: ");
		numero2 = entrada.nextFloat();
		
		producto1 = numero1 * numero2;
		
		System.out.print("Numero3:  ");
		numero3 = entrada.nextFloat();
		
		System.out.print("Número4: ");
		numero4 = entrada.nextFloat();
				
		producto2 = numero3 * numero4;
		
		resta1 = producto1 - producto2;
		
		System.out.print("Numero5:  ");
		numero5 = entrada.nextFloat();
		
		System.out.print("Número6: ");
		numero6 = entrada.nextFloat();
				
		resta2 = numero5 - numero6;
		
		resultado = resta1 / resta2;
		
		System.out.printf("El resultado es:%f%n", resultado);
	}
}
		
		
