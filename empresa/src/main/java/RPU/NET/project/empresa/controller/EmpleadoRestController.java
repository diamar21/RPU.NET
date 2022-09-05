package RPU.NET.project.empresa.controller;

import RPU.NET.project.empresa.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmpleadoRestController {

    @Autowired
    private Empleado empleado;

    @GetMapping("/empleado/{id_empleado}")
    public Empleado findById(@PathVariable int id_empleado){
        return empleado.findById(id_empleado);
    }

    @GetMapping("/empleado")
    public List<Empleado> findById(){
        return this.empleado.findById();
    }

    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return this.empleado.createEmpleado(empleado);
    }

    @PutMapping("/empleado")
    public Empleado updateEmpleado(@RequestBody Empleado empleado){
        return this.empleado.updateEmpleado(empleado);
    }

}
