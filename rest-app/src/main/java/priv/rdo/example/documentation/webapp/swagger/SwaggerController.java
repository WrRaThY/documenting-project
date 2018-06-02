package priv.rdo.example.documentation.webapp.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class SwaggerController {
    @GetMapping(value = "/documentation")
    String index(){
        return "redirect:swagger-ui.html";
    }
}
