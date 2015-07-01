package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class MediaControllerTest {
     private MediaController mediaController;
    
     @Mock
     private Model modelMock;
     
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
       mediaController = new MediaController();
    }
    
    @Test
    public void esperoRetornoDaPaginaMedia() {
        String retorno = mediaController.paginaIndex();     
        assertEquals(retorno, "media");
        
    }
    
    @Test
    public void esperoRetornoDeMedia() {
        String retorno = mediaController.dividir(Integer.SIZE, Integer.SIZE, Integer.SIZE, modelMock);     
        assertEquals(retorno, "media");
        
    }
}
