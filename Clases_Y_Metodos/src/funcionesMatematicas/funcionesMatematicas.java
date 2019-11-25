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
	
	private void variable(int contador) {
		this.entero = entero;
		contador = 0;
		for (int I = 1; I <= entero; I++) {
			if ((entero % I)==0) {
				contador ++;
			}
		}
	
	}
	
	public int esPrimo() {
		
		if (variable <=2) {
			return System.out.println(entero+"es primo");
		}else {
			return System.out.println(entero+"no primo");
		}
		
	}
	
	

	
	
	
	
	
}
