package com.farmacia.venta;

import java.util.List;

public interface Controlable {

	public final double DESCUENTO = 0.10;

	public double descontar(String dia);

	/**
	 * realiza el descuento si el d�a ingresado es lunes si es medicamento, s�lo se
	 * aplica a los gen�ricos. Si es suplemento se aplica a todos
	 */

	public void mostrar(Producto prd);// string con todas las caracter�sticas de un producto

	public abstract int recargar();

	/**
	 * aplica un recargo al precio de venta: gen�ricos= sin recargo; no gen�ricos=
	 * 20% de recargo; suplementos = 2% de recargo por cada vitamina
	 */

	public int totalizar(List<Producto> listaPrd);/**
													 * Calcula el precio total de la venta, cantidad * precios
													 * (considerando recargas y/o descuentos)
													 ***/

}
