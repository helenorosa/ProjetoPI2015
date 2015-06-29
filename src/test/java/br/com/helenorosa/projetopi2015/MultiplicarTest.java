
package br.com.helenorosa.projetopi2015;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class MultiplicarTest {
    private Multiplicador multiplicador;
    
    @Before
    public void setUp() {
        multiplicador = new Multiplicador();
    }
    
    @Test
    public void esperoQueQuandoPassar10Eh20Retorne30() {
        Integer retorno = multiplicador.multiplicarDoisNumeros(5, 2);
        Integer esperado = 10;
        
        assertEquals( esperado, retorno );
    }
}
