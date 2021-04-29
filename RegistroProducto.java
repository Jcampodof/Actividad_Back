package com.farmacia.venta;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.farmacia.venta.Producto;
import com.farmacia.venta.Vitamina;

public class RegistroProducto {

	/***** 2. agregar un producto si se valida que el código no existe previamente en la lista */
	public static List<Producto> agregarProducto(List<Producto> stock) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		Scanner sc5 = new Scanner(System.in);
		Scanner sc6 = new Scanner(System.in);
		Scanner sc7 = new Scanner(System.in);

		int prcBase;
		String codProd, nomProd, tipoProd = "", contras = "", generico = "", opcion = "", gen;

		Vitamina vit = new Vitamina();
		List<Vitamina> vitas = new ArrayList<Vitamina>();

		System.out.println("1. Agregar datos de nuevo producto: ");

		System.out.println("Codigo de producto: ");
		codProd = sc.nextLine();

		boolean bandera = false;//valida si el código ya existe
		for (Producto p : stock) {
			if (p.getCodigo().equals(codProd)) {
				bandera = true;
				break;
			} else
				bandera = false;
		}
		//System.out.println("bandera" + bandera);

		if (bandera == false) {
			// aca va todo lo demás
			System.out.println("Nombre de producto: ");
			nomProd = sc.nextLine();

			System.out.println("Precio base: ");
			prcBase = sc.nextInt();

			System.out.println("Seleccione tipo de producto: 1=Medicamento; 2=Formulado; 3=Suplemento");
			opcion = sc2.nextLine();

			switch (opcion) {
			case "1": // Medicamento
				System.out.println("Es genérico?: S/N");
				gen = sc3.nextLine();
				if (gen.equals("s") || gen.equals("S")) {
					generico = "SI";
				} else {
					generico = "NO";
				}
				break;
			case "2": // Formulado
				System.out.println("Contraindicaciones: ");
				contras = sc4.nextLine();
				break;
			case "3": // Suplemento -- agregar vitaminas si es un suplemento:
				System.out.println("Cantidad de vitaminas: ");// pregunta cuantas vitaminas y permite ingresar esa
																// cantidad de veces los nombres de las vitaminas
				int cv = sc5.nextInt();

				for (int i = 0; i < cv; i++) {
					System.out.println("Ingrese nombre de vitamina: ");
					String nv = sc6.nextLine();
					vit.setNombreVitamina(nv);
					System.out.println("Ingrese información de vitamina: ");
					String iv = sc7.nextLine();
					vit.setInformacionVitamina(iv);
					vitas.add(vit);
				}
				break;
			default:
				System.out.println("Los datos que ingresaste no son válidos");

			}// fin switch case
			stock.add(new Producto(codProd, tipoProd, prcBase, nomProd, contras, generico, vitas));// agrego prod stock
		}

		else {
			System.out.println("el producto ya existe");
		}

		return stock;// devuelve el arreglo con todos los productos
	}// fin agregar a stock

	public void listarProductosSobreprecio(List<Producto> stock) {// 3. muestra los prod con preciobase > 10000
		System.out.println("Productos con sobreprecio: \n" +stock.toString());																	
	}// fin sobreprecios

	public void eliminarProducto(List<Producto> stock) {// 4. eliminar todos los prods con precio <2000, indicar cuántos
														// se eliminaron
	}// fin eliminar prod

}
