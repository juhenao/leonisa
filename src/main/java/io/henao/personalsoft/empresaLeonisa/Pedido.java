package io.henao.personalsoft.empresaLeonisa;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Pedido {
    private int cantidadUnidad;
    private String medioPago;
    private double descuento;
    private int prontoPago;

    private ArrayList<Producto> producto = new ArrayList<Producto>();

    public Pedido(int cantidadUnidad, String medioPago, double descuento, int prontoPago){
        this.cantidadUnidad = cantidadUnidad;
        this.medioPago = medioPago;
        this.descuento = descuento;
        this.prontoPago = prontoPago;
    }

    public void asignarProducto(Leonisa leonisa){
        producto.add(leonisa);
    }

    public void asignarProducto(Leo leo){
        producto.add(leo);
    }

    public void asignarProducto(Teen teen){
        producto.add(teen);
    }

    public double totalCompra(double precio){
        double totalCompraCategoria = 0;
        double totalDescuento = 0;
        totalCompraCategoria = (precio * this.cantidadUnidad);
        totalDescuento = totalCompraCategoria * this.descuento;
        totalCompraCategoria -= totalDescuento;
        return  totalCompraCategoria;
    }

    public double costoFactura(){
        return 0;
    }

    public int getCantidadUnidad() {
        return cantidadUnidad;
    }

    public void setCantidadUnidad(int cantidadUnidad) {
        this.cantidadUnidad = cantidadUnidad;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getProntoPago() {
        return prontoPago;
    }

    public void setProntoPago(int prontoPago) {
        this.prontoPago = prontoPago;
    }
}
