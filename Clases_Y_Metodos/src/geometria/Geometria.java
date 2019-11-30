/*1. Crea una clase Geometria que tenga dos funciones que puedan ser utilizadas sin crear el objeto con new.
Dichas funciones son:

volumenCilindro -> retorna el volumen de un cilindro (Pi*r^2*h)
longitudCircunferencia -> retorna la longitud de la circunferencia (2*Pi*r)

Todos los datos son double.
*/

package geometria;

public class Geometria {

	//atributos
	private static double r=9,h=7;
	
	//constructor
	public Geometria(double r, double h) {
		this.r = r;
		this.h = h;
	}
	
	//metodos
	public static double volumenCilindro(double r, double h) {
		
		return Math.PI * Math.pow(r, 2) * h; 
	}
	
	public static double volumenCilindro2() {
		
		return Math.PI * Math.pow(r, 2) * h; 
	}
	
	public static double longitudCircunferencia (double r, double h) {
		return 2 * Math.PI * r;
	}
}
