package RPU.NET.project.empresa.controller;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller     // api rest
public class EmpleadoController {

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
