package io.henao.personalsoft.empresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeenTest {
    private Teen teen;

    @Before
    public void setup(){
        teen = new Teen("AFP001", 15000, "Panti", "S", "Blanco", "Algodón");
    }

    @Test
    public void descPagoEfectivotest(){
        Assert.assertEquals("El descuento para la categoria Teen no es el esperado", 0.4, teen.descPagoEfectivo(0, "Pago efectivo"), 0);
    }
}
