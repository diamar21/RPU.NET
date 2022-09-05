package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empresa;

import java.util.List;

public interface IEmpresaService {

    Empresa findById(int id_empresa);

    List<Empresa> findAll();

    Empresa createEmpresa(Empresa empresa);

    Empresa updateEmpresa(Empresa empresa);
}
