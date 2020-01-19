package unidad_5_clases_y_metodos;

/*
 * clase accesible desde cualquier parte
 * 	PUBLIC
 * 
 * atributo accesibles desde cualquier parte
 * PUBLIC
 */

public class Rectangulo {//si quitamos public solo podemos acceder a la clase desde el paquete

	//public double x1, x2;					//atributo accesibles desde cualquier parte
	//double y1, y2;							//atributo accesibles desde su clase y su paquete unicamente
	public double x1, x2;
	private double y1, y2;
	//private final static float PI = 3.1416f;//atributo accesibles desde su clase unicamente, es constante(final) y solo una copia(static)
	public final static float PI = 3.1416f;
	private static int numRectangulos = 0;
	private String nombre;
	public static final String nombreFigura= "Rectangulo";
	
	//constructor
	
	public Rectangulo(String nombre) { 
		Rectangulo.numRectangulos++;
		this.nombre = nombre;
	}
	public Rectangulo(double x1, double x2, double y1, double y2) {
		Rectangulo.numRectangulos++;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	
	//metodos
	
	
	public String obtenerNombre(){
		return nombre;
	}
	
	public void establecerNombre(String nom){
		this.nombre = nom;
	}
	
	public double calcularSuperficie() {
		double superficie;
		double base = (Math.max(x2, x1) - Math.min(x1, x2));
		double altura = (Math.max(y2, y1) - Math.min(y1, y2));
		return superficie = base * altura;
	}
	
	public double calcularPerimetro() {
		double perimetro;
		double base = (Math.max(x2, x1) - Math.min(x1, x2));
		double altura = (Math.max(y2, y1) - Math.min(y1, y2));
		return perimetro = (base*2) + (altura*2);
	}
	
	public void desplazar(double X, double Y) {
		
		this.x1 += X;
		this.x2 += X;
		this.y1 += Y;
		this.y2 += Y;
	}
	
	public static int obtenerNumeroRectangulo() { //metodo estatico que solo devuelve estaticos
		
		return numRectangulos;
	}
	
	
		
		
}
