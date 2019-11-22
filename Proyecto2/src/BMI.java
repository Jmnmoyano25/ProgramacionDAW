import java.util.Scanner;

public class BMI{
	public static void main(String[] args){
		System.out.println("Indice de masa corporal");
	
		Scanner entrada = new Scanner(System.in);
		
		float alt, pes, bmi;
		
		System.out.print("Ingresa tu altura: ");
		alt = entrada.nextFloat();
				
		System.out.print("Ingresa tu peso: ");
		pes = entrada.nextFloat();
		
		bmi = pes / (alt * alt);
		
		System.out.printf("%s%f%n%s", "Su BMI es: ", bmi, "VALORES DE BMI\nBajo peso: menos de 18.5\nNormal: entre 18.5 y 24.9\nSobrepeso: entre 25 y 29.9\nObeso: 30 o más\n");
		}
}
		
		
