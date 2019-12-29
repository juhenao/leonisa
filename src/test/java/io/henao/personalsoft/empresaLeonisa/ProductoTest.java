package io.henao.personalsoft.empresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductoTest {
    private Producto pr;

    @Before
    public void setup(){
        pr = new Producto("AFB001", 25000, "Bra", "32", "Negro", "Algodón");
    }

    @Test
    public void getCiuTest(){
        Assert.assertEquals("El código no es el esperado", "AFB001", pr.getCiu());
    }

    @Test
    public void setPrecioTest(){
        pr.setPrecio(25000);
        Assert.assertEquals("El precio no es el enviado", 25000, pr.getPrecio(), 0);
    }

    @Test
    public void getPrecioTest(){
        Assert.assertEquals("El precio no es el esperado", 25000, pr.getPrecio(), 0);
    }
}
