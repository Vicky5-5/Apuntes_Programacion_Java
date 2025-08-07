package poo;

public class Principal {

	public static void main(String[] args) {

		Coche miCoche = new Coche();
		
		miCoche.estableceColor("negro");
		
		System.out.println(miCoche.dime_datos_generales());
		
		System.out.println(miCoche.dimeColor());
		
		
		miCoche.configura_asientos("no");
		System.out.println(miCoche.dime_asientos());
		
		miCoche.configura_climatizador("si");
		System.out.println(miCoche.dime_climatizador());
		
		miCoche.dime_peso();
		
		System.out.println("El precio final del coche es "+ miCoche.percio_final());
	}

}
