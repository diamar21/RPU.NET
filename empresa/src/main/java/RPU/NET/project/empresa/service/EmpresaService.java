package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empresa;
import RPU.NET.project.empresa.entity.MovimientoDinero;
import RPU.NET.project.empresa.repository.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements IEmpresaService{

    @Autowired
    private IEmpresaRepository empresaRepository;


    @Override
    public Empresa findById(long id) {
        Optional<Empresa> empresa = empresaRepository.findById((long) id);
        return empresa.get();
    }



    @Override
    public Empresa updateIdEmpresa(long id, Empresa empresa) {
        Empresa updateIdEmpresa = empresaRepository.save(empresa);
        return updateIdEmpresa;
    }

    @Override
    public List<Empresa> findAll() {
        List <Empresa> empresas= (List<Empresa>) empresaRepository.findAll();
        return empresas;
    }


    @Override
    public Empresa createEmpresa(Empresa empresa) {
     Empresa newempresa=empresaRepository.save(empresa);
    return newempresa;
    }


    @Override
    public Empresa updateEmpresa(Empresa empresa) {
    Empresa updateempresa=empresaRepository.save(empresa);
    return updateempresa;
    }

    @Override
    public void deleteEmpresa(long id) {

        empresaRepository.deleteById((long) id);
    }


}
/*
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(1);
        empresa.setDireccionEmpresa("Calle 15 #95-11");
        empresa.setTelefonoEmpresa("8157536");
        empresa.setNITEmpresa("850235587-9");
        empresa.setNombreEmpresa("Postobón");

        return empresa;
    }

        List <Empresa> empresas = new ArrayList<>();
        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        empleado1.setNombreEmpleado("Pedro el escamoso");
        empleado1.setNombreEmpresa(empleado1.getNombreEmpresa());
        empleado1.setCorreo("pec@gmail.com");
        Rol rol1 = Rol.administrador;
        empleado1.setRol(rol1);
        Empresa empresa1 = new Empresa();
        empresa1.setNombreEmpresa("Postobón");
        empresa1.setDireccionEmpresa("Calle 15 #95-11");
        empresa1.setIdEmpresa(1);
        empresa1.setNITEmpresa("850235587-9");
        empresa1.setTelefonoEmpresa("8157536");
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


        empresas.add(empresa2);


        return empresas;
       Empresa newEmpresa= new Empresa();
        newEmpresa.setNombreEmpresa(empresa.getNombreEmpresa());
        newEmpresa.setTelefonoEmpresa(empresa.getTelefonoEmpresa());
        newEmpresa.setDireccionEmpresa(empresa.getDireccionEmpresa());
        newEmpresa.setNITEmpresa(empresa.getNITEmpresa());
        newEmpresa.setIdEmpresa(empresa.getIdEmpresa());
        return newEmpresa;
    }
    }*/