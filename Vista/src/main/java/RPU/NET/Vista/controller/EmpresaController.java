package RPU.NET.Vista.controller;

import RPU.NET.Vista.entity.Empleado;
import RPU.NET.Vista.entity.Empresa;
import RPU.NET.Vista.entity.Rol;
import RPU.NET.Vista.service.IEmpleadoService;
import RPU.NET.Vista.service.IEmpresaService;
import RPU.NET.Vista.service.IMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpresaController {
    @Autowired
    private IEmpresaService empresaService;
    @Autowired
    private IEmpleadoService empleadoService;
    @Autowired
    private IMovimientoDineroService movimientoDineroService;
    private final Logger LOG = Logger.getLogger(""+ EmpresaController.class);
    //Listar Empresa
    @GetMapping("empresa/list")
    public String getListEmpresa(Model model){
        LOG.log(Level.INFO,"getListEmpresa");
        List<Empresa> empresas = empresaService.findAll();
        for (Empresa user : empresas)
            System.out.println(user.toString());
        model.addAttribute("empresas", empresas);
        return "empresalist";
    }
    //Crear Empresa
    @GetMapping("empresa/crear")
    public String createempresa(Model modelo){
        LOG.log(Level.INFO,"createempresa");
        //Empresa + Nombre + Direccion + Telefono + NIT
        Empresa empresa = new Empresa();
        empresa.setnombreEmpresa("");
        empresa.setDireccionEmpresa("");
        empresa.setNITEmpresa("");
        empresa.setTelefonoEmpresa("");
        modelo.addAttribute("empresa", empresa);
        return "empresalist";
    }

    //Guardar Empresa
    @PostMapping("empresa/guardar")
    public String guardarEmpresa(@Valid Empresa empresa, BindingResult error, Model modelo){
        LOG.log(Level.INFO,"guardarEmpresa");
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            return "empresa/modificar";
        }
        empresa = empresaService.createEmpresa(empresa);
        return "empresa/list";
    }

    //Editar Empresa
    @RequestMapping(value = "empresa/editarEmpresa/{id}", method = RequestMethod.GET)
    public String editEmpresa(@PathVariable("id") long id, Model modelo){
        LOG.log(Level.INFO,"editEmpresa");
        Empresa empresa = empresaService.findById(id);
        empresa.setnombreEmpresa("Coca Cola");
        empresa.setDireccionEmpresa("Carrera 25 #15-30");
        empresa.setNITEmpresa("300235587-7");
        empresa.setTelefonoEmpresa("9876543");
        modelo.addAttribute("empresa", empresa);
        List<Empresa> empresas=empresaService.findAll();
        modelo.addAttribute("empresa",empresas);
        return "empleado/modificar";
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public String deleteEmpresa(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deleteEmpresa");
        empresaService.deleteEmpresa(id);
        return "redirect:/empresa/listar";
    }

    }
