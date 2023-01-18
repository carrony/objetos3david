package ppal;

import clases.Cuenta;
import clases.Persona;

public class PruebaCuenta {

	public static void main(String[] args) {
		
		Cuenta c = new Cuenta();
		c.mostrar();
		
		Persona p= new Persona("Antonio",25,"33333333L");
		Cuenta c2 = new Cuenta(p,200);
		
		Cuenta c3 = new Cuenta( new Persona("Ana",45,"99999999P"),300);
		
		Cuenta c4 = new Cuenta("Pedro", 36, "33333333T", 240);
		
		System.out.println("Titula de la cuenta c3: "
				+c3.getTitular().getNombre().toLowerCase());
		
		System.out.println("Titula de la cuenta c3: "
				+c4.getNombreTitular());
		
		System.out.println("ingresando 200 euros. Saldo actual: "
						+c4.getCantidad());
		c4.ingresar(200);
		c4.mostrar();
		
		System.out.println("Retirada de 850 euros...");
		c4.retirar(850);
		System.out.println("El saldo es "+c4.getCantidad());
		
		System.out.println("El crédito máximo de la cuentas es " 
					+Cuenta.MAXCREDITO);
		
		
	}

}
