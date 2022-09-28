package RPU.NET.Vista.controller;
import RPU.NET.Vista.entity.Empleado;
import RPU.NET.Vista.entity.Empresa;
import RPU.NET.Vista.entity.MovimientoDinero;
import RPU.NET.Vista.service.IEmpleadoService;
import RPU.NET.Vista.service.IEmpresaService;
import RPU.NET.Vista.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
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
    //Crear MVD
    @GetMapping("movimientoDinero/crear")
    public String createMovimientoDinero(Model modelo){
        LOG.log(Level.INFO,"createMovimientoDinero");
        //Monto + Concepto
        MovimientoDinero movimientoDinero = new MovimientoDinero();
        List<MovimientoDinero> movimientoDineros= movimientoDineroService.findByAll();
        modelo.addAttribute("movimientoDinero", movimientoDinero);
        LOG.log(Level.INFO,"getListEmpleado");
        List<Empleado> empleados = empleadoService.findByAll();
        for (Empleado user : empleados)
            System.out.println(user.toString());
        modelo.addAttribute("empleados", empleados);
        LOG.log(Level.INFO,"getListEmpresa");
        List<Empresa> empresas = empresaService.findAll();
        for (Empresa user : empresas)
            System.out.println(user.toString());
        modelo.addAttribute("empresas", empresas);
        return "movimientoCrear";
    }
    //Guardar MVD
    @PostMapping("MovimientoDinero/guardar")
    public String guardarMovimientoDinero(@Valid MovimientoDinero movimientoDinero, BindingResult error, Model modelo){
        LOG.log(Level.INFO,"guardarMovimientoDinero");
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            return "MovimientoDinero/modificar";
        }
        movimientoDinero=movimientoDineroService.createMovimientoDinero(movimientoDinero);
        return "MovimientoDinero/list";
    }
    //Editar MVD
    @RequestMapping(value = "MovimientoDinero/editarMovimientoDinero/{id}", method = RequestMethod.GET)
    public String editMovimientoDinero(@PathVariable("id") long id, Model modelo){
        LOG.log(Level.INFO,"editMovimientoDinero");
        MovimientoDinero movimientoDinero= movimientoDineroService.findById(id);
        modelo.addAttribute("movimientoDinero", movimientoDinero);
        List<Empresa> empresa=empresaService.findAll();
        modelo.addAttribute("empresa",empresa);
        return "MovimientoDinero/modificar";
    }
    //Borrar MVD
    @RequestMapping(value = "MovimientoDinero/eliminar/{id}", method = RequestMethod.GET)
    public String deleteMovimientoDinero(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deleteMovimientoDinero");
        movimientoDineroService.deletemovimientoDinero(id);
        return "MovimientoDinero/listar";
    }

}


