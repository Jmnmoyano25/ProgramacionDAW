/*
3.Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita saber :

  -	el tamaño: mediana o familiar
  -	el tipo: margarita, cuatro quesos o funghi
  -	y su estado: pedida o servida. La clase debe almacenar información sobre el número total 
	de pizzas que se han pedido y que se han servido. Siempre que se crea una pizza nueva, su estado es "pedida".
*/


package pizza;

public class Pizza {
	
	String tamaño;
	String tipo;
	static int pedida=0;
	String estadoPedida;
	String estadoServida;
	static int servida=0;
	
	
	public Pizza(String tamaño, String tipo) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estadoPedida = "Pizza pedida";
		this.estadoServida = "Pizza servida";
		pedida++;

		
	}
	//metodos
	public String tamaño() {
		
		
		return tamaño;
	}
	
	public String tipo() {

		return tipo;
	}
	public String estadoPedida() {
		
		servida++;
		
		return estadoPedida;
	}
	public String estadoServida() {

		return estadoServida;
	}
	public void pedidos() {
		
		System.out.println("Se han pedido "+pedida+" pizzas.");
	}
	public void servida() {
			
			System.out.println("Se han servido "+servida+" pizzas.");

		
	}

}
	
	

