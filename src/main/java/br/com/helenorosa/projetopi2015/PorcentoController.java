package br.com.helenorosa.projetopi2015;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PorcentoController {
    private Porcento porcento;
    
    public PorcentoController() {
        porcento = new Porcento();
    }
    
    @RequestMapping( "/porcento" )
    public String paginaIndex() {
        return "porcento";
    }
    
    @RequestMapping( value = "/porcento", method = RequestMethod.POST )
    public String somar(
            @RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2,
            Model model) {
        
        Integer resultado = porcento.porcentagemUmNumero(numero1, numero2 );
        
        model.addAttribute("resultado", resultado);
        
        return "porcento";
    }
}
