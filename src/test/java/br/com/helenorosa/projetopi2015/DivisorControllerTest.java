package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class DivisorControllerTest {
    
    private DivisorController divisorController;
    
    @Mock
    private Model modelMock;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
       divisorController = new DivisorController();
    }
    
    @Test
    public void esperoRetornoDaPaginaMedia() {
        String retorno = divisorController.paginaIndex();     
        assertEquals(retorno, "dividir");
        
    }
    
    @Test
    public void esperoRetornoDeDividir() {
        String retorno = divisorController.dividir(Integer.SIZE, Integer.SIZE, modelMock);     
        assertEquals(retorno, "dividir");
        
    }
}
