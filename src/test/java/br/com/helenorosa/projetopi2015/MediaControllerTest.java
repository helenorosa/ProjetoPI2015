package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class MediaControllerTest {
     private MediaController mediaController;
    
    @Before
    public void setUp() {
       mediaController = new MediaController();
    }
    
    @Test
    public void esperoRetornoDaPaginaMedia() {
        String retorno = mediaController.paginaIndex();     
        assertEquals(retorno, "media");
        
    }
    
}
