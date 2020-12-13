package odko.nanjid.thymeleaflayoutincludestyle1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/user")
    public String user(){ return "user"; }
}
