package br.com.helenorosa.projetopi2015;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author HELENOROSA
 */
public class SubtrairTest {
    private Subtrair subtrair;
    
    @Before
    public void setUp() {
        subtrair = new Subtrair();
    }
    
    @Test
    public void esperoQueQuandoPassar20Eh20Retorne0() {
        Integer retorno = subtrair.subtrairDoisNumeros(20, 20);
        Integer esperado = 0;
        
        assertEquals( esperado, retorno );
    }
        
    @Test
    public void esperoQueQuandoPassar10Eh20NaoRetorne10() {
        Integer retorno = subtrair.subtrairDoisNumeros(10, 20);
        Integer esperado = 10;
        
        assertNotSame( esperado, retorno );
    }
}
