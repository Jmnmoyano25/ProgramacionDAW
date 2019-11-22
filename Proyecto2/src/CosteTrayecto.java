import java.util.Scanner;

public class CosteTrayecto{
	public static void main(String[] args){
		System.out.println("Calculo del trayecto en coche");
	
		Scanner entrada = new Scanner(System.in);
		
		float coste, km, consumo, precio;
		
		System.out.print("Cuantos Km vas ha hacer: ");
		km = entrada.nextFloat();
				
		System.out.print("Cuanto consume tu coche L/100: ");
		consumo = entrada.nextFloat();
				
		System.out.print("A cuanto esta el litro de conbustible: ");
		precio = entrada.nextFloat();		
		
		coste = ((km / 100) * consumo) * precio;
		
		System.out.printf("%s%f%n", "El coste de su viaje asciende a: ", coste);
		}
}
		
		
