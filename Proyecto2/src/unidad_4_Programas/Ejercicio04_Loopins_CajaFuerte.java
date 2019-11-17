/*Ejercicio 4 Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un
n�mero de 4 cifras. El programa nos pedir� la combinaci�n para abrirla. Si no
acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la combinaci�n�
y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�.
Tendremos cuatro oportunidades para abrir la caja fuerte*/

package unidad_4_Programas;
import java.util.Scanner;
public class Ejercicio04_Loopins_CajaFuerte {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner vivo = new Scanner(System.in);
		int clave = 2505, prueba, intentos = 4;
		do {
			System.out.println("�Cual es la combinaci�n para abrir la caja fuerte?, tienes"+intentos+"intentos.");
			System.out.println("\tEscribe un n�mero entero de 4 digitos: ");
			prueba = vivo.nextInt();
			
			if(prueba == clave) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				break;
			}else {
				System.out.println("Lo siento, esa no es la combinaci�n");
			}
				
			intentos--;			
		}while (intentos > 0);
		if (intentos == 0)
		 System.out.println("Caja fuerte bloqueada, llame al servicio t�cnico");
				 
		
	}

}
