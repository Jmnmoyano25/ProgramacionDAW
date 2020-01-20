package unidad_6_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_14 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		
			//EJERCICIO 13
		int [] arrayIndice = new int[8];
		String [] coloresIniciales = new String[8];
		String [] palabrasUsuario = new String[8];
		String [] arrayNuevo = new String[8];
		int i,j;
		int arrayOrdenado = 0;
		
		coloresIniciales[0] = "verde";
		coloresIniciales[1] = "rojo";
		coloresIniciales[2] = "azul";
		coloresIniciales[3] = "amarillo";
		coloresIniciales[4] = "naranja";
		coloresIniciales[5] = "rosa";
		coloresIniciales[6] = "negro";
		coloresIniciales[7] = "blanco";
		
		//rellenamos el array de palabrasUsuario con las del usuario.
		/*for(i = 0; i < palabrasUsuario.length; i++) {
			System.out.println("Escribe una palabra: ");
			palabra = sc.next();
			palabrasUsuario[i] = palabra;
		}*/
		//relleno el array palabrasUsuario para no tener que meterlos continuamente
		
		palabrasUsuario[0] = "casa";
		palabrasUsuario[1] = "coche";
		palabrasUsuario[2] = "amarillo";
		palabrasUsuario[3] = "hombre";
		palabrasUsuario[4] = "verde";
		palabrasUsuario[5] = "azul";
		palabrasUsuario[6] = "bombilla";
		palabrasUsuario[7] = "naranja";
		
		//rellenamos el array Indice.
		for(i = 0; i < arrayIndice.length; i++) {
			arrayIndice[i] = i;
		}
		
		//mostramos el conjunto de array inicial
		for(i = 0; i < arrayIndice.length; i++) {
			System.out.print("    "+arrayIndice[i]+"    "+" ");
		}
		System.out.println(" ");
		for(i = 0; i < palabrasUsuario.length; i++) {
			if(palabrasUsuario[i].length() <= 2) {
			System.out.print("    "+palabrasUsuario[i]+"   "+" ");
			}else if (palabrasUsuario[i].length() <= 3) {
			System.out.print("   "+palabrasUsuario[i]+"   "+" ");
			}else if (palabrasUsuario[i].length() <= 4) {
			System.out.print("   "+palabrasUsuario[i]+"  "+" ");
			}else if (palabrasUsuario[i].length() <= 5) {
			System.out.print("  "+palabrasUsuario[i]+"  "+" ");
			}else if (palabrasUsuario[i].length() <= 6) {
			System.out.print("  "+palabrasUsuario[i]+" "+" ");
			}else if (palabrasUsuario[i].length() <= 7) {
			System.out.print(" "+palabrasUsuario[i]+" "+" ");
			}else if (palabrasUsuario[i].length() <= 8) {
			System.out.print(" "+palabrasUsuario[i]+" ");
			}else if (palabrasUsuario[i].length() <= 9) {
			System.out.print(palabrasUsuario[i]+" ");
			}
		}

		//comprovamos si alguna palabra es un color
		int prueba = 0;
		for(i = 0; i < palabrasUsuario.length -1; i++) {
			
			System.out.println("1for");
			System.out.println(arrayOrdenado+" prueba");
			System.out.println("    "+prueba++);
			System.out.println(palabrasUsuario[i]);
			for(j = 0;j < coloresIniciales.length; j++) {
				if(palabrasUsuario[i] == coloresIniciales[j]) {
					arrayNuevo[arrayOrdenado] = palabrasUsuario[i];
					arrayOrdenado++;
				}else {System.out.println(arrayOrdenado+" for interno");}
			}
		}
		System.out.println("2for");
		System.out.println(arrayOrdenado);
		//llenamos el resto del nuevo array con las palabras que no sean colores
		for(i = 0; i <= palabrasUsuario.length -1; i++) {
			for(j = 0;j < coloresIniciales.length; j++) {
				if(palabrasUsuario[i] != coloresIniciales[j]) {
					arrayNuevo[arrayOrdenado] = palabrasUsuario[i];
					arrayOrdenado++;
				}
			}
		}
		//volvemos a mostrar los nuevos resultados
		//mostramos el conjunto de array inicial
		for(i = 0; i < arrayIndice.length; i++) {
			System.out.print("    "+arrayIndice[i]+"    "+" ");
		}
		System.out.println(" ");
		for(i = 0; i < arrayNuevo.length; i++) {
			if(arrayNuevo[i].length() <= 2) {
			System.out.print("    "+arrayNuevo[i]+"   "+" ");
			}else if (arrayNuevo[i].length() <= 3) {
			System.out.print("   "+arrayNuevo[i]+"   "+" ");
			}else if (arrayNuevo[i].length() <= 4) {
			System.out.print("   "+arrayNuevo[i]+"  "+" ");
			}else if (arrayNuevo[i].length() <= 5) {
			System.out.print("  "+arrayNuevo[i]+"  "+" ");
			}else if (arrayNuevo[i].length() <= 6) {
			System.out.print("  "+arrayNuevo[i]+" "+" ");
			}else if (arrayNuevo[i].length() <= 7) {
			System.out.print(" "+arrayNuevo[i]+" "+" ");
			}else if (arrayNuevo[i].length() <= 8) {
			System.out.print(" "+arrayNuevo[i]+" ");
			}else if (arrayNuevo[i].length() <= 9) {
			System.out.print(arrayNuevo[i]+" ");
			}
		}
		
		
		
		
	}

}
