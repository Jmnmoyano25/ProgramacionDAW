package proyecto2tri;

public class TestCuadrado {
	/**
	 * 
	 * @author avellanedaprogramación
	 *
	 */
		/** Main method */
		public static void main(String[] args) {
			
			// Creamos el objeto squares como array de Square
			// Podemos asignar valores con un for si lo deseamos
			Cuadrado[] cuadrados = new Cuadrado[3];
			cuadrados[0] = new Cuadrado(11.2);
			cuadrados[1] = new Cuadrado(7.3);
			cuadrados[2] = new Cuadrado(1.9);
			
			/*
			 * También podríamos haber realizado lo siguiente que es más eficiente al escribir código
			 */
			
			// Square[] squares = {new Square(2.7), new Square(3.1), new Square(7.8)};
		
			//Aquí se llama a los métodos de cada objeto square
			for (int i = 0; i < cuadrados.length; i++) {
			 	System.out.println("\nSquare #" + (i + 1));
			 	System.out.println("lado: " + cuadrados[i].getSide());
			 	System.out.println("Area: " + cuadrados[i].getArea());
			 	System.out.println("Perímetro: " + cuadrados[i].getPerimeter());
			 	System.out.println("How to color: " + cuadrados[i].howToColor());
			 } 
		}
	}
