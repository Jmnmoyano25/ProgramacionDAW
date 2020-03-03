package unidad_6_arrays_ejercicios_bidimensional;

abstract class ArraysBi {

	//ATRIBUTOS
	private int[] array;
	private int[][] arrayBi;
	
	//METODOS
	public void ImprimeArray() {
		for (int i = 0; i < this.array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void ImprimeArrayBi() {
		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j < arrayBi[i].length; j++) {
				System.out.println(arrayBi[i]);
			}
		}
	}
	
	
	
}
