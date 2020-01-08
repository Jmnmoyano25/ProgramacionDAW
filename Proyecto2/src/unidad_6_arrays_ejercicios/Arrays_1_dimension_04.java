package unidad_6_arrays_ejercicios;

public class Arrays_1_dimension_04 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		//EJERCICIO 4
		int [] numero = new int[20];
		int [] cuadrado = new int[20];
		int [] cubo = new int[20];
		
		for(int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random()*101);
			cuadrado[i] = numero[i] * numero[i];
			cubo[i] = cuadrado[i] * numero[i];
		}
	      System.out.println("\nA continuación se muestran en tres columnas, un número aleatorio entre 0 y 100, su cuadrado y su cubo:\n");
	      
	      System.out.println("  n  │   n²  │    n³\n");
	      for (int i = 0; i < numero.length; i++) {
	        System.out.printf("%4d │ %5d │%8d\n", numero[i], cuadrado[i], cubo[i]);
	      }
	}

}
