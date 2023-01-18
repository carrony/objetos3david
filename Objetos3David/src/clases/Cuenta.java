package clases;

public class Cuenta {
	private Persona titular;
	private double cantidad;
	
	public Cuenta() {
		this.titular=new Persona();
		this.cantidad=0;
	}

	public Cuenta(Persona titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public Cuenta(String nombre, int edad, String dni, double saldo) {
		this.titular= new Persona(nombre,edad,dni);
		this.cantidad=saldo;
	}
	

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}
	
	public void mostrar() {
		System.out.println("Titular: ");
		titular.mostrar();
		System.out.println("Saldo: "+this.cantidad);
	}
	
	public void ingresar(double valor) {
		if (valor>0) {
			this.cantidad=this.cantidad+valor;
		}
	}
	
	public void retirar(double valor) {
		if (valor>0) {
			this.cantidad=this.cantidad-valor;
		}
	}
	
	public String getNombreTitular() {
		return this.titular.getNombre();
	}
	
	
}
