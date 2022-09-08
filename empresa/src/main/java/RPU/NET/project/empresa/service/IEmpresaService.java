package RPU.NET.project.empresa.service;

import RPU.NET.project.empresa.entity.Empresa;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IEmpresaService {

    public Empresa findById(int id_empresa);
    public List<Empresa> findByAll();
    public Empresa createEmpresa(Empresa empresa);
    public Empresa updateEmpresa(int id, Empresa empresa);
    public void deleteEmpresa(@PathVariable long id);
}
