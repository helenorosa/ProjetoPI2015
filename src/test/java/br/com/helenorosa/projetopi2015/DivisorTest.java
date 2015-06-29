package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class DivisorTest {
    
       private Divisor divisor;
    
    @Before
    public void setUp() {
       divisor = new Divisor();
    }
    
    @Test
    public void esperoQueQuandoPassar10E2retorne5() {
        Integer retorno = divisor.dividirDoisNumeros(10, 2);
        Integer esperado = 5;
        
        assertEquals( esperado, retorno );
    }
        
     
}
