package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class PorcentoTest {
    
       private Porcento porcento;
    
    @Before
    public void setUp() {
       porcento = new Porcento();
    }
    
    @Test
    public void esperoQueQuandoPassar100E20retorne20() {
        Integer retorno = porcento.porcentagemUmNumero(100, 20);
        Integer esperado = 20;
        
        assertEquals( esperado, retorno );
    }
        
     
}
