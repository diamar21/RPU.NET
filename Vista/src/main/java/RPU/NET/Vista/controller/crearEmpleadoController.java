package RPU.NET.Vista.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class crearEmpleadoController {

    @GetMapping("/crearEmpleado")
    public String crearEmpleado(){
        return "crearEmpleado";

    }
}
