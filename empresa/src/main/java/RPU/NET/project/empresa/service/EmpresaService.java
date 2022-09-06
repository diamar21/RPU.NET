package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.Empresa;
import RPU.NET.project.empresa.entity.MovimientoDinero;
import RPU.NET.project.empresa.entity.Rol;

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
    public List<Empresa> findAll() {
        List<Empresa> empresas = new ArrayList<>();
        Empresa empresa1 = new Empresa();
        empresa1.setNombreEmpresa("Postobón");
        empresa1.setDireccionEmpresa("Calle 15 #95-11");
        empresa1.setIdEmpresa(1);
        empresa1.setNITEmpresa("850235587-9");
        empresa1.setTelefonoEmpresa("8157536");
        empresas.add(empresa1);
        Empresa empresa2 = new Empresa();
        empresa2.setNombreEmpresa("CocaCola");
        empresa2.setDireccionEmpresa("Calle 45 #25-51");
        empresa2.setIdEmpresa(2);
        empresa2.setNITEmpresa("420690333-1");
        empresa2.setTelefonoEmpresa("7986452");
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
