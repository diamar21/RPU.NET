package RPU.NET.Vista.controller;

import RPU.NET.Vista.entity.Empleado;
import RPU.NET.Vista.entity.Empresa;
import RPU.NET.Vista.entity.Rol;
import RPU.NET.Vista.service.IEmpleadoService;
import RPU.NET.Vista.service.IEmpresaService;
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
public class EmpleadoController {
    @Autowired
    private IEmpleadoService empleadoService;
    @Autowired
    private IEmpresaService empresaService;
    private final Logger LOG = Logger.getLogger(""+ EmpleadoController.class);
    //Listar Empleado
    @GetMapping("empleado/list")
    public String getListEmpleado(Model model){
        LOG.log(Level.INFO,"getListEmpleado");
        List<Empleado> empleados = empleadoService.findByAll();
        for (Empleado user : empleados)
            System.out.println(user.toString());
        model.addAttribute("empleados", empleados);
        return "list";
    }
    //Crear Empleado
        @GetMapping("empleado/crear")
        public String createempelado(Model modelo){
            LOG.log(Level.INFO,"createempleado");
            Empleado empleado = new Empleado();
            modelo.addAttribute("empleado", empleado);
            Empresa empresa = new Empresa();
            List<Empresa> empresas= empresaService.findAll();
            modelo.addAttribute("Empresa",empresa);
            return "empleadoCrear";
    }
    //Guardar Empleado
    @PostMapping("empleado/guardar")
    public String guardarEmpleado(@Valid Empleado empleado, BindingResult error, Model modelo){
        LOG.log(Level.INFO,"guardarEmpleado");
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            return "crearEmpleado";
        }
        empleado = empleadoService.createEmpleado(empleado);
        return "crearEmpleado";
    }
    //Editar Empleado
    @RequestMapping(value = "empleado/editarEmpleado/{id}", method = RequestMethod.GET)
    public String editEmpleado(@PathVariable("id") long id, Model modelo){
        LOG.log(Level.INFO,"editEmpleado");
        Empleado empleado = empleadoService.findById(id);
        modelo.addAttribute("empleado", empleado);
        List<Empresa> empresa=empresaService.findAll();
        modelo.addAttribute("empresa",empresa);
        return "empleadolist";
    }
    @RequestMapping(value = "empleado/eliminar/{id}", method = RequestMethod.GET)
    public String deleteEmpleado(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deleteEmpleado");
        empleadoService.deleteEmpleado(id);
        return "empleadolist";
    }
}
