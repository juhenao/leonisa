package io.henao.personalsoft.empresaLeonisa;

import io.henao.personalsoft.personalException.PedidoException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PedidoTest {
    private Pedido pedido;
    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;

    private ArrayList<Producto> producto = new ArrayList<Producto>();

    @Before
    public void setup(){
        pedido = new Pedido();
        leonisa = new Leonisa("AFF001", 35000, "Faja", "S", "Negro", "Algodón");
        leo = new Leo("AFC001", 15000, "Camisilla", "S", "Blanco", "Algodón");
        teen = new Teen("AFB003", 25000, "Bra", "34C", "Morado", "Algodón");

        producto.add(leonisa);
        producto.add(leo);
        producto.add(teen);
    }

    @Test
    public void asignarProductoLeonisaTest(){
        boolean asignadoLeonisa = producto.contains(leonisa);
        Assert.assertTrue("No se ha asignado un producto 'Leonisa' al pedido", asignadoLeonisa);
    }

    @Test
    public void asignarProductoLeoTest(){
        boolean asignadoLeo = producto.contains(leo);
        Assert.assertTrue("No se ha asignado un producto 'Leo' al pedido", asignadoLeo);
    }

    @Test
    public void asignarProductoTeenTest(){
        boolean asignadoTeen = producto.contains(teen);
        Assert.assertTrue("No se ha asignado un producto 'Teen' al pedido", asignadoTeen);
    }
}
