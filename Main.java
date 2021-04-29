package com.farmacia.venta;

import java.util.ArrayList;
import java.util.List;

import com.farmacia.*;
import com.farmacia.venta.Producto;

public class Main {

	public static void main(String[] args) {
		// 1. Crear medicamento y obtener el total
		// 1.1. agregar dos medicamentos y dos suplementos
		// 2. Invocar a todos los metodos de RegistroProducto
		System.out.println("Main: ");
		
		List<Producto> stock = new ArrayList<Producto>();
		// stock previo de productos
		Producto prd1 = new Producto("1111", "Medicamento", 12990, "Aspirina", "derrame cerebral", "no");
		Producto prd2 = new Producto("1112", "Medicamento", 1200, "Omeprazol", "osteoporosis", "no");
		stock.add(prd1); stock.add(prd2);//agrego dos productos iniciales
		
		System.out.println("Productos en Stock:" + RegistroProducto.agregarProducto(stock).toString());		


		Medicamento medicamento = new Medicamento();
		medicamento.setCodigo(1);
		medicamento.setPrecioBase(20000);
		medicamento.setGenerico(false);
		medicamento.setContraindicaciones("ansiedad");
		medicamento.setFormulado(false);

		System.out.println(medicamento.getCodigo());

		medicamento.calcularPagar(medicamento.getPrecioBase(), 1);

}
	
}
