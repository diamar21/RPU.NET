package RPU.NET.projectWEB.empresathymeleaf.controller;

import RPU.NET.projectWEB.empresathymeleaf.entity.MovimientoDinero;
import RPU.NET.projectWEB.empresathymeleaf.service.IEmpleadoService;
import RPU.NET.projectWEB.empresathymeleaf.service.IEmpresaService;
import RPU.NET.projectWEB.empresathymeleaf.service.IMovimientoDineroService;
import RPU.NET.projectWEB.empresathymeleaf.service.MovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller     // api rest
public class MovimientoDineroController {
    @Autowired
    private IMovimientoDineroService movimientoDineroService;
    @Autowired
    private IEmpresaService empresaService;

    @Autowired
    private IEmpleadoService empleadoService;
    private final Logger LOG= Logger.getLogger(""+MovimientoDineroController.class);
    @GetMapping("/movimientos/list")
    public String getListMovimientos (Model model,@PathVariable ("id") long id) {

        LOG.log(Level.INFO, "getListMovimientos"); // se usan para buscar errores CADA CONTROLADOR DEBE TENER SU LOG
        List<List<MovimientoDinero>> movimientosDinero = movimientoDineroService.findByIdmovimiento(id);
        model.addAttribute("movimientosDinero", movimientosDinero);

        return "movimientos/list";
    }


    @GetMapping("/movimiento/{id}") // llama el metodo get dentro de la ruta /api/movimientodinero/{id}
    // se agrega @PathVariable para que se pueda ingresar la variable id en @getmapping
    public MovimientoDinero findById(@PathVariable long id) {

        return movimientoDineroService.findById(id);
    }

    @GetMapping("/movimiento") // llama el metodo get dentro de la ruta /api/rol
    public List<MovimientoDinero> findByAll() {   // se agrega @PathVariable para que se pueda ingresar la variable id en @getmapping
       return movimientoDineroService.findByAll();
    }

    @GetMapping("/movimiento/empleado/{id}") // llama el metodo get dentro de la ruta /api/rol
    public List<MovimientoDinero> getEmpleadoById(@PathVariable  long id) {   // se agrega @PathVariable para que se pueda ingresar la variable id en @getmapping

        return movimientoDineroService.getEmpleadoById(id);
    }


    @PostMapping("/movimiento")   //crea un nuevo rol con el id =3
    public MovimientoDinero createMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero) {
       return movimientoDineroService.createMovimientoDinero(movimientoDinero);

    }

    //@PutMapping("/movimientodinero/{id}")
   @PatchMapping("/movimiento")
    public MovimientoDinero updateMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero) {


      return movimientoDineroService.updateMovimientoDinero(movimientoDinero);
    }
    @DeleteMapping("/movimiento/{id}")
    public void deletemovimientoDinero(@PathVariable long id) {

        movimientoDineroService.deletemovimientoDinero(id);

    }
    @GetMapping("/empresa/{id}/movimiento")
    public List<List<MovimientoDinero>> findByIdmovimiento(@PathVariable long id) {
        return movimientoDineroService.findByIdmovimiento(id);

    }


    @DeleteMapping("/empresa/{id}/movimiento")
    public void deletemovimientoDineroEmpresa(@PathVariable long id) {
            movimientoDineroService.deletemovimientoDineroEmpresa(id);

    }

}
