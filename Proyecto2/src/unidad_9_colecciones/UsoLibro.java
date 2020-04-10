package unidad_9_colecciones;

public class UsoLibro {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("El señor de los anillos", "Tolkien", 123);
		Libro libro2 = new Libro("El señor de los anillos", "Tolkien", 123);
		Libro libro3 = new Libro("Cocina facil", "Arguiñano", 2356);

		//libro1 = libro2;
		
		if(libro1.equals(libro2)) {
			System.out.println("Es el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}else
			System.out.println("No son el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		
		if(libro1.equals(libro3)) {
			System.out.println("Es el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro3.hashCode());
		}else
			System.out.println("No son el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro3.hashCode());
		
	}
}
