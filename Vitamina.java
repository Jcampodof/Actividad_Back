package com.farmacia.venta;


public class Vitamina {
	private String nombreVitamina;
	private String informacionVitamina;

	public Vitamina(String nombreVitamina, String informacionVitamina) {
		this.nombreVitamina = nombreVitamina;
		this.informacionVitamina = informacionVitamina;
	}

	public Vitamina() {
	}

	public String getNombreVitamina() {
		return nombreVitamina;
	}

	public void setNombreVitamina(String nombreVitamina) {
		this.nombreVitamina = nombreVitamina;
	}

	public String getInformacionVitamina() {
		return informacionVitamina;
	}

	public void setInformacionVitamina(String informacionVitamina) {
		this.informacionVitamina = informacionVitamina;
	}

	@Override
	public String toString() {
		return "Vitamina [nombreVitamina=" + nombreVitamina + ", informacionVitamina=" + informacionVitamina + "]";
	}

}
