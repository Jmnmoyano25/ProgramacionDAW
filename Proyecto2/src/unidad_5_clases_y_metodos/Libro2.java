package unidad_5_clases_y_metodos;

public class Libro2 {

			//ATRIBUTOS
	private String titulo;
	private String autor;
	private int codigo;
	private int numEjemplares;
	private int numEjemplaresPrestados;
	
			//CONSTRUCTORES
	//constructor generico
	public Libro2() {
	}
	//constructor con atributos
	public Libro2(String titulo, String autor, int codigo, int numEjemplares, int numEjemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.codigo = codigo;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}
	
			//METODOS
	
	public boolean prestar() {
		boolean prestar = true;
		
		if(numEjemplaresPrestados < numEjemplares) {
			System.out.println("Te puedo prestar el libro \""+this.titulo+"\" sin problemas");
			System.out.println("Actualmente disponemos de "+numEjemplares+" ejemplares");
			numEjemplaresPrestados++;
			System.out.println("Tenemos prestados "+numEjemplaresPrestados+" libros actualmente");
			prestar = true;
		}else{
			System.out.println("El libro \""+this.titulo+"\" no puede ser prestado");
			System.out.println("Actualmente disponemos de "+numEjemplares+" ejemplares");
			System.out.println("Tenemos prestados "+numEjemplaresPrestados+" libros actualmente");

		}
		return prestar;
		
	}
	
	
		
	public boolean devolver() {
		boolean devolver = true;
		
		if(numEjemplaresPrestados > 0) {
			System.out.println("Gracias por devolver el libro \""+this.titulo+"\"");
			System.out.println("Actualmente disponemos de "+numEjemplares+" ejemplares");
			numEjemplaresPrestados--;
			System.out.println("Tenemos prestados "+numEjemplaresPrestados+" libros actualmente");
			devolver = true;
		}else {
			System.out.println("El libro \""+this.titulo+"\" no puede ser devuelto porque no hay ninguno prestado");
			System.out.println("Actualmente disponemos de "+numEjemplares+" ejemplares");
			System.out.println("Tenemos prestados "+numEjemplaresPrestados+" libros actualmente");
		}
		return devolver;
	}

	
	
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
	public int getNumEjemplares() {
		return numEjemplares;
	}
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}
	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}


}
