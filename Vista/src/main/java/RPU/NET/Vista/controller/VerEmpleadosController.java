package RPU.NET.Vista.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class VerEmpleadosController {

    @GetMapping("/verEmpleados")
    public String verEmpleados(){
        return "VerEmpelados";

    }
}
