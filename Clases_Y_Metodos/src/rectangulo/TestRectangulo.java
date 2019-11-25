package rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		//copiamos el objeto rectangulo1 en rectanguloCopia
		Rectangulo rectangulo1 = new Rectangulo(3,8);
		Rectangulo rectanguloCopia = new Rectangulo(rectangulo1);
		
		Rectangulo rectangulo2 = new Rectangulo(4,6);
		
		System.out.println("rectangulo1 tiene : "+rectangulo1.getBase()+ " "+rectangulo1.getAltura()+"\n");
		
		System.out.println("rectangulo2 tiene : "+rectangulo2.getBase()+ " "+rectangulo2.getAltura()+"\n");
		
		System.out.println("rectanguloCopia tiene : "+rectanguloCopia.getBase()+ " "+rectanguloCopia.getAltura()+"\n");
		
		System.out.println("El Area del rectangulo1 es: "+rectangulo1.getArea());
		System.out.println("El Perimetro del rectangulo1 es: "+rectangulo1.getPerimetro()+"\n");
		
		System.out.println("El Area del rectangulo2 es: "+rectangulo2.getArea());
		System.out.println("El Perimetro del rectangulo2 es: "+rectangulo2.getPerimetro()+"\n");
		
		System.out.println("El Area del rectanguloCopia es: "+rectanguloCopia.getArea());
		System.out.println("El Perimetro del rectanguloCopia es: "+rectanguloCopia.getPerimetro()+"\n");
		

		
		
		
	}

}
