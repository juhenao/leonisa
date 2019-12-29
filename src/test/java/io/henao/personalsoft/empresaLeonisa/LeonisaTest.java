package io.henao.personalsoft.empresaLeonisa;

import org.junit.Before;

public class LeonisaTest {
    private Leonisa le;

    @Before
    public void setup(){
        le = new Leonisa("AFB002", 25000, "Bra", "34C", "Rosado", "Algodón");
    }
}
