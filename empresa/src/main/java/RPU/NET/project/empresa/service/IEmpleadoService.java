package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.MovimientoDinero;

import java.util.List;

public interface IEmpleadoService {
    public Empleado findById(long id);
    public List<Empleado> findByAll();
    public Empleado createEmpleado(Empleado empleado);
    public Empleado updateEmpleado(Empleado empleado);
    public void deleteEmpleado(long id);
    public List<Empleado> getEmpresaById(long id);

    public Empleado updateIdEempleado(long id, Empleado empleado);



    }
