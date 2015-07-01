package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class DivisorControllerTest {
    
    private DivisorController divisorController;
    
    @Before
    public void setUp() {
       divisorController = new DivisorController();
    }
    
    @Test
    public void esperoRetornoDaPaginaMedia() {
        String retorno = divisorController.paginaIndex();     
        assertEquals(retorno, "dividir");
        
    }
    
}
