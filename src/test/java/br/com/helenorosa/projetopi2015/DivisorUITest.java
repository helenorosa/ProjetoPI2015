package br.com.helenorosa.projetopi2015;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 *
 * @author HELENOROSA
 */
public class DivisorUITest {
    private HtmlUnitDriver driver;
    
    @Before
    public void setUp() {
        driver = new HtmlUnitDriver();
    }
    
    @Test
    public void testarSeORaioDe10Sera314() {
        driver.get( "http://localhost:8080/dividir" );
        driver.findElement(By.name("numero1")).sendKeys( "10" );
        driver.findElement(By.name("numero2")).sendKeys( "2" );
        driver.findElement(By.name("dividir")).click();
        
        String retorno = driver.findElement(By.id("resultado")).getText();
        String esperado = "Resultado: 5";
        
        assertEquals( esperado, retorno );
    }
}
