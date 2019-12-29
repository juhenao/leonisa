package io.henao.personalsoft.empresaLeonisa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CategoriaTest {
    private Categoria ca;

    @Before
    public void setup(){
        ca = new Categoria("Bra", "32", "Negro", "Algodón");
    }

    @Test
    public void getTipoPrendaTest(){
        Assert.assertEquals("El tipo de prenda no es el esperado", "Bra", ca.getTipoPrenda());
    }

    @Test
    public void getTallaTest(){
        Assert.assertEquals("La talla no es la esperada", "32", ca.getTalla());
    }

    @Test
    public void getColorTest(){
        Assert.assertEquals("El color no es el esperado", "Negro", ca.getColor());
    }

    @Test
    public void getMaterialTest(){
        Assert.assertEquals("El material no es el esperado", "Algodón", ca.getMaterial());
    }
}
