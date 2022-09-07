package RPU.NET.project.empresa.controller;
import RPU.NET.project.empresa.service.EmpresaService;
import RPU.NET.project.empresa.service.IEmpresaService;
import org.springframework.web.bind.annotation.*;
import RPU.NET.project.empresa.entity.Empresa;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmpresaRestController {
    @Autowired
    private IEmpresaService empresaService;
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
    public Empresa updateEmpresa(@PathVariable int id, @RequestBody Empresa empresa) {return this.empresaService.updateEmpresa(id,empresa);
    }

    @DeleteMapping("/empresa/{id_empresa}")
    public void deleteEmpresa(@PathVariable long id) {

        this.empresaService.deleteEmpresa(id);

    }

}
