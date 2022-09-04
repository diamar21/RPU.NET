package RPU.NET.project.empresa.controller;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.Empresa;
import RPU.NET.project.empresa.entity.MovimientoDinero;
import RPU.NET.project.empresa.entity.Rol;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController     // api rest
@RequestMapping("/api")   // solicitud una ruta
public class MovimientoDineroRestController {

    @GetMapping("/movimientodinero/{id}") // llama el metodo get dentro de la ruta /api/rol
    public MovimientoDinero findById(@PathVariable int id) {   // se agrega @PathVariable para que se pueda ingresar la variable id en @getmapping


        MovimientoDinero movimientoDinero = new MovimientoDinero();
        movimientoDinero.setIdmovimientodinero(id);
        movimientoDinero.setConceptomovimiento("Ingresar efectivo"); //ingresar efectivo : ingresar cheque : ingresar transferencia: Realizar pago: ingreso dinero :
        movimientoDinero.setMontodelmovimiento(125000);
        movimientoDinero.setCreatedAt(LocalDate.now());
        movimientoDinero.setUpdatedAt(LocalDate.now());

        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("Truora");
        empresa.setDireccionEmpresa("Calle 93 #13-21");
        empresa.setIdEmpresa(1);
        empresa.setNITEmpresa("900221598-5");
        empresa.setTelefonoEmpresa("2356098");
        movimientoDinero.setEnterprise(empresa);

        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(1);
        empleado.setNombreEmpleado("Camilo Galvis");
        empleado.setNombreEmpresa(empresa.getNombreEmpresa());
        empleado.setCorreo("cam@gmail.com");
        Rol rol = Rol.administrador;
        empleado.setRol(rol);

        movimientoDinero.setEmpleado(empleado);
        movimientoDinero.setEnterprise(empresa);
        return movimientoDinero;
    }

    @GetMapping("/movimientodinero") // llama el metodo get dentro de la ruta /api/rol
    public List<MovimientoDinero> findByAll() {   // se agrega @PathVariable para que se pueda ingresar la variable id en @getmapping
        List<MovimientoDinero> movimientoDineros = new ArrayList<>();


        MovimientoDinero movimientoDinero1 = new MovimientoDinero();
        movimientoDinero1.setIdmovimientodinero(1);
        movimientoDinero1.setConceptomovimiento("Ingresar efectivo"); //ingresar efectivo : ingresar cheque : ingresar transferencia: Realizar pago: ingreso dinero :
        movimientoDinero1.setMontodelmovimiento(125000);
        movimientoDinero1.setCreatedAt(LocalDate.now());
        movimientoDinero1.setUpdatedAt(LocalDate.now());

        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("Truora");
        empresa.setDireccionEmpresa("Calle 93 #13-21");
        empresa.setIdEmpresa(1);
        empresa.setNITEmpresa("900221598-5");
        empresa.setTelefonoEmpresa("2356098");
        movimientoDinero1.setEnterprise(empresa);

        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(1);
        empleado.setNombreEmpleado("Camilo Galvis");
        empleado.setNombreEmpresa(empresa.getNombreEmpresa());
        empleado.setCorreo("cam@gmail.com");
        Rol rol = Rol.administrador;
        empleado.setRol(rol);

        movimientoDinero1.setEmpleado(empleado);
        movimientoDineros.add(movimientoDinero1);

        MovimientoDinero movimientoDinero2 = new MovimientoDinero();
        movimientoDinero2.setIdmovimientodinero(2);
        movimientoDinero2.setConceptomovimiento("Egreso efectivo"); //ingresar efectivo : ingresar cheque : ingresar transferencia: Realizar pago: ingreso dinero :
        movimientoDinero2.setMontodelmovimiento(-56000);
        movimientoDinero2.setCreatedAt(LocalDate.now());
        movimientoDinero2.setUpdatedAt(LocalDate.now());

        Empresa empresa1 = new Empresa();
        empresa1.setNombreEmpresa("Google");
        empresa1.setDireccionEmpresa("Calle 100 #7-28");
        empresa1.setIdEmpresa(2);
        empresa1.setNITEmpresa("901425800-1");
        empresa1.setTelefonoEmpresa("3131021");
        movimientoDinero2.setEnterprise(empresa1);

        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        empleado1.setNombreEmpleado("Jorge Fuentes");
        empleado1.setNombreEmpresa(empresa1.getNombreEmpresa());
        empleado1.setCorreo("jor@gmail.com");
        Rol rol1 = Rol.operativo;
        empleado1.setRol(rol1);

        movimientoDinero2.setEmpleado(empleado1);
        movimientoDineros.add(movimientoDinero2);
        return movimientoDineros;
    }

    @PostMapping("/movimientodinero")   //crea un nuevo rol con el id =3
    public MovimientoDinero createMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero) {
        MovimientoDinero newmovimientodinero = new MovimientoDinero();
        newmovimientodinero.setMontodelmovimiento(movimientoDinero.getMontodelmovimiento());
        newmovimientodinero.setConceptomovimiento(movimientoDinero.getConceptomovimiento());
        newmovimientodinero.setCreatedAt(movimientoDinero.getCreatedAt());
        newmovimientodinero.setEmpleado(movimientoDinero.getEmpleado());
        newmovimientodinero.setEnterprise(movimientoDinero.getEnterprise());
        return newmovimientodinero;

    }

    //@PutMapping("/movimientodinero/{id}")
   @PatchMapping("/movimientodinero/{id}")
    public MovimientoDinero updateMovimientoDinero(@PathVariable int id, @RequestBody MovimientoDinero movimientoDinero) {
        // solo funciona en sprint boot
        //MovimientoDinero updateMovimientoDinero =MovimientoDineroRepository.save(movimientoDinero);  // el save solo funciona en spring boot
        //return updateMovimientoDinero;

        MovimientoDinero updateMovimientoDinero = findById(id);
        updateMovimientoDinero.setMontodelmovimiento(movimientoDinero.getMontodelmovimiento());
        updateMovimientoDinero.setConceptomovimiento(movimientoDinero.getConceptomovimiento());
        updateMovimientoDinero.setUpdatedAt(movimientoDinero.getUpdatedAt());
        updateMovimientoDinero.setEmpleado(movimientoDinero.getEmpleado());
        updateMovimientoDinero.setEnterprise(movimientoDinero.getEnterprise());
        return updateMovimientoDinero;
    }
    @DeleteMapping("/movimientodinero/{id}")
    public void deletemovimientoDinero(@PathVariable int id) {

       // UsuarioRepository.deleteById((long) id);
        MovimientoDinero deletemovimientoDinero = findById(id);
    }

}
