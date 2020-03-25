package unidad_6_arrays_ejercicios_bidimensional;

public class Probando_arrays extends ArraysBi {
	int aux;
	String nombre;
	
	public Probando_arrays() {}
	
	public Probando_arrays(String nombre) {
		this.nombre = nombre;
	}
	
	public Probando_arrays(int aux, int[] array, int[][] arrayBi) {
		super(array, arrayBi);
		this.aux = aux;
	}
	
	public static void main(String[] args) {
		
		Probando_arrays pr = new Probando_arrays();



		int[][] a = pr.InicializaArrayBiInt();
		
		pr.ImprimeArrayBiInt(a);
		
		
		
	}

}
