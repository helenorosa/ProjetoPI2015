package br.com.helenorosa.projetopi2015;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class MultiplicadorTest {
    private Multiplicador multiplicador;
    
    @Before
    public void setUp() {
        multiplicador = new Multiplicador();
    }
    
    @Test
    public void esperoQueQuandoPassar20Eh2Retorne40() {
        Integer retorno = multiplicador.multiplicarDoisNumeros(20, 2);
        Integer esperado = 40;
        
        assertEquals( esperado, retorno );
    }
    @Test
    public void esperoQueQuandoPassar8Eh2Retorne8() {
        Integer retorno = multiplicador.multiplicarDoisNumerosRetornoPar(8, 2);
        Integer esperado = 8;
        
        assertEquals(esperado, retorno );

    }
}