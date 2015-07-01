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
    public void esperoQueQuandoPassar10Eh20NaoRetorne30() {
        Integer retorno = subtrair.subtrairDoisNumeros(10, 20);
        Integer esperado = 30;
        
        assertNotSame( esperado, retorno );
    }
    
    @Test
    public void esperoQueQuandoPassar10Eh50RetorneMenos60() {
        Integer retorno = subtrair.subtrairDoisNumeros(-10, 50);
        Integer esperado = 60;
        
        assertNotSame( esperado, retorno );
    }
}
