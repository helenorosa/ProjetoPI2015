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
    public void esperoQueQuandoPassar10E20E30retorne10() {
        Integer retorno = media.somarTresNumerosDividirPorTres(10, 20, 30);
        Integer esperado = 20;
        
        assertEquals( esperado, retorno );
    }
    
    @Test
    public void esperoQueQuandoPassar10E10E10NaoRetorne5() {
        Integer retorno = media.somarTresNumerosDividirPorTres(10, 10, 10);
        Integer esperado = 10;
        
        assertEquals( esperado, retorno );
    }
     
}
