package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.Empresa;
import RPU.NET.project.empresa.entity.MovimientoDinero;
import RPU.NET.project.empresa.entity.Rol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpresaService implements IEmpresaService{
    private int id;

    @Override
    public Empresa findById(int id_empresa) {
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(1);
        empresa.setDireccionEmpresa("Calle 15 #95-11");
        empresa.setTelefonoEmpresa("8157536");
        empresa.setNITEmpresa("850235587-9");
        empresa.setNombreEmpresa("Postobón");
        return empresa;
    }

    @Override
    public List<Empresa> findByAll() {
        List<Empresa> empresas = new ArrayList<>();


        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        empleado1.setNombreEmpleado("Pedro el escamoso");
        empleado1.setNombreEmpresa(empleado1.getNombreEmpresa());
        empleado1.setCorreo("pec@gmail.com");
        Rol rol1 = Rol.administrador;
        empleado1.setRol(rol1);

        MovimientoDinero movimientoDinero1 = new MovimientoDinero();
        movimientoDinero1.setIdmovimientodinero(1);
        movimientoDinero1.setConceptomovimiento("Ingresar efectivo");
        movimientoDinero1.setMontodelmovimiento(1250000);
        movimientoDinero1.setCreatedAt(LocalDate.now());
        movimientoDinero1.setUpdatedAt(LocalDate.now());

        Empresa empresa1 = new Empresa();
        empresa1.setNombreEmpresa("Postobón");
        empresa1.setDireccionEmpresa("Calle 15 #95-11");
        empresa1.setIdEmpresa(1);
        empresa1.setNITEmpresa("850235587-9");
        empresa1.setTelefonoEmpresa("8157536");
        empresa1.setMovimientoDinero(movimientoDinero1);
        empresa1.setEmpleado(empleado1);
        empresas.add(empresa1);


        Empleado empleado2 = new Empleado();
        empleado2.setIdEmpleado(1);
        empleado2.setNombreEmpleado("Martina la peligrosa");
        empleado2.setNombreEmpresa(empleado1.getNombreEmpresa());
        empleado2.setCorreo("Mlp@gmail.com");
        Rol rol2 = Rol.operativo;
        empleado2.setRol(rol2);


        MovimientoDinero movimientoDinero2 = new MovimientoDinero();
        movimientoDinero2.setIdmovimientodinero(1);
        movimientoDinero2.setConceptomovimiento("Ingresar efectivo");
        movimientoDinero2.setMontodelmovimiento(1200);
        movimientoDinero2.setCreatedAt(LocalDate.now());
        movimientoDinero2.setUpdatedAt(LocalDate.now());


        Empresa empresa2 = new Empresa();
        empresa2.setNombreEmpresa("CocaCola");
        empresa2.setDireccionEmpresa("Calle 45 #25-51");
        empresa2.setIdEmpresa(2);
        empresa2.setNITEmpresa("420690333-1");
        empresa2.setTelefonoEmpresa("7986452");
        empresa2.setEmpleado(empleado2);
        empresa2.setMovimientoDinero(movimientoDinero2);

        empresas.add(empresa2);


        return empresas;

    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        Empresa newEmpresa= new Empresa();
        newEmpresa.setNombreEmpresa(empresa.getNombreEmpresa());
        newEmpresa.setTelefonoEmpresa(empresa.getTelefonoEmpresa());
        newEmpresa.setDireccionEmpresa(empresa.getDireccionEmpresa());
        newEmpresa.setNITEmpresa(empresa.getNITEmpresa());
        newEmpresa.setIdEmpresa(empresa.getIdEmpresa());
        return newEmpresa;
    }

    @Override
    public Empresa updateEmpresa(Empresa empresa) {
        Empresa updateEmpresa= findById(id);
        updateEmpresa.setNombreEmpresa(empresa.getNombreEmpresa());
        updateEmpresa.setTelefonoEmpresa(empresa.getTelefonoEmpresa());
        updateEmpresa.setDireccionEmpresa(empresa.getDireccionEmpresa());
        updateEmpresa.setNITEmpresa(empresa.getNITEmpresa());
        updateEmpresa.setIdEmpresa(empresa.getIdEmpresa());
        return updateEmpresa;
    }






}
