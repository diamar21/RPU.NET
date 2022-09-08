package RPU.NET.project.empresa.controller;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController     // api rest
@RequestMapping("/api")
public class EmpleadoRestController {

    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleado/{id_empleado}")
    public Empleado findById(@PathVariable long id_empleado){

        return empleadoService.findById(id_empleado);
    }

    @GetMapping("/empleado")
    public List<Empleado> findByAll(){
        return empleadoService.findByAll();}

    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return empleadoService.createEmpleado(empleado);
    }

    @PutMapping("/empleado/{id}")
    public Empleado updateEmpleado(@PathVariable long id, @RequestBody Empleado empleado){
        return empleadoService.updateEmpleado(id,empleado);
    }
    @DeleteMapping("/empleado/{id}")
    public void deleteEmpleado(@PathVariable long id) {

        // UsuarioRepository.deleteById((long) id);
        empleadoService.deleteEmpleado((long) id);

    }

}
