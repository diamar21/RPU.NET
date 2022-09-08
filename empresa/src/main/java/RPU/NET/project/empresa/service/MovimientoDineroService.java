package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.Empresa;
import RPU.NET.project.empresa.entity.MovimientoDinero;
import RPU.NET.project.empresa.entity.Rol;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class MovimientoDineroService implements IMovimientoDineroService{
    @Override
    public MovimientoDinero findById(long id) {
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
        movimientoDinero.setEmpresa(empresa);

        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(1);
        empleado.setNombreEmpleado("Camilo Galvis");
        empleado.setNombreEmpresa(empresa.getNombreEmpresa());
        empleado.setCorreo("cam@gmail.com");
        Rol rol = Rol.administrador;
        empleado.setRol(rol);

        movimientoDinero.setEmpleado(empleado);
        movimientoDinero.setEmpresa(empresa);
        return movimientoDinero;
    }

    @Override
    public List<MovimientoDinero> findByAll() {
        List<MovimientoDinero> movimientoDineros = new ArrayList<>();
        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("Truora");
        empresa.setDireccionEmpresa("Calle 93 #13-21");
        empresa.setIdEmpresa(1);
        empresa.setNITEmpresa("900221598-5");
        empresa.setTelefonoEmpresa("2356098");
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(1);
        empleado.setNombreEmpleado("Camilo Galvis");
        empleado.setNombreEmpresa(empresa.getNombreEmpresa());
        empleado.setCorreo("cam@gmail.com");
        Rol rol = Rol.administrador;
        empleado.setRol(rol);
        MovimientoDinero movimientoDinero1 = new MovimientoDinero();
        movimientoDinero1.setIdmovimientodinero(1);
        movimientoDinero1.setConceptomovimiento("Ingreso"); //ingresar efectivo : ingresar cheque : ingresar transferencia: Realizar pago: ingreso dinero :
        movimientoDinero1.setMontodelmovimiento(125000);
        movimientoDinero1.setCreatedAt(LocalDate.now());
        movimientoDinero1.setUpdatedAt(LocalDate.now());
        movimientoDinero1.setEmpresa(empresa);
        movimientoDinero1.setEmpleado(empleado);
        movimientoDineros.add(movimientoDinero1);

        MovimientoDinero movimientoDinero2 = new MovimientoDinero();
        Empresa empresa1 = new Empresa();
        empresa1.setNombreEmpresa("Google");
        empresa1.setDireccionEmpresa("Calle 100 #7-28");
        empresa1.setIdEmpresa(2);
        empresa1.setNITEmpresa("901425800-1");
        empresa1.setTelefonoEmpresa("3131021");


        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        empleado1.setNombreEmpleado("Jorge Fuentes");
        empleado1.setNombreEmpresa(empresa1.getNombreEmpresa());
        empleado1.setCorreo("jor@gmail.com");
        Rol rol1 = Rol.operativo;
        empleado1.setRol(rol1);

        movimientoDinero2.setIdmovimientodinero(2);
        movimientoDinero2.setConceptomovimiento("Egreso"); //ingresar efectivo : ingresar cheque : ingresar transferencia: Realizar pago: ingreso dinero :
        movimientoDinero2.setMontodelmovimiento(-56000);
        movimientoDinero2.setCreatedAt(LocalDate.now());
        movimientoDinero2.setUpdatedAt(LocalDate.now());
        movimientoDinero2.setEmpresa(empresa1);
        movimientoDinero2.setEmpleado(empleado);
        movimientoDineros.add(movimientoDinero2);
        return movimientoDineros;
    }

    @Override
    public MovimientoDinero createMovimientoDinero(MovimientoDinero movimientoDinero) {
        MovimientoDinero newmovimientodinero = new MovimientoDinero();
        newmovimientodinero.setMontodelmovimiento(movimientoDinero.getMontodelmovimiento());
        newmovimientodinero.setConceptomovimiento(movimientoDinero.getConceptomovimiento());
        newmovimientodinero.setCreatedAt(movimientoDinero.getCreatedAt());
        newmovimientodinero.setEmpleado(movimientoDinero.getEmpleado());
        newmovimientodinero.setEmpresa(movimientoDinero.getEmpresa());
        return newmovimientodinero;
    }

    @Override
    public MovimientoDinero updateMovimientoDinero(long id, MovimientoDinero movimientoDinero) {
        MovimientoDinero updateMovimientoDinero = findById(id);
        updateMovimientoDinero.setMontodelmovimiento(movimientoDinero.getMontodelmovimiento());
        updateMovimientoDinero.setConceptomovimiento(movimientoDinero.getConceptomovimiento());
        updateMovimientoDinero.setUpdatedAt(movimientoDinero.getUpdatedAt());
        updateMovimientoDinero.setEmpleado(movimientoDinero.getEmpleado());
        updateMovimientoDinero.setEmpresa(movimientoDinero.getEmpresa());
        return updateMovimientoDinero;
    }

    @Override
    public void deletemovimientoDinero(long id) {
        MovimientoDinero deletemovimientoDinero = findById((long) id);
    }
}
