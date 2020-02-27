package unidad_6_arrays_ejercicios_bidimensional;

public class Arrays_bidimension_01 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int[][] a = new int[3][6];
		a[0][0] = 0;
		a[0][1] = 30;
		a[0][2] = 2;
		a[0][5] = 5;
		a[1][0] = 75;
		a[1][4] = 0;
		a[2][2] = -2;
		a[2][3] = 9;
		a[2][5] = 11;
		
		for(int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.print(a[i][j]+" ");
			}
		System.out.println();		
		}
	}

}
