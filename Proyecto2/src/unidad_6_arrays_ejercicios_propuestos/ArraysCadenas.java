package unidad_6_arrays_ejercicios_propuestos;

import java.util.*;

public class ArraysCadenas {
	Scanner sc = new Scanner(System.in);

	// ATRIBUTOS

	// CONSTRUCTORES

	public ArraysCadenas() {
	}

	// METODOS
	public String[] inicializa() {
		int tam = 0;

		System.out.println("Escribe un tamaño para el array");

		tam = sc.nextInt();

		String[] array = new String[tam];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Escribe una palabra: ");
			array[i] = sc.next();
			array[i] = array[i].toLowerCase();
		}

		return array;
	}

	// metodo que imprime String y los coloca segun su longitud centrados debajo de
	// los indices
	public void imprimeArray(String[] array) {
		int k = array.length;

		int[] Indice = new int[k];
		int i;
		System.out.print("Indice  ");
		for (i = 0; i < Indice.length; i++) {
			System.out.print("    " + i + "    " + " ");
		}
		System.out.println("");
		System.out.print("Valor   ");
		for (i = 0; i < array.length; i++) {
			if (array[i].length() <= 2) {
				System.out.print("    " + array[i] + "   " + " ");
			} else if (array[i].length() <= 3) {
				System.out.print("   " + array[i] + "   " + " ");
			} else if (array[i].length() <= 4) {
				System.out.print("   " + array[i] + "  " + " ");
			} else if (array[i].length() <= 5) {
				System.out.print("  " + array[i] + "  " + " ");
			} else if (array[i].length() <= 6) {
				System.out.print("  " + array[i] + " " + " ");
			} else if (array[i].length() <= 7) {
				System.out.print(" " + array[i] + " " + " ");
			} else if (array[i].length() <= 8) {
				System.out.print(" " + array[i] + " ");
			} else if (array[i].length() <= 9) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("\n");

	}

	public String[] sumandoArray(String[] a, String[] b) {

		String sumAr[] = new String[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			sumAr[i] = a[i];
		}

		for (int i = 0, j = a.length; i < b.length; i++, j++) {
			sumAr[j] = b[i];
		}

		return sumAr;
	}

	public String[] burbuja(String[] arrayAny) {
		String auxiliar;
		String[] arrayOrdenado;

		for (int i = 1; i < arrayAny.length; i++) {

			for (int j = 0; j < arrayAny.length - i; j++) {

				if (arrayAny[j].charAt(0) > arrayAny[j + 1].charAt(0)) {
					auxiliar = arrayAny[j];
					arrayAny[j] = arrayAny[j + 1];
					arrayAny[j + 1] = auxiliar;
				} else if (arrayAny[j].charAt(0) == arrayAny[j + 1].charAt(0)) {
					if (arrayAny[j].charAt(1) > arrayAny[j + 1].charAt(1)) {
						auxiliar = arrayAny[j];
						arrayAny[j] = arrayAny[j + 1];
						arrayAny[j + 1] = auxiliar;
					}
				} else if (arrayAny[j].charAt(1) == arrayAny[j + 1].charAt(1)) {
					if (arrayAny[j].charAt(2) > arrayAny[j + 1].charAt(2)) {
						auxiliar = arrayAny[j];
						arrayAny[j] = arrayAny[j + 1];
						arrayAny[j + 1] = auxiliar;
					}
				}
			}
		}

		arrayOrdenado = arrayAny;

		return arrayOrdenado;
	}

}
