package unidad_3_arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		int[] n = new int[12];
		
		for(int j = 0;j<n.length;j++) {
			n[j] = (j * 2);
		}
		 

		//UTILIZADOS PARA MOSTRAR LA CONDICIÓN
		for(int i=0; i<n.length;i++) {
			System.out.println(n[i]);

		}
		for(int i=0; i<n.length;i++) {
			System.out.print(n[i] +  " ");
		}
		//foreach MAS UTILIZADO PARA TODOS LOS HUECOS
		for (int a:n) {
		 System.out.print("\n"+a + "  foreach");
		}
		
		//con DOUBLE
		
		double[] V = new double[10];
		
		for(int j = 0;j<V.length;j++) {
			V[j] = (j / 2);
		}
		
		for(int i=0; i<5;i++) {
			System.out.println(V[i]);

		}
		
		//con CHAR
		
		char [] car = new char[10];
				
		car[0] = 'a';
		car[1] = 'x';
		car[4] = '@';
		car[6] = ' ';
		car[7] = '+';
		car[8] = 'Q';
		
		

	}

}
