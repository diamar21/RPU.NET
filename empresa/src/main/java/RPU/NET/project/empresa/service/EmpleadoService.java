package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.Empresa;
import RPU.NET.project.empresa.entity.MovimientoDinero;
import RPU.NET.project.empresa.entity.Rol;
import RPU.NET.project.empresa.repository.IMovimientodineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService{

    @Override
    public Empleado findById(long id) {

        Empleado empleado = new Empleado();

        return empleado;

    }

    @Override
    public List<Empleado> findByAll() {
        return null;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        return null;
    }

    @Override
    public Empleado updateEmpleado(long id, Empleado empleado) {
        return null;
    }

    @Override

    public void deleteEmpleado(long id) {
        Empleado deleteEmpleado = findById((long) id);
    }

}
