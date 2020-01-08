package unidad_3_arrays;

public class Copias_Arrays {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		
		//COPIA DE ARRAY CON UN FOR
		
		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length];
		for (int i = 0; i < sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
		}
		
		System.out.println(targetArray[2]);
		System.out.println(sourceArray[2]);
		
		
		
		//COPIA CON SYSTEM.ARRAYCOPY
		
		int[] arrayUno = {2, 3, 1, 5, 10};
		int[] arrayDos = {1, 4, 8, 16, 32};
		
		System.arraycopy(arrayUno, 0, arrayDos, 0, arrayUno.length);
		
		System.out.println(arrayUno[1]);
		System.out.println(arrayDos[1]);
		
		//ARRAYS BIDIMENSIONALES [] []
		//el primer valor es la fila, el segundo la columna
		double [][] distancias = {
				{0, 1, 2},
				{3, 4, 5},
				{6, 7, 8},
		};
		System.out.println(distancias[0][2]);
		System.out.println(distancias[2][0]);
		
		int [][] n = new int [4][7];
		
		//hay que hacer un for anidado
		System.out.println("hay que hacer un for anidado\n");
		System.out.println("Lo rellenamos con un Math.random\n");
		for(int j = 0;j<n.length;j++) {
			for(int i = 0; i<n[0].length; i++) {
				
				n[j][i] = (int) (Math.random() * 100);
			}
		}
		
		//con forma de matriz
		System.out.println("Imprimimos con forma de matriz\n");
		for(int j = 0;j<n.length;j++) {
			for(int i = 0; i<n[0].length; i++) {
				System.out.print(n[j][i]+" ");
			}
		System.out.println();
		}
		
		System.out.println("\n");
		System.out.println("Imprimimos solo la columna 0\n");
		for(int j = 0;j<n.length;j++) 
				System.out.println(n[j][0]+" ");
		
		System.out.println("\n");
		
		
		System.out.println("Imprimimos solo la fila 0\n");
		for(int i = 0; i<n[0].length; i++) 
				System.out.print(n[0][i]+" ");
			

		
		System.out.println("\n"); 
		System.out.println("Otro array doble\n");
		double[][] nueva = new double[9][5];
		
		for(int j = 0;j < nueva.length; j++)
			for(int i = 0;i < nueva[0].length; i++)
				nueva[j][i] = 2*2;
		
		
	}
}

