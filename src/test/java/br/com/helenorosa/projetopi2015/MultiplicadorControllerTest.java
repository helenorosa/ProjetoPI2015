package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class MultiplicadorControllerTest {
    
    private MultiplicadorController multiplicadorController;
      
    @Before
    public void setUp() {
       multiplicadorController = new MultiplicadorController();
    }
    
    @Test
    public void esperoRetornoDaPaginaIndex() {
        String retorno = multiplicadorController.paginaIndex();     
        assertEquals(retorno, "multiplica");
        
    }
    
}
