package unidad_9_colecciones;

import java.util.*;

public class LinkedListMetodos {
	
	public static void tamañoLista(List<String> lista) {
		System.out.println("El tamaño de la lista es: "+lista.size());
	}
	
	public static void recorrerFor(List<String> lista){
		System.out.println("\n");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("Los nombres recorridos con el bucle for son "+(i+1)+": "+lista.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		
		int cont = 1;
		String[] nombres = {"Maria","Pablo","Alicia","Marta","Andres"};
		
		/*String[] nombres = new String[5];
		//rellenamos el array con nombres
		System.out.println("Escribe 5 nombres");
		for(int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre "+cont);
			nombres[i] = sc.nextLine();
		cont++;
		}*/
		List<String> lista1 = new LinkedList<String>();
		
		for(String nombre : nombres) {
			lista1.add(nombre);
		}
		
		tamañoLista(lista1);
		//primer Nodo
		System.out.println("\nPrimer nodo: "+lista1.get(0));
		//System.out.println(((LinkedList<String>) lista1).getFirst());
		
		//ultimo Nodo
		System.out.println("\nÚltimo nodo: "+lista1.get(nombres.length-1));		
		//System.out.println(((LinkedList<String>) lista1).getLast());
		
		//Nodo dentro del rango
		int num1 = (int)(Math.random()*(nombres.length));
		System.out.println("\nUn nodo cualquiera de la LinkedList: "+lista1.get(num1));
		//System.out.println(((LinkedList<String>)lista1).get(num1));
		
		//Nodo fuera de rango capturado
		try {
			System.out.println("\nUn nodo fuera de rango: "+lista1.get(10));
		}catch (Exception e){
			System.out.println("\nEl nodo esta fuera de su rango"+e);
		}
		
		//Recorrer con bucle for
		recorrerFor(lista1);
		
		//Recorrer con iterador
		
		
	}

}
