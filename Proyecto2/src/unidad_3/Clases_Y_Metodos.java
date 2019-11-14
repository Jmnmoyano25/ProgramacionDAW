package unidad_3;

public class Clases_Y_Metodos {
	
	public static String devuelveHola() {
		String s1 = "hola";
		return s1;		
	}
	public static int devuelveNum() {
		int i = 11;
		return i;
	}
	public static void sinValores() {//el método void no devuelve nada, se usa para hacer operaciones dentro del metodo
									// que no quieres que se vea, que te devuelva nada.
		int a=0;
		int b=1;
	}
	public static String daMensaje(String s) {
		return s;
	}
	public static int sumaAB (int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		System.out.println(devuelveHola());
		System.out.println(devuelveNum());
		System.out.println(daMensaje("mi mensaje"));

		int sum = sumaAB(2,3);
		System.out.println(sum);
	}

}
