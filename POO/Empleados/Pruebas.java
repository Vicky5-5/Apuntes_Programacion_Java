package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados e1 = new Empleados("Paco");
		
		System.out.println(e1.devuelveDatos());
		e1.cambiarSeccion("Desarrollo");
		System.out.println(e1.devuelveDatos());

		
	}

}

class Empleados {

	private final String nombre; // como no se modifica en todo el proyecto se pone final y no se puede cambiar el valor de nombre
	private String seccion;
	
	//Estado inicial de cada empleado al entrar 
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administración";
	}
	
	public void cambiarSeccion(String seccionNueva) { //Setter
		this.seccion=seccionNueva;
	}
	
	public String devuelveDatos() {
		return "El nombre es "+ nombre + " y la sección es " + seccion;
	}
}
