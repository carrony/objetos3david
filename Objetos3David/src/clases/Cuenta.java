package clases;

public class Cuenta {
	
	public static final double MAXCREDITO=1000;
	
	private Persona titular;
	private double saldo;
	
	public Cuenta() {
		this.titular=new Persona();
		this.saldo=0;
	}

	public Cuenta(Persona titular, double cantidad) {
		super();
		this.titular = titular;
		this.saldo = cantidad;
	}
	
	public Cuenta(String nombre, int edad, String dni, double saldo) {
		this.titular= new Persona(nombre,edad,dni);
		this.saldo=saldo;
	}
	

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return saldo;
	}
	
	public void mostrar() {
		System.out.println("Titular: ");
		titular.mostrar();
		System.out.println("Saldo: "+this.saldo);
	}
	
	public void ingresar(double valor) {
		if (valor>0) {
			this.saldo=this.saldo+valor;
		}
	}
	
	public void retirar(double importe) {
		if (importe>0 &&
			(this.saldo-importe)> -MAXCREDITO) {
			this.saldo=this.saldo-importe;
		}
	}
	
	public String getNombreTitular() {
		return this.titular.getNombre();
	}
	
	public void transferirA(Cuenta c, double importe) {
//		this.saldo=this.saldo-importe;
//		c.saldo=c.saldo+importe;
		this.retirar(importe);
		c.ingresar(importe);
	}
	
}
