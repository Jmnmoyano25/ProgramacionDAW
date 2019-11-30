package cuentaCorriente;

class CuentaCorrienteProfe {

	  private String numero = "";
	  private double saldo;

	  public CuentaCorrienteProfe() {
	    this.generaNumero();
	  }

	  public CuentaCorrienteProfe(double saldo) {
	    this.generaNumero();
	    this.saldo = saldo;
	  }

	  private void generaNumero() {
	    for (int i = 0; i < 10; i++) {
	      numero += (int) (Math.random() * 10);
	    }
	  }

	  @Override
	  public String toString() {
	    return "Número de cta: " + numero + " Saldo: " + String.format("%.2f", saldo) + " €";
	  }

	  void ingreso(int dinero) {
	    saldo += dinero;
	  }
	  
	  void cargo(int dinero) {
	    saldo -= dinero;
	  }

	  void transferencia(CuentaCorrienteProfe cuentaDestino, int dinero) {
	    saldo -= dinero;
	    cuentaDestino.saldo += dinero;
	  }
	}