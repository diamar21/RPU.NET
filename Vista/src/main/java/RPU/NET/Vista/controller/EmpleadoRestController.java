package RPU.NET.Vista.controller;

import RPU.NET.Vista.entity.Empleado;
import RPU.NET.Vista.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController     // api rest
@RequestMapping("/api")
public class EmpleadoRestController {

    @Autowired
    private IEmpleadoService empleadoService;

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
