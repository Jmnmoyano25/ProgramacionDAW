package unidad_9_colecciones;

import java.util.*;

public class Colecciones_ejemplos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int i, j, k, x;
		String[] AmigasMarta = {"Mara", "Alba Jadilla", "Alba Gómez", "Blanca", "Nerea", "Lucia", "África"};
		String[] AmigosMarta = {"Pablo", "David", "Marco", "Marcos", "Edu", "Aron"};
		
			System.out.println("\n\n\tIMPRIMIMOS LA ARRAY DE STRING\n");
		for(i = 0; i < AmigasMarta.length; i++) {
			System.out.print(AmigasMarta[i]+" ");
		}
		/*
		 * OPERACIONES CON LIST
		 */
				//AGREGAMOS ELEMENTOS A LA LISTA
		List<String> amigos = new ArrayList<String>();
		
			for (String AmigoMarta : AmigosMarta) {	//añadimos los nombres con un foreach
				amigos.add(AmigoMarta);
			}
			
			System.out.println("\n\n\tIMPRIMIMOS LA ARRAYLIST\n");
				//IMPRIMIMOS LA ARRAYLIST
			for (i = 0; i < amigos.size(); i++) {
				System.out.println("Amigo "+i+": "+amigos.get(i));
			}
			
			System.out.println("\n\n\tELIMINAMOS UN ELEMENTO POR INDICE DE LA ARRAYLIST\n");
				//ELIMINAMOS UN ELEMENTO POR INDICE DE LA ARRAYLIST
			
			amigos.remove(1);
			for (i = 0; i < amigos.size(); i++) {
				System.out.println("Amigo "+i+": "+amigos.get(i));
			}
			
			System.out.println("\n\n\tAÑADIMOS UN ELEMENTO AL ARRAYLIST\n");
				//AÑADIMOS UN ELEMENTO AL ARRAYLIST
			
			amigos.add(5, "Carlos");
			
			for (i = 0; i < amigos.size(); i++) {
				System.out.println("Amigo "+i+": "+amigos.get(i));
			}
			System.out.println("\nAñadimos un nuevo elemento en la posición 0\n");
			amigos.add(0, "Santi");
			
			for (i = 0; i < amigos.size(); i++) {
				System.out.println("Amigo "+i+": "+amigos.get(i));
			}
			
			System.out.println("\n\n\tBOOLEANO DE UN ELEMENTO DEL ARRAYLIST\n");
				//BOOLEANO DE UN ELEMENTO DEL ARRAYLIST
			
			System.out.println(amigos.contains("Pablo"));
			System.out.println(amigos.contains("Juan"));
		
			
		
		/*
		 * METODOS DE LAS COLECCIONES
		 */
		
				/*
				 * SHORT
				 * Ordena los objetos de un array list
				 */
		
		
		
		
		
	}

}
