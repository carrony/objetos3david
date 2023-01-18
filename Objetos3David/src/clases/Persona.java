package clases;

public class Persona {

	private String nombre;
	private int edad;
	private String dni;
	
	public Persona() {
		this.nombre="";
		this.edad=0;
		this.dni="";
	}
	

	public Persona(String nombre, int edad, String dni) {
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setDni(dni);
	}
	
	public Persona(Persona p) {
		this.setNombre(p.nombre);
		this.setEdad(p.edad);
		this.setDni(p.dni);
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setEdad(int edad) {
		this.edad=0;
		if (edad >=0) {
			this.edad=edad;
		}
	}
	
	public void setDni(String dni) {
		if (dni.length()==9 && Character.isLetter(dni.charAt(8))) {
			this.dni=dni;
		}
	}


	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}


	public String getDni() {
		return dni;
	}
	
	public void mostrar() {
		System.out.printf("Nombre: %s\nEdad: %d\nDNI:%s\n", 
				this.nombre, this.edad, this.dni);
	}
	
	public boolean esMayorDeEdad() {
		if (this.edad>=18) {
			return true;
		}
		return false;
	}
	
//	public boolean esMayorDeEdad1() {
//		return this.edad>=18;
//	}
	
}
