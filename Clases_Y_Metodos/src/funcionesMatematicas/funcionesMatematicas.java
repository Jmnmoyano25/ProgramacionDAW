package funcionesMatematicas;

public class funcionesMatematicas {

	//atributos
	
	private int entero;

	//constructores
	
	public funcionesMatematicas() {}
	
	public funcionesMatematicas(int entero) {
		this.entero = entero;
	}
	
	//funciones o métodos
	
		public void esPrimo( int entero) {
		
		this.entero = entero;
		int contador = 0;
		for (int I = 1; I <= entero; I++) {
			if ((entero % I)==0) {
				contador ++;
			}
		}
		if (contador <=2) {
			System.out.println(entero+" es primo");
		}else {
			System.out.println(entero+" no es primo");
		}
				

	}
	
	public void cuentaDigitos(int entero) {
		this.entero = entero;
		
		System.out.println("El número " +entero+ " tiene " + Integer.toString(entero).length() + " dígitos");
	}
	
	
	
	
}
