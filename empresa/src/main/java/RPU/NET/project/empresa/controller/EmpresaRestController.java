package RPU.NET.project.empresa.controller;
import RPU.NET.project.empresa.servicio.IEmpresaServicio;
import org.springframework.web.bind.annotation.*;
import RPU.NET.project.empresa.entity.Empresa;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmpresaRestController {
    @Autowired
    private IUsuarioService usuarioServicio;
    @GetMapping("/empresa/{id_empresa}")
    public Empresa findById(@PathVariable int id_empresa){
        return empresaServicio.findById(id_empresa);
    }
    @GetMapping("/empresa")
    public List<Empresa> findAll(){
        return this.empresaServicio.findAll();
    }

    @PostMapping("/empresa")
    public Empresa createEmpresa (@RequestBody Empresa empresa){
        return this.empresaServicio.createEmpresa(empresa);
    }

    @PutMapping("/empresa")
    public Usuario updateEmpresa(@RequestBody Empresa empresa){
        return this.empresaServicio.updateEmpresa(empresa);
    }

    @DeleteMapping("/empresa/{id_empresa}")
    public void deleteEmpresa(@PathVariable long id){
        this.empresaServicio.deleteEmpresa(id_empresa);
    }
