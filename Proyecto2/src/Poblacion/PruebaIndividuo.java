package Poblacion;

public class PruebaIndividuo {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		System.out.println(Individuo.getPoblacion()); //como esta antes de crear el objeto Individuo, sale como 0 el contador Poblacion.
		
		Individuo i1 = new Individuo ("51997678-Z","Paquito",98);
		Individuo i2 = new Individuo ("51997678-Z","Paquito",98);
		
		System.out.println(i1.getDni());
		System.out.println(i1.getNombre());
		i1.setDni("98989899-P");
		System.out.println(i1.getDni());
		i1.setNombre("Chocolatero");
		System.out.println(i1.getNombre());
		
		
		
		System.out.println(Individuo.getPoblacion());/*El campo/atributo Poblacion es static y se llama sin el "new". Como el Math. o el System.
		Ademas como ya hemos creado 2 objetos Individuo, ahora el campo/atributo Poblacion vale "2".*/
														
		
	}

}
