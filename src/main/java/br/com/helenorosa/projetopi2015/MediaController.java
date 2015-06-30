
package br.com.helenorosa.projetopi2015;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MediaController {
    private Media media;
    
    public MediaController(){
     media = new Media();
    }
    
     @RequestMapping( "/media" )
    public String paginaIndex() {
        return "media";
    }
    
     @RequestMapping( value = "/media", method = RequestMethod.POST )
    public String dividir(
            @RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2,
            @RequestParam(
            value="numero3", required=true) Integer numero3,
            Model model) {
        
        Integer resultado = media.somarTresNumerosDividirPorTres(numero1, numero2, numero3 );
        
        model.addAttribute("resultado", resultado);
        
        return "media";
    }
    
}
