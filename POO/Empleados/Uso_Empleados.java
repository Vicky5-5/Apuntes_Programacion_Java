//NOTA. SE HACE USO DE DIFERENTES FOR Y ARRAY. SON OTRAS MANERAS PARA HACER LAS COSAS

package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		/*
		 * Empleado empleado1 = new Empleado("Vicky", 83000, 1999, 8, 20); Empleado
		 * empleado2 = new Empleado("Rafaello", 24000, 2000, 11, 02);
		 * 
		 * empleado1.subidaSueldo(5); System.out.println("Nombre: " +
		 * empleado1.getNombre()+ ". Sueldo: " + empleado1.getSueldo() +
		 * ". Fecha Alta: " + empleado1.getFechaAlta());
		 * 
		 * empleado2.subidaSueldo(5); System.out.println("Nombre: " +
		 * empleado2.getNombre()+ ". Sueldo: " + empleado2.getSueldo() +
		 * ". Fecha Alta: " + empleado2.getFechaAlta());
		 */
    //FORMA 2. CON FOREACH
		Empleado[] misEmpleados = new Empleado[2];

		misEmpleados[0] = new Empleado("Vicky", 83000, 1999, 8, 20);
		misEmpleados[1] = new Empleado("Rafaello", 24000, 2000, 11, 02);

		/* FORMA 1
		 * for(int i=0;i<2;i++) { misEmpleados[i].subidaSueldo(5); }
		 */
    
    //FOMRMA 2. FOREACH
		for (Empleado e : misEmpleados) {
			e.subidaSueldo(5);
		}

		/* FORMA 1
		 * for(int i=0;i<2;i++) { System.out.println("Nombre: "+
		 * misEmpleados[i].getNombre() +
		 * ". Sueldo: "+misEmpleados[i].getSueldo()+". Fecha Alta: "+
		 * misEmpleados[i].getFechaAlta()); }
		 */

    //FORMA 2
		for (Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() + ". Sueldo: " + e.getSueldo()
					+ ". Fecha Alta: " + e.getFechaAlta());

		}
	}
}

class Empleado {
	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		// EL OBJETIVO ES QUE ESCRIBA UNA FECHA
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia); // ES MES MENOS 1 PORQUE JAVA SIEMPRE
																					// A CONTAR DESDE 0. PARA QUE CUENTE
																					// ENERO COMO UNO HAY QUE PONERLO
																					// ASI
		// NOS DEVUELVE UNA FECHA. LA HEMOS ALMACEENADO EN altaContrato
		altaContrato = calendario.getTime();
	}

	public String getNombre() { // GETTER

		return nombre;
	}

	public double getSueldo() { // GETTER
		return sueldo;
	}

	public Date getFechaAlta() { // GETTER
		return altaContrato;
	}

	public void subidaSueldo(double porcentaje) { // SETTER
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;

}
