package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empresa;

import java.util.List;

public interface IEmpresaService {

    Empresa findById(int id_empresa);

    Empresa createEmpresa(Empresa empresa);

    Empresa updateEmpresa(Empresa empresa);

    List<Empresa> findByAll();
}
