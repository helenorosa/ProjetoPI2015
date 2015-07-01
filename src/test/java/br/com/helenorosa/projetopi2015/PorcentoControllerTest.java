package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class PorcentoControllerTest {
    
    private PorcentoController porcentoController;
    
    @Before
    public void setUp() {
       porcentoController = new PorcentoController();
    }
    
    @Test
    public void esperoRetornoDaPaginaMedia() {
        String retorno = porcentoController.paginaIndex();     
        assertEquals(retorno, "porcento");
        
    }
    
}
