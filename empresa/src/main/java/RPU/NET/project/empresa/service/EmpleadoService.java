package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.MovimientoDinero;

import java.util.List;

public class EmpleadoService implements IEmpleadoService{

    @Override
    public Empleado findById(long id) {
        return null;
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
