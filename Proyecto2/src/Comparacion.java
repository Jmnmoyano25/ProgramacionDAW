import java .util.Scanner;

public class Comparacion{
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;

		System.out.print("Escribe el primer número entero: ");
		numero1 = entrada.nextInt();
		System.out.print("Escribe el segundo número entero: ");
		numero2 = entrada.nextInt();
		
		if (numero1 == numero2)
			System.out.printf("%s%n", "Los números introducidos son iguales");
			
		if (numero1 < numero2)
			System.out.printf("%s%d%s%n", "El ", numero2, " es el mayor");
			
		if (numero1 > numero2)
			System.out.printf("%s%d%s%n", "El ", numero1, " es el mayor");
		}
}
			
			
			
			
			
			
			
			
			
