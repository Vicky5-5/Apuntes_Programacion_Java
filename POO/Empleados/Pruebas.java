package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados e1 = new Empleados("Paco");
		Empleados e2 = new Empleados("Ana");
		Empleados e3 = new Empleados("Roberto");

		e1.cambiarSeccion("Desarrollo");
	
		e3.cambiarSeccion("Sistemas");
		
		System.out.println(e1.devuelveDatos() + "\n" + e2.devuelveDatos() + "\n"+
		e3.devuelveDatos());
		System.out.println(Empleados.devuelveIdSiguiente()); //Para llamar al metodo static es nombre de la clase + nombre del método
	}

		
	}

}

class Empleados {

	private final String nombre; // como no se modifica en todo el proyecto se pone final y no se puede cambiar el valor de nombre
	private String seccion;
	private int Id; //Es único para cada empleado
	private static int IdSiguiente = 1; // esto es una variable static. Siempre tendrá este valor y tiene que estar inicializada.
	//Estado inicial de cada empleado al entrar 
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administración";
		Id=IdSiguiente; //después de decir que el id ess 1 lo incrementamos
		IdSiguiente++;
	}
	
	public void cambiarSeccion(String seccionNueva) { //Setter
		this.seccion=seccionNueva;
	}
	//los estaticos no trabajan sobre los objetos, lo hacen sobre la clase. Tampoco acceden a los campos ejemplar a no ser que sean static (como IdSiguiente)
	public static String devuelveIdSiguiente() {
		return "El ID siguiente es "+ IdSiguiente;
	}
	public String devuelveDatos() {
		return "El nombre es "+ nombre + " y la sección es " + seccion;
	}
}
