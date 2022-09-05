package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empresa;

import java.util.List;

public interface IEmpresaService {

    public Empresa findById(int id_empresa);

    public Empresa createEmpresa(Empresa empresa);

    public Empresa updateEmpresa(Empresa empresa);

    public List<Empresa> findByAll();
}
