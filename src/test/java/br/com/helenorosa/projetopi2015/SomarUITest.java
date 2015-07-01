package br.com.helenorosa.projetopi2015;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class SomarUITest {
    private HtmlUnitDriver driver;
    
    @Before
    public void setUp() {
        driver = new HtmlUnitDriver();
    }
    
    @Test
    public void testarSomaDoisNumeros() {
        driver.get( "http://localhost:8080/somar" );
        driver.findElement(By.name("numero1")).sendKeys( "5" );
        driver.findElement(By.name("numero2")).sendKeys( "5" );
        driver.findElement(By.name("somar")).click();
        
        String retorno = driver.findElement(By.id("resultado")).getText();
        String esperado = "Resultado: 10";
        
        assertEquals( esperado, retorno );
    }
}
