package RPU.NET.Vista.controller;
import RPU.NET.Vista.entity.Empleado;
import RPU.NET.Vista.entity.Empresa;
import RPU.NET.Vista.entity.MovimientoDinero;
import RPU.NET.Vista.service.IEmpleadoService;
import RPU.NET.Vista.service.IEmpresaService;
import RPU.NET.Vista.service.IMovimientoDineroService;
import RPU.NET.Vista.service.MovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class MovimientoDineroController {
    @Autowired
    private IMovimientoDineroService movimientoDineroService;
    @Autowired
    private IEmpresaService empresaService;

    @Autowired
    private IEmpleadoService empleadoService;

    private final Logger LOG = Logger.getLogger(""+ EmpleadoController.class);


    //Listar MVD
    @GetMapping("MovimientoDinero/list")
    public String getListMovimientoDinero(Model model){
        LOG.log(Level.INFO,"getListMovimientoDinero");
        List<MovimientoDinero> movimientoDineros = movimientoDineroService.findByAll();
        for (MovimientoDinero user : movimientoDineros)
            System.out.println(user.toString());
        model.addAttribute("movimientoDineros", movimientoDineros);

        return "movimientoslist";
    }

    @RequestMapping(value="/empresa/{id}", method = RequestMethod.GET)
    public String MovimientosEmpresa(@PathVariable ("id") long id, Model model){
        LOG.log(Level.INFO,"MovimientoDineroEmpresa");
        List<List<MovimientoDinero>> movimientoDineros1=movimientoDineroService.findByIdmovimiento(id);

        for(List<MovimientoDinero> mov: movimientoDineros1){
           System.out.println(mov.toString());
           model.addAttribute("movimientosDineros1", mov);

        }

        return "movimientosempresa";
    }


    //Crear MVD
    @RequestMapping(value = "/crear/{id}", method = RequestMethod.GET)
    public String createMovimientoDinero(@PathVariable ("id") long id, Model modelo){
        LOG.log(Level.INFO,"createMovimientoDinero");

        List<MovimientoDinero> movimientoDineros= movimientoDineroService.getEmpleadoById(id);
        modelo.addAttribute("movimientoDinero", movimientoDineros);
        return "crearMovimientoDinero";
    }
    //Guardar MVD
    //Crear MVD
    @GetMapping("movimientoDinero/crear")
    public String createMovimientoDinero(Model modelo){
        LOG.log(Level.INFO,"createMovimientoDinero");
        MovimientoDinero movimientoDinero = new MovimientoDinero();
        modelo.addAttribute("movimientoDinero", movimientoDinero);
        List<MovimientoDinero> movimientoDineros= movimientoDineroService.findByAll();
        LOG.log(Level.INFO,"getListEmpleado");
        List<Empleado> empleados = empleadoService.findByAll();
        for (Empleado user : empleados)
            System.out.println(user.toString());
        modelo.addAttribute("empleados", empleados);
        return "crearMovimientoDinero";
    }
    //Guardar MVD
    @PostMapping("MovimientoDinero/guardar")
    public String guardarMovimiento(@Valid MovimientoDinero movimientoDinero, BindingResult error, Model modelo){
        LOG.log(Level.INFO,"guardarMovimiento");
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            return "movimientoslist";
        }
        movimientoDinero = movimientoDineroService.createMovimientoDinero(movimientoDinero);
        return "Success";
    }

    //Borrar MVD
    @RequestMapping(value = "MovimientoDinero/eliminar/{id}", method = RequestMethod.GET)
    public String deleteMovimientoDinero(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deleteMovimientoDinero");
        movimientoDineroService.deletemovimientoDinero(id);
        return "MovimientoDinero/listar";
    }

}

