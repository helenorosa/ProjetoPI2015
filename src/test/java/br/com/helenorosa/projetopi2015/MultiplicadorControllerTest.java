package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class MultiplicadorControllerTest {
    
    private MultiplicadorController multiplicadorController;
      
    @Mock
    private Model model;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
       multiplicadorController = new MultiplicadorController();
    }
    
    @Test
    public void esperoRetornoDaPaginaIndex() {
        String retorno = multiplicadorController.paginaIndex();     
        assertEquals(retorno, "multiplica");
        
    }
    
    @Test
    public void esperoRetornoDeMultiplicar() {
        String retorno = multiplicadorController.somar(Integer.SIZE, Integer.SIZE, model);     
        assertEquals(retorno, "multiplica");
        
    }
    
}
