/*14. Escribir un programa que calcule cuál es el horóscopo chino de un usuario. El horóscopo
chino se basa en el cálculo de un animal para cada año de nacimiento del usuario mediante
anyoNacimiento % 12 . Con lo que si alguien nació en 1970, el resto es 2 con lo cual es el
perro en su signo zodiacal chino. Podéis utilizar switch
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio14_Horoscopo_chino {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner(System.in);
		
		int año, horoscopo;
		
		System.out.println("Ingresa tu año de nacimiento: ");
		año = memory.nextInt();
		
		horoscopo = año%12;
		switch (horoscopo) {
		case 0:{
			System.out.println("Tu horoscopo chino es el Mono");
			break;
		}
		case 1:{
			System.out.println("Tu horoscopo chino es el Gallo");
			break;
		}
		case 2:{
			System.out.println("Tu horoscopo chino es el Perro");
			break;
		}
		case 3:{
			System.out.println("Tu horoscopo chino es el Cerdo");
			break;
		}
		case 4:{
			System.out.println("Tu horoscopo chino es la Rata");
			break;
		}
		case 5:{
			System.out.println("Tu horoscopo chino es el Buey");
			break;
		}
		case 6:{
			System.out.println("Tu horoscopo chino es el Tigre");
			break;
		}
		case 7:{
			System.out.println("Tu horoscopo chino es el Conejo");
			break;
		}
		case 8:{
			System.out.println("Tu horoscopo chino es el Dragón");
			break;
		}
		case 9:{
			System.out.println("Tu horoscopo chino es la Serpiente");
			break;
		}
		case 10:{
			System.out.println("Tu horoscopo chino es el Caballo");
			break;
		}
		case 11:{
			System.out.println("Tu horoscopo chino es la Oveja");
			break;
		}
		}//end of switch
	}
}
