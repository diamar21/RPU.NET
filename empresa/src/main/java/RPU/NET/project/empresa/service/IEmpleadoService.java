package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.MovimientoDinero;

import java.util.List;

public interface IEmpleadoService {
    public Empleado findById(long id);
    public List<Empleado> findByAll();
    public Empleado createEmpleado(Empleado empleado);
    public Empleado updateEmpleado(long id, Empleado empleado);
    public void deleteEmpleado(long id);


    }
