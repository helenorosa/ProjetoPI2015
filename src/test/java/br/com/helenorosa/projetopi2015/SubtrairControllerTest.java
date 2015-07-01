package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class SubtrairControllerTest {
    
    private SubtrairController subtrairController;
    
    @Before
    public void setUp() {
       subtrairController = new SubtrairController();
    }
    
    @Test
    public void esperoRetornoDaPaginaMedia() {
        String retorno = subtrairController.paginaIndex();     
        assertEquals(retorno, "subtrair"); 
    }
    
}
