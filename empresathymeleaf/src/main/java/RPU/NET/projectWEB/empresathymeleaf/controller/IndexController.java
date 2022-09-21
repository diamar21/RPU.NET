package RPU.NET.projectWEB.empresathymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexController {

    private final Logger LOG= Logger.getLogger(""+IndexController.class); // final clase especial para colocar los logger y permite inicializar

    // solo maneja 2 tipos de solitudes GET POST en una pagina web
    @GetMapping("/")
    public String Index (Model model, Object attributeName){

        LOG.log(Level.INFO,"Index"); // se usan para buscar errores CADA CONTROLADOR DEBE TENER SU LOG
        var mensaje ="BIENVENIDO AL SISTEMA DE GESTION INGRESO-EGRESO"; //solo funciona en un jdk 11 o superior
        model.addAttribute("mensaje",mensaje);
        return "Index";  // es el mismo nombre del archivo Index.html

    }


}
