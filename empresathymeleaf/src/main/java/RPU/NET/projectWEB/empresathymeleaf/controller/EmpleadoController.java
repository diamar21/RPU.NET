package RPU.NET.projectWEB.empresathymeleaf.controller;

import RPU.NET.projectWEB.empresathymeleaf.entity.Empleado;
import RPU.NET.projectWEB.empresathymeleaf.service.IEmpleadoService;
import RPU.NET.projectWEB.empresathymeleaf.service.IEmpresaService;
import RPU.NET.projectWEB.empresathymeleaf.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class EmpleadoController {

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IEmpresaService empresaServiceService;

    @Autowired
    private IMovimientoDineroService movimientoDineroService;

    private final Logger LOG= Logger.getLogger(""+EmpleadoController.class);

    @GetMapping("/empleado/{id}")
    public Empleado findById(@PathVariable long id){

        return empleadoService.findById(id);
    }

    @GetMapping("/empleado")
    public List<Empleado> findByAll(){
        return empleadoService.findByAll();}

    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return empleadoService.createEmpleado(empleado);
    }

    @PutMapping("/empleado")
    public Empleado updateEmpleado(@RequestBody Empleado empleado){
        return empleadoService.updateEmpleado(empleado);
    }

    @PatchMapping("/empleado/{id}")
    public Empleado updateIdEmpleado(@PathVariable long id, @RequestBody Empleado empleado) {
        return empleadoService.updateIdEmpleado(id, empleado);
    }
    @GetMapping("/empleado/empresa/{id}")
    public List<Empleado> getEmpresaById(@PathVariable  long id) {   // se agrega @PathVariable para que se pueda ingresar la variable id en @getmapping
        return empleadoService.getEmpresaById(id);
    }


    @DeleteMapping("/empleado/{id}")
    public void deleteEmpleado(@PathVariable long id) {


        empleadoService.deleteEmpleado((long) id);

    }

}
