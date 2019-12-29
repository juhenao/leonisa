package io.henao.personalsoft.empresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeonisaTest {
    private Leonisa leonisa;

    @Before
    public void setup(){
        leonisa = new Leonisa("AFB002", 25000, "Bra", "34C", "Rosado", "Algodón");
    }

    @Test
    public void descProntoPagoVeinteTest(){
        Assert.assertEquals("El descuento no es el esperado", 0.2, leonisa.descProntoPago(10, null), 0);
    }

    @Test
    public void descProntoPagoTreintaTest(){
        Assert.assertEquals("El descuento no es el esperado", 0.3, leonisa.descProntoPago(2, null), 0);
    }

    @Test
    public void descProntoPagoDiesTest(){
        Assert.assertEquals("El descuento no es el esperado", 0.1, leonisa.descProntoPago(30, null), 0);
    }
}
