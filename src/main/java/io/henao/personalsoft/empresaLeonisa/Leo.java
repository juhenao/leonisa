package io.henao.personalsoft.empresaLeonisa;

public class Leo extends Producto implements ProntoPagable, Cashable{
    public Leo(String ciu, double precio, String tipoPrenda, String talla, String color, String material){
        super(ciu, precio, tipoPrenda, talla, color, material);
    }
}
