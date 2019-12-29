package io.henao.personalsoft.empresaLeonisa;

public class Teen extends Producto implements Cashable{
    public Teen(String ciu, double precio, String tipoPrenda, String talla, String color, String material){
        super(ciu, precio, tipoPrenda, talla, color, material);
    }

    public double descPagoEfectivo(int cantidadUnidad, String medioPago){
        double descuento = 0;
        double totalDescuento = 0;
        if(medioPago == "Pago efectivo"){
            descuento += (40.0 / 100.0);
            totalDescuento = descuento;
        }

        return totalDescuento;
    }
}
