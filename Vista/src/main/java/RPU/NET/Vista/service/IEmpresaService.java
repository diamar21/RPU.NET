package RPU.NET.Vista.service;

import RPU.NET.Vista.entity.Empresa;

import java.util.List;

public interface IEmpresaService {

    public Empresa findById(long id);
    public List<Empresa> findAll();
    public Empresa createEmpresa(Empresa empresa);
    public Empresa updateEmpresa(Empresa empresa);
    public Empresa updateIdEmpresa(long id, Empresa empresa);
    public void deleteEmpresa(long id);

}
