package unidad_5_clases_y_metodos;
/*
 * Ejemplo de clase Punto
 * 
 * 		ACCESIBILIDAD DE CLASES
 * 
 * [public] [final | abstract]
 * 
 * ABSTRACT	 no se puede instanciar, sirve para heredar metodos y clases a sus hijos.
 * FINAL	 se puede instanciar pero no puede heredar nada ni clases ni metodos.
 * 
 */
public class Punto {
	
	int x, y, vy, vx;
	
	int obtenerX () {
		return x;
	}
	
	int obtenerY () {
		return y;
	}
	
	void establecerX (int vx) {
		x = vx;
	}
	
	void establecerY (int vy) {
		y = vy;
	}


}
