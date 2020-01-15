package unidad_5_clases_y_metodos;

public class UsoRectangulo {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Rectangulo r1 = new Rectangulo("rectangulo1");
		int i = Integer.parseInt("12334");//Integer no hace falta instanciarlo
		System.out.println(i);
		
		double pi = Rectangulo.PI;//se pueden llamar a todos los atributos estaticos, como con Integer.
		System.out.println(pi);
		
		String nombre = Rectangulo.nombreFigura;//igual que arriba, también, nombreFigura es estatico
		System.out.println(nombre);

		Rectangulo r3 = new Rectangulo("rectangulo3");//en este caso accedemos a traves del instanciamiento de la clase Rectangulo.
		System.out.println(Rectangulo.nombreFigura);
		
		r1.establecerNombre("hola");
		System.out.println(r1.obtenerNombre());
		
		Rectangulo bueno = new Rectangulo(10, 5, 8, 3);
		
		System.out.println(bueno.calcularSuperficie());
		
		System.out.println(bueno.calcularPerimetro());
		
		bueno.desplazar(8, 7);
		
		System.out.println(bueno.x1);
		
		Rectangulo dos = new Rectangulo(1000, 5000, 2000, 3000);
		
		dos.desplazar(500, 500);
		
		System.out.println(bueno.obtenerNumeroRectangulo());
		
	
		
		
		
		
		
		//r1.PI;
		
	}

}
