package io.henao.personalsoft.empresaLeonisa;

public class Leonisa extends Producto implements ProntoPagable{
    public Leonisa(String ciu, double precio, String tipoPrenda, String talla, String color, String material){
        super(ciu, precio, tipoPrenda, talla, color, material);
    }
}
