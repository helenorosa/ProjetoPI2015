package br.com.helenorosa.projetopi2015;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
  
    
    @RequestMapping( "/" )
    public String paginaIndex() {
        return "index";
    }
    
}
