
package br.com.helenorosa.projetopi2015;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DivisorController {
    private Divisor divisor;
    
    public DivisorController(){
     divisor = new Divisor();
    }
    
     @RequestMapping( "/dividir" )
    public String paginaIndex() {
        return "dividir";
    }
    
     @RequestMapping( value = "/dividir", method = RequestMethod.POST )
    public String dividir(
            @RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2,
            Model model) {
        
        Integer resultado = divisor.dividirDoisNumeros( numero1, numero2 );
        
        model.addAttribute("resultado", resultado);
        
        return "dividir";
    }
    
}
