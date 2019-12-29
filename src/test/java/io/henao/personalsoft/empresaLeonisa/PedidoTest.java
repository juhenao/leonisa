package io.henao.personalsoft.empresaLeonisa;

import io.henao.personalsoft.personalException.PedidoException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PedidoTest {
    private Pedido pedidoLeonisa;
    private Pedido pedidoLeo;
    private Pedido pedidoTeen;
    private Leonisa leonisa;
    private Leo leo;
    private Teen teen;

    private ArrayList<Producto> producto = new ArrayList<Producto>();

    @Before
    public void setup(){

        pedidoLeonisa = new Pedido(3, "Pronto pago", 0.6, 10);
        pedidoLeo = new Pedido(1, "Pago efectivo", 0.4, 0);
        pedidoTeen = new Pedido(2, "Pago efectivo", 0.8, 0);
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

    @Test
    public void totalCompraTestLeonisa(){
        Assert.assertEquals("El total de la compra no es el esperado", 42000, pedidoLeonisa.totalCompra(leonisa.getPrecio()), 0);
    }

    @Test
    public void totalCompraTestLeo(){
        Assert.assertEquals("El total de la compra no es el esperado", 9000, pedidoLeo.totalCompra(leo.getPrecio()), 0);
    }

    @Test
    public void totalCompraTestTeen(){
        Assert.assertEquals("El total de la compra no es el esperado", 10000, pedidoTeen.totalCompra(teen.getPrecio()), 0);
    }

    @Test
    public void setCantidadUnidadLeoTest(){
        pedidoLeo.setCantidadUnidad(1);
        Assert.assertEquals("Las unidades enviadas no son las esperadas", 1, pedidoLeo.getCantidadUnidad(), 0);
    }

    @Test
    public void getCantidadUnidadLeoTest(){
        Assert.assertEquals("Las unidades enviadas no son las esperadas", 1, pedidoLeo.getCantidadUnidad(), 0);
    }

    @Test
    public void setCantidadUnidadTeenTest(){
        pedidoTeen.setCantidadUnidad(2);
        Assert.assertEquals("Las unidades enviadas no son las esperadas", 2, pedidoTeen.getCantidadUnidad(), 0);
    }

    @Test
    public void getCantidadUnidadTeenTest(){
        Assert.assertEquals("Las unidades enviadas no son las esperadas", 2, pedidoTeen.getCantidadUnidad(), 0);
    }

    @Test
    public void setMedioPagoLeonisaTest(){
        pedidoLeonisa.setMedioPago("Pronto pago");
        Assert.assertEquals("El medio de pago enviado no es el esperado", "Pronto pago", pedidoLeonisa.getMedioPago());
    }

    @Test
    public void getMedioPagoLeonisaTest(){
        Assert.assertEquals("El medio de pago enviado no es el esperado", "Pronto pago", pedidoLeonisa.getMedioPago());
    }

    @Test
    public void setMedioPagoLeoTest(){
        pedidoLeo.setMedioPago("Pago efectivo");
        Assert.assertEquals("El medio de pago enviado no es el esperado", "Pago efectivo", pedidoLeo.getMedioPago());
    }

    @Test
    public void getMedioPagoLeoTest(){
        Assert.assertEquals("El medio de pago enviado no es el esperado", "Pago efectivo", pedidoLeo.getMedioPago());
    }

    @Test
    public void setMedioPagoTeenTest(){
        pedidoTeen.setMedioPago("Pago efectivo");
        Assert.assertEquals("El medio de pago enviado no es el esperado", "Pago efectivo", pedidoTeen.getMedioPago());
    }

    @Test
    public void getMedioPagoTeenTest(){
        Assert.assertEquals("El medio de pago enviado no es el esperado", "Pago efectivo", pedidoTeen.getMedioPago());
    }

    @Test
    public void setProntoPagoLeonisaTest(){
        pedidoLeonisa.setProntoPago(10);
        Assert.assertEquals("El pronto pago enviado no es el esperado", 10, pedidoLeonisa.getProntoPago());
    }

    @Test
    public void getProntoPagoLeonisaTest(){
        Assert.assertEquals("El pronto pago enviado no es el esperado", 10, pedidoLeonisa.getProntoPago());
    }

    @Test
    public void setProntoPagoLeoTest(){
        pedidoLeo.setProntoPago(0);
        Assert.assertEquals("El pronto pago enviado no es el esperado", 0, pedidoLeo.getProntoPago());
    }

    @Test
    public void getProntoPagoLeoTest(){
        Assert.assertEquals("El pronto pago enviado no es el esperado", 0, pedidoLeo.getProntoPago());
    }

    @Test
    public void setProntoPagoTeenTest(){
        pedidoTeen.setProntoPago(0);
        Assert.assertEquals("El pronto pago enviado no es el esperado", 0, pedidoTeen.getProntoPago());
    }

    @Test
    public void getProntoPagoTeenTest(){
        Assert.assertEquals("El pronto pago enviado no es el esperado", 0, pedidoTeen.getProntoPago());
    }

    @Test
    public void setCantidadUnidadLeonisaTest(){
        pedidoLeonisa.setCantidadUnidad(3);
        Assert.assertEquals("Las unidades enviadas no son las esperadas", 3, pedidoLeonisa.getCantidadUnidad(), 0);
    }

    @Test
    public void getCantidadUnidadLeonisaTest(){
        Assert.assertEquals("Las unidades enviadas no son las esperadas", 3, pedidoLeonisa.getCantidadUnidad(), 0);
    }

    @Test
    public void setDescuentoLeonisaTest(){
        pedidoLeonisa.setDescuento(0.6);
        Assert.assertEquals("El descuento enviado no es el esperado", 0.6, pedidoLeonisa.getDescuento(), 0);
    }

    @Test
    public void getDescuentoLeonisaTest(){
        Assert.assertEquals("El total de descuanto no es el esperado", 0.6, pedidoLeonisa.getDescuento(), 0);
    }

    @Test
    public void setDescuentoLeoTest(){
        pedidoLeo.setDescuento(0.4);
        Assert.assertEquals("El descuento enviado no es el esperado", 0.4, pedidoLeo.getDescuento(), 0);
    }

    @Test
    public void getDescuentoLeoTest(){
        Assert.assertEquals("El total de descuanto no es el esperado", 0.4, pedidoLeo.getDescuento(), 0);
    }

    @Test
    public void setDescuentoTeenTest(){
        pedidoTeen.setDescuento(0.8);
        Assert.assertEquals("El descuento enviado no es el esperado", 0.8, pedidoTeen.getDescuento(), 0);
    }

    @Test
    public void getDescuentoLTeenTest(){
        Assert.assertEquals("El total de descuanto no es el esperado", 0.8, pedidoTeen.getDescuento(), 0);
    }
}
