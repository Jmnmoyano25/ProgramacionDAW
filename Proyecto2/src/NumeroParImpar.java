import java.util.Scanner;

public class NumeroParImpar{
	public static void main(String[] args){
		System.out.println("Averiguemos si un número es par o impar");
	
		Scanner entrada = new Scanner(System.in);
		
		int num1, resulpar, resulimpar;
		
		System.out.print("Escribe un número entero: ");
		num1 = entrada.nextInt();
		
		if (num1%2==0)
		System.out.printf("El numero %d%s%n", num1, " es par");
		else
		System.out.printf("El numero %d%s%n", num1, " es impar");
		}
}
		
		
