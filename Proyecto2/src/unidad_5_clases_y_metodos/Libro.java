package unidad_5_clases_y_metodos;

public class Libro {

			//ATRIBUTOS
	private String titulo;
	private String autor;
	private int codigo;
	private boolean prestado = false;
	
			//CONSTRUCTORES
	//constructor generico
	public Libro() {
	}
	//constructor con atributos
	public Libro(String titulo, String autor, int codigo, boolean prestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.codigo = codigo;
		this.prestado = prestado;
	}
	
			//METODOS
	//metodo que devuelve true en caso de préstamo exitoso
	//		y
	//false en caso de estar ya prestado
	
	public boolean prestar() {
		
		if(prestado == true) {
			System.out.println("El libro "+this.titulo+" ya esta prestado");
			return prestado = false;
		}else{
			System.out.println("El libro "+this.titulo+" se ha prestado");
			return prestado = true;
		}
		
	}
	
	
	//devuelve true en caso de poder devolverse, por estar prestado
	//		y
	//false en caso de no poder devolverse por no estar prestado
		
	public boolean devuelto() {

		if(prestado = true) {
			System.out.println("El libro "+this.titulo+" se ha devuelto correctamente");
			return prestado = false;
		}else {
			System.out.println("El libro "+this.titulo+" no puede ser devuelto porque no ha sido prestado aún");
			return prestado = true;
		}
	}
	//no me funciona correctamente el metodo devuelto().
	
	
			//METODOS GETER Y SETTER
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
}
