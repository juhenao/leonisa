package io.henao.personalsoft.empresaLeonisa;

public class Leonisa extends Producto implements ProntoPagable{
    public Leonisa(String ciu, double precio, String tipoPrenda, String talla, String color, String material){
        super(ciu, precio, tipoPrenda, talla, color, material);
    }

    public double descProntoPago(int prontoPago, String metodoPago) {
        double descuento = 0;
        double totalDescuento = 0;

        if(prontoPago > 0 && prontoPago <= 2){
            descuento += (30.0 / 100.0);
            totalDescuento = descuento;
        } else if(prontoPago <= 10 && prontoPago > 2){
            descuento += (20.0 / 100.0);
            totalDescuento = descuento;
        } else if(prontoPago > 20){
            descuento += (10.0 / 100.0);
            totalDescuento = descuento;
        }

        return totalDescuento;
    }
}
