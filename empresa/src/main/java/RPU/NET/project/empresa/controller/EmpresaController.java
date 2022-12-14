package RPU.NET.project.empresa.controller;
import RPU.NET.project.empresa.service.IEmpleadoService;
import RPU.NET.project.empresa.service.IEmpresaService;
import RPU.NET.project.empresa.service.IMovimientoDineroService;
import org.springframework.web.bind.annotation.*;
import RPU.NET.project.empresa.entity.Empresa;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmpresaController {
    @Autowired
    private IEmpresaService empresaService;

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IMovimientoDineroService movimientoDineroService;

    @GetMapping("/empresa/{id_empresa}")
    public Empresa findById(@PathVariable long id_empresa) {

        return empresaService.findById(id_empresa);
    }




    @GetMapping("/empresa")
    public List<Empresa> findByAll() {

        return empresaService.findAll();
    }

    @PostMapping("/empresa")
    public Empresa createEmpresa(@RequestBody Empresa empresa) {

        return empresaService.createEmpresa(empresa);
    }
    @PatchMapping("/empresa/{id}")
    public Empresa updateIdEmpresa(@PathVariable long id, @RequestBody Empresa empresa) {
        return empresaService.updateIdEmpresa(id, empresa);
    }

    @PutMapping("/empresa")
    public Empresa updateEmpresa(@RequestBody Empresa empresa) {
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/empresa/{id}")
    public void deleteEmpresa(@PathVariable long id) {

        empresaService.deleteEmpresa(id);

    }



}
