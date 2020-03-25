package unidad_6_arrays_ejercicios_bidimensional;

public class TestArray {

	public static void main(String[] args) {
	
		Probando_arrays[] pr = new Probando_arrays[3];
		
		Probando_arrays una = new Probando_arrays();
		for(int z = 0; z < 3; z++){
			String s = String.valueOf(z);
			pr[z] = new Probando_arrays(s); 
		}
		int[] r = pr[1].InicializaArrayInt();
		//int[] z = pr[0].InicializaArrayInt();
		
		pr[1].RellenaArray(r);
		pr[1].ImprimeArrayInt(r);
		pr[1].Burbuja(r);
//		pr[0].RellenaArray(z);
//		pr[0].ImprimeArrayInt(z);
//		pr[0].ImprimeArrayInt(z);
		
//		String b = "hola";
//		char a[] = new char[b.length()];
//		System.out.println("String:  "+b);
//
//		for(int i = 0; i < b.length();i++) {
//
//			a[i] = b.charAt(i);
//			System.out.print(a[i]);
//		}
		
		int a =  23;
		System.out.printf("%34d", a);
		
//		int[][] a = una.InicializaArrayBiInt();
//		una.RellenaArrayBi(a);
//		una.ImprimeArrayBiInt(a);
//		int j = 0;
//		for(int h = 0; h < a[0].length; h++) {
//			for(int i = 0; i < a.length; i++) {
//
//				if(i+h == a.length-1) {
//					System.out.print(a[i][h]);
//				}
//			}
//		}
		
		
		
		
		
		
	}

}
