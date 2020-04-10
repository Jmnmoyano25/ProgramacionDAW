package unidad_9_colecciones;

public class Libro {

	private String titulo;
	private String autor;
	private int ISBN;
	
	public Libro(String titulo, String autor, int ISBN) {
		this.autor = autor;
		this.titulo = titulo;
		this.ISBN = ISBN;
	}
	
	public String getDatos() {
		return "El libro es: " + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + ISBN;
	}


	
//	public boolean equals(Object obj) { //sobreescribimos el metodo equals. mirar triangulo verde
//		
//		if(obj instanceof Libro) {
//			Libro otro = (Libro)obj; //hemos hecho un casting de obj para que equals acceda al ISBN del Object
//			
//			if(this.ISBN == otro.ISBN) {
//				return true;
//			}else {
//				return false;
//			}
//		}else {
//			return false; //devolvemos false si obj no es igual a Libro
//		}
//	}
	
	/*
	 * eclipse permite crear equals y hascode
	 */	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	
	
	
	
}
