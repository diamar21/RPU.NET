package RPU.NET.project.empresa.controller;
import RPU.NET.project.empresa.service.IEmpresaService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import RPU.NET.project.empresa.entity.Empresa;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/api")
@Repository
public class EmpresaRestController {
    @Autowired(required = false)
    public IEmpresaService empresaService;
    @GetMapping("/empresa/{id_empresa}")
    public Empresa findById(@PathVariable int id_empresa) {
        return empresaService.findById(id_empresa);
    }


    @GetMapping("/empresa")
    public List<Empresa> findByAll() {
        return this.empresaService.findByAll();
    }

    @PostMapping("/empresa")
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return this.empresaService.createEmpresa(empresa);
    }

    @PutMapping("/empresa")
    public Empresa updateEmpresa(@PathVariable int id, @RequestBody Empresa empresa) {return this.empresaService.updateEmpresa(empresa);
    }


}
