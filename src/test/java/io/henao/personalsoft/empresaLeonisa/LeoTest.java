package io.henao.personalsoft.empresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeoTest {
    private Leo leo;

    @Before
    public void setup(){
        leo = new Leo("AFBo001", 15000, "Boxer", "S", "Gris", "Algodón");
    }

    @Test
    public void descProntoPagoTest(){
        Assert.assertEquals("El descuento para Leo en pronto pago no es el esperado", 0.3, leo.descProntoPago(1), 0);
    }

    @Test
    public void descPagoEfectivoTest(){
        Assert.assertEquals("El descuento para leo en pago efectivo no es el esperado", 0.4, leo.descPagoEfectivo(1, "Pago efectivo"), 0);
    }

    @Test
    public void descPagoEfectivoMasUnidadTest(){
        Assert.assertEquals("El descuento para leo en pago efectivo no es el esperado", 0.5, leo.descPagoEfectivo(11, "Pago efectivo"), 0);
    }
}
