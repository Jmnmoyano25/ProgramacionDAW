package unidad_6_arrays_ejercicios_propuestos;

public class PruebaArrayCadenas {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		ArraysCadenas a1 = new ArraysCadenas();
				
		String[] b = a1.inicializa();
		String[] a = a1.inicializa();
		
		String[] suma = a1.sumandoArray(a, b);
		
		a1.imprimeArray(suma);
		
		a1.burbuja(suma);
		
		a1.imprimeArray(suma);
	}

}
