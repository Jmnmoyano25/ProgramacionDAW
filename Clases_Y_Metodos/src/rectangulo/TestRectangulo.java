package rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		//copiamos el objeto rectangulo1 en rectanguloCopia
		Rectangulo rectangulo1 = new Rectangulo(3,8);
		Rectangulo rectanguloCopia = new Rectangulo(rectangulo1);
		
		System.out.println(rectangulo1.getAltura()+ " "+rectanguloCopia.getAltura());
		
		Rectangulo rectangulo2 = new Rectangulo(4,6);
		
		System.out.println("El Area del rectangulo es: "+rectangulo2.getArea());
		System.out.println("El Perimetro del rectangulo es: "+rectangulo2.getPerimetro());
		
		
		
	}

}
