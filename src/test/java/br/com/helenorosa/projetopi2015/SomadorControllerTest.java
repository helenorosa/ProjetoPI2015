
package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class SomadorControllerTest {
    
    private SomadorController somadorController;
    
    @Before
    public void setUp() {
       somadorController = new SomadorController();
    }
    
    @Test
    public void esperoRetornoDaPaginaMedia() {
        String retorno = somadorController.paginaIndex();     
        assertEquals(retorno, "somar");
        
    }
    
}
