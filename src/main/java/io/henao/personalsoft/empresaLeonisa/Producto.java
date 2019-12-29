package io.henao.personalsoft.empresaLeonisa;

public class Producto {
    // Atributos
    private String ciu;
    private double precio;
    private Categoria categoria;

    public Producto(String ciu, double precio, String tipoPrenda, String talla, String color, String material){
        categoria = new Categoria(tipoPrenda, talla, color, material);
        this.ciu = ciu;
        this.precio = precio;
    }

    public String getCiu() {
        return ciu;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
