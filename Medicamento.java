package com.farmacia.venta;


import java.util.ArrayList;

public class Medicamento {

private int codigo;
private int precioBase;
private String nombre;
private boolean generico;
private ArrayList<String> cantidadVitaminas;
private ArrayList<String> informacionVitaminas;
private String contraindicaciones;
private boolean formulado;




public Medicamento() {

}


public Medicamento(int codigo, int precioBase, String nombre, boolean generico, ArrayList<String> cantidadVitaminas,
ArrayList<String> informacionVitaminas, String contraindicaciones, boolean formulado) {
this.codigo = codigo;
this.precioBase = precioBase;
this.nombre = nombre;
this.generico = generico;
this.cantidadVitaminas = cantidadVitaminas;
this.informacionVitaminas = informacionVitaminas;
this.contraindicaciones = contraindicaciones;
this.formulado = formulado;
}


public void calcularPagar(int precio , int dia) {
double precioTotal = 0;

if(this.generico==false) {

precioTotal = this.precioBase*1.2;
System.out.println("Con recargo del 20%");

}else {

precioTotal = this.precioBase;
}


if(dia==1) {
precioTotal = precioTotal*0.9;
System.out.println("Precio a Pagar con Descuento :"+precioTotal);

}else {

System.out.println("Precio a Pagar:"+precioTotal);

}



}


public void mostrar() {

System.out.println("Codigo:"+this.getCodigo());
System.out.println("Precio base:"+this.getPrecioBase());
System.out.println("Nombre:"+this.getNombre());
System.out.println("CantidadVitaminas:"+this.getCantidadVitaminas());
System.out.println("InfoVitaminas:"+this.getInformacionVitaminas());
System.out.println("Contraindicaciones:"+this.contraindicaciones);
System.out.println("Formulado:"+this.formulado);


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
public boolean isGenerico() {
return generico;
}
public void setGenerico(boolean generico) {
this.generico = generico;
}
public ArrayList<String> getCantidadVitaminas() {
return cantidadVitaminas;
}
public void setCantidadVitaminas(ArrayList<String> cantidadVitaminas) {
this.cantidadVitaminas = cantidadVitaminas;
}
public ArrayList<String> getInformacionVitaminas() {
return informacionVitaminas;
}
public void setInformacionVitaminas(ArrayList<String> informacionVitaminas) {
this.informacionVitaminas = informacionVitaminas;
}
public String getContraindicaciones() {
return contraindicaciones;
}
public void setContraindicaciones(String contraindicaciones) {
this.contraindicaciones = contraindicaciones;
}
public boolean isFormulado() {
return formulado;
}
public void setFormulado(boolean formulado) {
this.formulado = formulado;
}




}