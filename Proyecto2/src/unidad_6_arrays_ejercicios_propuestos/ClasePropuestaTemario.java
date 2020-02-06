package unidad_6_arrays_ejercicios_propuestos;

public class ClasePropuestaTemario {
		

		static int sumaArray(int[] j) {
				int suma = 0;
				for (int i = 0; 0 < j.length; i++)
						suma += j[i];
				return suma;
		}
		
		//static int[] prodaArray()
	
		static int f1() {
			return 1;
		}
		static void imprimeArray(int[] j) {
			for (int i = 0; i < j.length; i++)
				System.out.println(j[i]+" ");
		}
		
			//metodo creado para rellenar el objeto de la clase PUNTO
		static void imprimeArrayObjetos(Punto[] j) {
			for (int i = 0; i < j.length; i++) {
				System.out.print("Item "+ i + " "+ " | ");
				j[i].imprimeX();
				System.out.print("  ");
				j[i].imprimeY();
				System.out.println();
			}
		}
		
		public static void main(String[] args) {
			
			int[] m = {1, 2, 3};
			//System.out.println(sumaArray(m));
			imprimeArray(m);
			//int[] q = prodArray(m);
			
			Punto[] p = new Punto[10];
			for (int i = 0; i < p.length; i++) {
				p[i] = new Punto(i+1, i+2);
			}
			
			
					//una opción
			for (int i = 0; i < p.length; i++) {
				p[i].imprimeX();
				p[i].imprimeY();
			}
					//segunda opción
			
			imprimeArrayObjetos(p);

	}

}
