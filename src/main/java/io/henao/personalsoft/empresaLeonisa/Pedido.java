package io.henao.personalsoft.empresaLeonisa;

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
        // TODO: Añadir descuentos
        double totalCompraCategoria = 0;
        totalCompraCategoria = precio * this.cantidadUnidad;
        return  totalCompraCategoria;
    }

    public double costoFactura(){
        return 0;
    }
}
