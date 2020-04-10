package Racional;

public class ClaseRacional {

	//atributos
	  private int numerador;
	  private int denominador;

	  //constructores
	  public ClaseRacional() {}
	  
	  public ClaseRacional (int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	  }
	  
	  //metodos
	  public void asignarDatos(int numerador, int denenominador) {

	    this.numerador = numerador;

	    if (denenominador == 0) denenominador = 1; // el denominador no puede ser cero

	    this.denominador = denominador;

	  }
	 
	  public void visualizarRacional() {

	    System.out.println(numerador + "/" + denominador);

	  }
	  //una

	 	 	
}
