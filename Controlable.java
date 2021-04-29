package com.farmacia.venta;

import java.util.List;

public interface Controlable {

	public final double DESCUENTO = 0.10;

	public double descontar(String dia);

	/**
	 * realiza el descuento si el día ingresado es lunes si es medicamento, sólo se
	 * aplica a los genéricos. Si es suplemento se aplica a todos
	 */

	public void mostrar(Producto prd);// string con todas las características de un producto

	public abstract int recargar();

	/**
	 * aplica un recargo al precio de venta: genéricos= sin recargo; no genéricos=
	 * 20% de recargo; suplementos = 2% de recargo por cada vitamina
	 */

	public int totalizar(List<Producto> listaPrd);/**
													 * Calcula el precio total de la venta, cantidad * precios
													 * (considerando recargas y/o descuentos)
													 ***/

}
