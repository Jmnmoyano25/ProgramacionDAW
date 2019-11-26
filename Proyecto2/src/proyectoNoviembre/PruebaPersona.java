package proyectoNoviembre;

public class PruebaPersona {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Persona alumno1 = new Persona("Paula", 31, 160);
		
		Persona alumno2 = new Persona("Daniel Alvarez", 22, 190);
		
		Persona alumnoCopiado = new Persona(alumno2);
		
		System.out.println(alumno1.consultaNombre());
		
		alumno1.cambiaNombre("Julia");
		
		System.out.println(alumnoCopiado.consultaNombre());
		System.out.println(alumnoCopiado.getAltura());
		System.out.println(alumnoCopiado.getEdad());
		
			
		
	}

}
