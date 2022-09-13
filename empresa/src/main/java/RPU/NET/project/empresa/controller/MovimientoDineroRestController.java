package RPU.NET.project.empresa.controller;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.Empresa;
import RPU.NET.project.empresa.entity.MovimientoDinero;
import RPU.NET.project.empresa.entity.Rol;
import RPU.NET.project.empresa.service.IEmpleadoService;
import RPU.NET.project.empresa.service.IEmpresaService;
import RPU.NET.project.empresa.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController     // api rest
@RequestMapping("/api")   // solicitud una ruta
public class MovimientoDineroRestController {
    @Autowired
    private IMovimientoDineroService movimientoDineroService;
    @Autowired
    private IEmpresaService empresaService;

    @Autowired
    private IEmpleadoService empleadoService;


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
    public List<List<MovimientoDinero>> findByIdmovimiento(@PathVariable long id){
        List<List<MovimientoDinero>> movimientos2 =new ArrayList<>();
        List<Empleado> empleados=empleadoService.getEmpresaById(id);
        Empleado empleado = new Empleado();
        for (int x=0; x<empleados.size(); x++){
            empleado=empleados.get(x);
            int newid= (int) empleado.getIdEmpleado();
            List<MovimientoDinero> movimientos =movimientoDineroService.getEmpleadoById(newid);
            movimientos2.add(movimientos);
        }
        return movimientos2;
    }

    @DeleteMapping("/empresa/{id}/movimiento")
    public void deletemovimientoDineroEmpresa(@PathVariable long id) {
        List<Empleado> empleados=empleadoService.getEmpresaById(id);
        for (int x=0; x<empleados.size(); x++) {
            Empleado empleado = new Empleado();
            empleado = empleados.get(x);
            int newid = (int) empleado.getIdEmpleado();

            movimientoDineroService.deletemovimientoDinero(newid);
        }
    }

}
