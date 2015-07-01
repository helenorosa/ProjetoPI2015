/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.helenorosa.projetopi2015;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author HELENOROSA
 */
public class IndexControllerTest {
    private IndexController indexController;
      
    @Before
    public void setUp() {
       indexController = new IndexController();
    }
    
    @Test
    public void esperoRetornoDaPaginaIndex() {
        String retorno = indexController.paginaIndex();     
        assertEquals(retorno, "index");
        
    }
    
}
