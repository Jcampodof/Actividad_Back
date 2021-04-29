package com.farmacia.venta;

public class Suplemento_Alimenticio {

	private int codigo;
	private int precioBase;
	private String nombre;
	private int cantidadVitaminas;
	private String infoVitaminas;
	private String contraindicaciones;
	private String dia;

	String viernes = "viernes";

	// constructores
	public Suplemento_Alimenticio() {
	}

	public Suplemento_Alimenticio(int codigo, int precioBase, String nombre, int cantidadVitaminas,
			String infoVitaminas, String contraindicaciones) {
		super();
		this.codigo = codigo;
		this.precioBase = precioBase;
		this.nombre = nombre;
		this.cantidadVitaminas = cantidadVitaminas;
		this.infoVitaminas = infoVitaminas;
		this.contraindicaciones = contraindicaciones;
	}

	public Suplemento_Alimenticio(int codigo, int precioBase, String nombre, int cantidadVitaminas,
			String infoVitaminas, String contraindicaciones, String dia) {
		super();
		this.codigo = codigo;
		this.precioBase = precioBase;
		this.nombre = nombre;
		this.cantidadVitaminas = cantidadVitaminas;
		this.infoVitaminas = infoVitaminas;
		this.contraindicaciones = contraindicaciones;
		this.dia = dia;
	}

	// Metodo para obtener el descuento de día lunes
	public void decuentos(int precioBase, String dia) {
		int desc = 0;
		int descuento = 0;
		int total = 0;
		if (dia.equals(viernes)) {
			desc = (precioBase * 10) / 100;
			total = precioBase - desc;
			System.out.println("Tiene un descuento del 10%, el total a pagar es: " + total);
		} else {
			descuento = precioBase - desc;
			System.out.println("No tiene descuento, El total a pagar es: " + descuento);
		}

	}

	// Metodo para mostar las caracteristicas de un producto
	public void mostrar() {
		System.out.println("\n--------------------------------------------------------");
		System.out.println("\n****** PRODUCTO SELECCIONADO ******");
		System.out.println("CODIGO: " + codigo);
		System.out.println("PRECIO: " + precioBase);
		System.out.println("NOMBRE: " + nombre);
		System.out.println("CANTIDAD DE VITAMINAS: " + cantidadVitaminas);
		System.out.println("INFORMACION: " + infoVitaminas);
		System.out.println("CONTRAINDICACIONES: " + contraindicaciones);
	}

	// Metodo para recargar el precio en base a la cantidad de vitaminas
	public void recargar(int precioBase, int cantidadVitaminas) {
		int inc = 0;
		int totIncre = 0;
		int total = 0;
		inc = (precioBase * 2) / 100;
		totIncre = inc * cantidadVitaminas;
		System.out.println("\n--------------------------------------------------------");
		System.out.println("\nEste suplemento tiene un incemento en su valor de: " + totIncre);

		total = precioBase + totIncre;
		System.out.println("El total a pagar es: " + total);
		System.out.println("\n--------------------------------------------------------");

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadVitaminas() {
		return cantidadVitaminas;
	}

	public void setCantidadVitaminas(int cantidadVitaminas) {
		this.cantidadVitaminas = cantidadVitaminas;
	}

	public String getInfoVitaminas() {
		return infoVitaminas;
	}

	public void setInfoVitaminas(String infoVitaminas) {
		this.infoVitaminas = infoVitaminas;
	}

	public String getContraindicaciones() {
		return contraindicaciones;
	}

	public void setContraindicaciones(String contraindicaciones) {
		this.contraindicaciones = contraindicaciones;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

}

