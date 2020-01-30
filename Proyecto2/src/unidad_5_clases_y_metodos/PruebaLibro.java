package unidad_5_clases_y_metodos;

public class PruebaLibro {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Libro li1 = new Libro();
		Libro li2 = new Libro("Mackbet", "Sakespeare", 2, false);
		
		li2.prestar();
		li2.devolver();
		
		li1.setTitulo("Derecho Romano");
		li1.setAutor("Unos pesados");
		li1.setCodigo(1);
		li1.setPrestado(false);
		
		System.out.println(li1.getTitulo());
		System.out.println(li1.getAutor());
		System.out.println(li1.getCodigo());
		System.out.println(li1.isPrestado());
	
		li1.prestar();
		li1.devolver();
		
		System.out.println("\n\nAhora probamos el ejercicio 2 Libro2\n\n");
		
		Libro2 li3 = new Libro2();
		Libro2 li4 = new Libro2("¡¡Aprendan Java COÑO!!", "Un informatico", 3, 4, 0);
		
		li4.prestar();
		System.out.println("\n");
		li4.devolver();
		System.out.println("\n");
		
		li3.setTitulo("Escorbuto");
		li3.setAutor("El pirata patapalo");
		li3.setCodigo(1);
		li3.setNumEjemplares(1);
		li3.setNumEjemplaresPrestados(0);
		
		li3.prestar();
		System.out.println("\n");
		li3.prestar();
		System.out.println("\n");
		li3.devolver();
		
		Libro2 li5 = new Libro2();
		

	}

}
