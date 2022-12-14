package RPU.NET.Vista.controller;

import RPU.NET.Vista.entity.Empleado;
import RPU.NET.Vista.entity.Empresa;
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
            LOG.log(Level.INFO,"getListEmpresa");
            List<Empresa> empresas = empresaService.findAll();
            for (Empresa user : empresas)
                System.out.println(user.toString());
            model.addAttribute("empresas", empresas);
            return "list";

        }
        @GetMapping("empleado/list2")
        public String EmpleadoMovimientos(Model model){
            LOG.log(Level.INFO,"getListEmpleado");
            List<Empleado> empleados = empleadoService.findByAll();
            for (Empleado user : empleados)
                System.out.println(user.toString());
            model.addAttribute("empleados", empleados);
            return "empleadoingresarmovimiento";

        }
        //Crear Empleado
        @GetMapping("empleado/crear")
        public String createempelado(Model modelo){
            LOG.log(Level.INFO,"createempleado");
            Empleado empleado = new Empleado();
            modelo.addAttribute("empleado", empleado);
            List<Empleado> empleados= empleadoService.findByAll();
            LOG.log(Level.INFO,"getListEmpresa");
            List<Empresa> empresas = empresaService.findAll();
            for (Empresa user : empresas)
                System.out.println(user.toString());
            modelo.addAttribute("empresas", empresas);
            return "empleadoCrear";

        }
        //Guardar Empleado
        @PostMapping("empleado/guardar")
        public String guardarEmpleado(@Valid Empleado empleado, BindingResult error, Model modelo){
            LOG.log(Level.INFO,"guardarEmpleado");
            for(ObjectError e : error.getAllErrors())
                System.out.println(e.toString());
            if(error.hasErrors()) {
                return "empleado/crear";
            }
            empleado = empleadoService.createEmpleado(empleado);
            return "creado";
        }
        //Editar Empleado
        @RequestMapping(value = "empleado/editarEmpleado/{id}", method = RequestMethod.GET)
        public String editEmpleado(@PathVariable("id") long id, Model modelo){
            LOG.log(Level.INFO,"editEmpleado");
            Empleado empleado = empleadoService.findById(id);
            modelo.addAttribute("empleado", empleado);
            LOG.log(Level.INFO,"getListEmpresa");
            List<Empresa> empresas = empresaService.findAll();
            for (Empresa user : empresas)
                System.out.println(user.toString());
            modelo.addAttribute("empresas", empresas);
            return "modificarEmpleado";
        }
        @RequestMapping(value = "empleado/eliminar/{id}", method = RequestMethod.GET)
        public String deleteEmpleado(@PathVariable("id") long id, Model modelo) {
            LOG.log(Level.INFO, "deleteEmpleado");
            return "empleadolist";
        }
    }