package br.com.helenorosa.projetopi2015;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiplicadorController {
    private Multiplicador multiplicador;
    
    public MultiplicadorController() {
        multiplicador = new Multiplicador();
    }
    
    @RequestMapping( "/multiplica" )
    public String paginaIndex() {
        return "multiplica";
    }
    
    @RequestMapping( value = "/multiplica", method = RequestMethod.POST )
    public String somar(
            @RequestParam(
            value="numero1", required=true) Integer numero1,
            @RequestParam(
            value="numero2", required=true) Integer numero2,
            Model model) {
        
        Integer resultado = multiplicador.multiplicarDoisNumeros(numero1, numero2 );
        
        model.addAttribute("resultado", resultado);
        
        return "multiplica";
    }
}
