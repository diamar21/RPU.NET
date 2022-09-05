package RPU.NET.project.empresa.controller;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.Empresa;
import RPU.NET.project.empresa.entity.MovimientoDinero;
import RPU.NET.project.empresa.entity.Rol;
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
    private IMovimientoDineroService movimientoDineroServiceService;
    @GetMapping("/movimientodinero/{id}") // llama el metodo get dentro de la ruta /api/movimientodinero/{id}
    // se agrega @PathVariable para que se pueda ingresar la variable id en @getmapping
    public MovimientoDinero findById(@PathVariable long id) {

        return movimientoDineroServiceService.findById(id);
    }

    @GetMapping("/movimientodinero") // llama el metodo get dentro de la ruta /api/rol
    public List<MovimientoDinero> findByAll() {   // se agrega @PathVariable para que se pueda ingresar la variable id en @getmapping
       return movimientoDineroServiceService.findByAll();
    }

    @PostMapping("/movimientodinero")   //crea un nuevo rol con el id =3
    public MovimientoDinero createMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero) {
       return movimientoDineroServiceService.createMovimientoDinero(movimientoDinero);

    }

    //@PutMapping("/movimientodinero/{id}")
   @PatchMapping("/movimientodinero/{id}")
    public MovimientoDinero updateMovimientoDinero(@PathVariable long id, @RequestBody MovimientoDinero movimientoDinero) {
        // solo funciona en sprint boot
        //MovimientoDinero updateMovimientoDinero =MovimientoDineroRepository.save(movimientoDinero);  // el save solo funciona en spring boot
        //return updateMovimientoDinero;

      return movimientoDineroServiceService.updateMovimientoDinero(id,movimientoDinero);
    }
    @DeleteMapping("/movimientodinero/{id}")
    public void deletemovimientoDinero(@PathVariable long id) {

       // UsuarioRepository.deleteById((long) id);
        movimientoDineroServiceService.deletemovimientoDinero(id);

    }

}
