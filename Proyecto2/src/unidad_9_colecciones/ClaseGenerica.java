package unidad_9_colecciones;

public class ClaseGenerica<T> {	
	//ATRIBUTOS
	T obj;
	
	//CONSTRUCTORES
	public ClaseGenerica(T o) {
		obj = o;
	}
	
	//METODOS
	
	public void tipoDeClase() {
		System.out.println("El tipo de objeto como atributo de la clase Generica es: "+obj.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(15);
		intObj.tipoDeClase();
		
		ClaseGenerica<String> strObj = new ClaseGenerica<String>("hola que tal");
		strObj.tipoDeClase();
		
		/*
		ClaseGenerica<Char> chaObj = new ClaseGenerica<Char>('A');
		chaObj.tipoDeClase();
		*/
	}
}
