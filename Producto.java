package com.farmacia.venta;


import java.util.ArrayList;
import java.util.List;

public class Producto {

	private String codigo;

	private String tipoProducto; //{MEDICAMENTO, MEDICAMENTO_FORMULADO, SUPLEMENTO};

	private int precioBase;// debe ser mayor a cero
	private String nombre; // largo mínimo 3 caracteres
	private String contraindicaciones;// almacena las contraindicaciones de los medicamentos formulados

	private String esGenerico; //{SI, NO};

	private List<Vitamina> vitaminas = new ArrayList<Vitamina>();// solo para los suplementos

	public Producto(String codigo, String tipoProducto, int precioBase, String nombre, String contraindicaciones,
			String esGenerico, List<Vitamina> vitaminas) {
		this.codigo = codigo;
		this.tipoProducto = tipoProducto;
		this.precioBase = precioBase;
		this.nombre = nombre;
		this.contraindicaciones = contraindicaciones;
		this.esGenerico = esGenerico;
		this.vitaminas = vitaminas;
	}
	
	public Producto(String codigo, String tipoProducto, int precioBase, String nombre, String contraindicaciones,
			String esGenerico) {
		this.codigo = codigo;
		this.tipoProducto = tipoProducto;
		this.precioBase = precioBase;
		this.nombre = nombre;
		this.contraindicaciones = contraindicaciones;
		this.esGenerico = esGenerico;
	}

	public Producto() {
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
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

	public String getContraindicaciones() {
		return contraindicaciones;
	}

	public void setContraindicaciones(String contraindicaciones) {
		this.contraindicaciones = contraindicaciones;
	}

	public List<Vitamina> getVitaminas() {
		return vitaminas;
	}

	public void setVitaminas(List<Vitamina> vitaminas) {
		this.vitaminas = vitaminas;
	}

	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getEsGenerico() {
		return esGenerico;
	}

	public void setEsGenerico(String esGenerico) {
		this.esGenerico = esGenerico;
	}

	@Override
	public String toString() {
		return "\nProducto [codigo=" + codigo + ", tipoProducto=" + tipoProducto + ", precioBase=" + precioBase
				+ ", nombre=" + nombre + ", contraindicaciones=" + contraindicaciones + ", esGenerico=" + esGenerico
				+ ", vitaminas=" + vitaminas + "]";
	}



}
