package unidad_8_excepciones;

public class Gato {
	
	//ATRIBUTOS
	String nombre;
	String sexo;
	String raza;
	
	//CONSTRUCTORES 
//	public Gato() {}
	
	public Gato (String criaSexo) {
		this.sexo = criaSexo;
	}
		
//	public Gato (String nombre, String sexo, String raza) {
//		this.nombre = nombre;
//		this.sexo = sexo;
//		this.raza = raza;
//	}
	
	//METODOS
	
	public Gato apareaCon(Gato pareja) throws ExcepcionApareamientoImposible {
		
		if(this.sexo.equals(pareja.sexo))  {
			throw new ExcepcionApareamientoImposible();
		}
//			int moneda = (int) (Math.random() * 2);
//			
//			if(moneda == 0) {
//				String criaSexo = "macho";
//				System.out.println("Va ha ser un gatito");
//			}else {
//				String criaSexo = "hembra";
//				System.out.println("Va ha ser una gatita");
//			}
		//ESTO NO ME LO COJE, NO SE POR QUE....
		
		String criaSexo = (int)(Math.random() * 2) == 0 ? "hembra" : "macho";
		if(criaSexo == "hembra") {
			System.out.println("Va ha ser un gatita");
		}else {
			System.out.println("Va ha ser un gatito");
		}
		return new Gato(criaSexo);
		
	}
//	private String color;
//	private String raza;
//	private String sexo;
//	
//	public Gato(String s) {
//	this.sexo = s;
//	}
//	
//	public void maulla() {
//	System.out.println("Miauuuu");
//	}
//	
//	public Gato apareaCon(Gato pareja) throws ExcepcionApareamientoImposible {	
//	
//	if (this.sexo.equals(pareja.sexo)) {
//		throw new ExcepcionApareamientoImposible();
//		}
//		String s = (int)(Math.random() * 2) == 0 ? "hembra" : "macho";
//		System.out.println("Vas a tener un gatit@");
//		return new Gato(s);
//	}
	
		
	
	
	
}
