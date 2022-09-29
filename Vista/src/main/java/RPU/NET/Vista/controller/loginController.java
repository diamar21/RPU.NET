package RPU.NET.Vista.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class loginController {


    @GetMapping("/")
    public String Login(){
        return "Login";

    }
}
