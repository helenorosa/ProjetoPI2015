package br.com.helenorosa.projetopi2015;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {
  
    
    @RequestMapping( "/" )
    public String paginaIndex() {
        return "index";
    }
    
   
}
