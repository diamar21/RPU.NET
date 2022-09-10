package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.Empresa;
import RPU.NET.project.empresa.entity.MovimientoDinero;
import RPU.NET.project.empresa.entity.Rol;
import RPU.NET.project.empresa.repository.IEmpleadoRepository;
import RPU.NET.project.empresa.repository.IMovimientodineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService{
@Autowired
private IEmpleadoRepository empleadoRepository;


    @Override
    public Empleado findById(long id) {

        Optional<Empleado> empleado = empleadoRepository.findById((long) id);
        return empleado.get();
    }


    @Override
    public List<Empleado> findByAll() {
        List<Empleado> empleados= (List<Empleado>) empleadoRepository.findAll();
        return empleados;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        Empleado newempleado=empleadoRepository.save(empleado);
        return newempleado;
    }

    @Override
    public Empleado updateEmpleado(Empleado empleado) {
        Empleado updateempleado=empleadoRepository.save(empleado);
        return updateempleado;
    }

    @Override

    public void deleteEmpleado(long id) {

        empleadoRepository.deleteById((long) id);
    }

}
 /*   Empleado empleado = new Empleado();
        empleado.setIdEmpleado(id);
        empleado.setCorreo("jairo@hotmail.com"); //ingresar efectivo : ingresar cheque : ingresar transferencia: Realizar pago: ingreso dinero :
        empleado.setNombreEmpleado("Jairo Useche");

        Empresa empresa =new Empresa();
        empresa.setNombreEmpresa("RENAULT");
        empresa.setDireccionEmpresa("Calle 93 #13-21");
        empresa.setIdEmpresa(1);
        empresa.setNITEmpresa("900221598-5");
        empresa.setTelefonoEmpresa("2356098");

        empleado.setNombreEmpresa(empresa.getNombreEmpresa());
        Rol rol1 = Rol.operativo;
        empleado.setRol(rol1);


        List <MovimientoDinero> movimientoDineros = new ArrayList<>();
        MovimientoDinero movimientoDinero1 = new MovimientoDinero();
        movimientoDinero1.setIdmovimientodinero(3);
        movimientoDinero1.setEmpresa(empresa);
        movimientoDinero1.setUpdatedAt(LocalDate.now());
        movimientoDinero1.setConceptomovimiento("Ingreso");
        movimientoDinero1.setMontodelmovimiento(55000);
        movimientoDinero1.setCreatedAt(LocalDate.now());
        movimientoDineros.add(movimientoDinero1);

        MovimientoDinero movimientoDinero2 = new MovimientoDinero();
        movimientoDinero2.setIdmovimientodinero(4);
        movimientoDinero2.setEmpresa(empresa);
        movimientoDinero2.setUpdatedAt(LocalDate.now());
        movimientoDinero2.setConceptomovimiento("Ingreso");
        movimientoDinero2.setMontodelmovimiento(600000);
        movimientoDinero2.setCreatedAt(LocalDate.now());
        movimientoDineros.add(movimientoDinero2);

        MovimientoDinero movimientoDinero3 = new MovimientoDinero();
        movimientoDinero3.setIdmovimientodinero(5);
        movimientoDinero3.setEmpresa(empresa);
        movimientoDinero3.setUpdatedAt(LocalDate.now());
        movimientoDinero3.setConceptomovimiento("Egreso");
        movimientoDinero3.setMontodelmovimiento(-28000);
        movimientoDinero3.setCreatedAt(LocalDate.now());
        movimientoDineros.add(movimientoDinero3);

        empleado.setMovimientoDinero(movimientoDineros); */