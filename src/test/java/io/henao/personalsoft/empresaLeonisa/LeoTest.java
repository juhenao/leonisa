package io.henao.personalsoft.empresaLeonisa;

import org.junit.Before;

public class LeoTest {
    private Leo le;

    @Before
    public void setup(){
        le = new Leo("AFBo001", 15000, "Boxer", "S", "Gris", "Algodón");
    }
}
