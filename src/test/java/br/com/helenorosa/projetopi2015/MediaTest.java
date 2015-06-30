package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class MediaTest {
    
       private Media media;
    
    @Before
    public void setUp() {
       media = new Media();
    }
    
    @Test
    public void esperoQueQuandoPassar10E10E10retorne10() {
        Integer retorno = media.somarTresNumerosDividirPorTres(10, 10, 10);
        Integer esperado = 10;
        
        assertEquals( esperado, retorno );
    }
        
     
}
