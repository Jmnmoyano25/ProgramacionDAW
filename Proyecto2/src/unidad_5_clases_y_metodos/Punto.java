package unidad_5_clases_y_metodos;
/*
 * Ejemplo de clase Punto
 * 
 * [public] [final | abstract]
 * 
 */
public abstract class Punto {
	
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
