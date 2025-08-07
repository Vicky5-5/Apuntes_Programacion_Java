package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	public Coche() {
		super();
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;

	}

	public void estableceColor(String colorCoche) {
		color = colorCoche;
	}

	public String dimeColor() {
		return "El coche de color " + color;
	}

	public String dime_datos_generales() {
		return "La plataforma del vehículo tiene " + ruedas + ". Mide " + largo / 1000 + " metros con un ancho " + ancho
				+ " cm y un peso de la plataforma de " + peso_plataforma + " kg. Es de color " + color;
	}

	public void configura_asientos(String asientos_cuero) { // SETTER
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

	public String dime_asientos() { // GETTER
		if (asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
	}

	public void configura_climatizador(String climatizador) { // SETTER
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String dime_climatizador() { // GETTER
		if (climatizador == true) {
			return "El coche incorpora climatizador";
		} else {
			return "El coche tiene airde acondicionado";
		}
	}

	public String dime_peso() { // SETTER y GETTER (NO RECOMENDABLE PARA CIERTOS CASO)
		int peso_carroceria = 500;

		peso_total = peso_plataforma + peso_carroceria;

		if (asientos_cuero == true) {
			peso_total = peso_total + 50;

		}
		if (climatizador == true) {
			peso_total = peso_total + 20;
		}
		return "El peso total del coche es " + peso_total;
	}

	public int percio_final() {
		int precio_final = 10000;

		if (asientos_cuero == true) {
			precio_final += 2000;
		}
		if (climatizador == true) {
			precio_final += 1500;
		}

		return precio_final;
	}

}
