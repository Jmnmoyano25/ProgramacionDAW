package unidad_5_clases_y_metodos;

public class PruebaLibro {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Libro libro1 = new Libro();
		Libro libro2 = new Libro("\"Mackbet\"", "\"Sakespeare\"", 2, false);
		
		System.out.println(libro2.isPrestado());
		//System.out.println(libro2.prestar());
		
		System.out.println(libro2.devuelto());
		
		libro1.setTitulo("\"Derecho Romano\"");
		libro1.setAutor("\"Unos pesados\"");
		libro1.setCodigo(1);
		libro1.setPrestado(false);
		
		System.out.println(libro1.getTitulo());
		System.out.println(libro1.getAutor());
		System.out.println(libro1.getCodigo());
		System.out.println(libro1.isPrestado());
		
		
		//System.out.println(libro1.prestar());
		System.out.println(libro1.devuelto());
		//System.out.println(libro1.prestar());
	}

}
