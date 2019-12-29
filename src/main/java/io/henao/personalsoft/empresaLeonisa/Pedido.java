package io.henao.personalsoft.empresaLeonisa;

import java.util.ArrayList;

public class Pedido {
    private int cantidadUnidad;
    private String medioPago;
    private double descuento;
    private int prontoPago;

    private ArrayList<Producto> productoArr = new ArrayList<Producto>();

    public void asignarProducto(Leonisa leonisa){
        productoArr.add(leonisa);
    }

    public void asignarProducto(Leo leo){
        productoArr.add(leo);
    }

    public void asignarProducto(Teen teen){
        productoArr.add(teen);
    }

    public double totalCompra(){
        return 0;
    }

    public double costoFactura(){
        return 0;
    }
}
