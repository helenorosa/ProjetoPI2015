package br.com.helenorosa.projetopi2015;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author HELENOROSA
 */
public class SomadorTest {
    private Somador somador;
    
    @Before
    public void setUp() {
        somador = new Somador();
    }
    
    @Test
    public void esperoQueQuandoPassar10Eh20Retorne30() {
        Integer retorno = somador.somarDoisNumeros(10, 20);
        Integer esperado = 30;
        
        assertEquals( esperado, retorno );
    }
        
    @Test
    public void esperoQueQuandoPassar10Eh20NaoRetorne10() {
        Integer retorno = somador.somarDoisNumeros(10, 20);
        Integer esperado = 10;
        
        assertNotSame( esperado, retorno );
    }
    
}
