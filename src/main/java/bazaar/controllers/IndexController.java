package bazaar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by Java Developer Zone on 19-07-2017.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "Spring Boot Example";
    }
}

