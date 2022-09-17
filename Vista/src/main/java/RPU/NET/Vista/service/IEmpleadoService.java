package RPU.NET.Vista.service;

import RPU.NET.Vista.entity.Empleado;


import java.util.List;

public interface IEmpleadoService {
    public Empleado findById(long id);
    public List<Empleado> findByAll();
    public Empleado createEmpleado(Empleado empleado);
    public Empleado updateEmpleado(Empleado empleado);
    public void deleteEmpleado(long id);
    public List<Empleado> getEmpresaById(long id);

    public Empleado updateIdEmpleado(long id, Empleado empleado);



    }
