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

    @GetMapping("/empleado/list")
    public String getlistEmpleado (Model model,@PathVariable ("id") long id) {

        LOG.log(Level.INFO, "getListMovimientos");
        List<Empleado> empleados=empleadoService.findByAll();
        model.addAttribute("empleados", empleados);

        return "empleado/list";
    }


    @GetMapping("/empleado/{id}")
    public Empleado findById(@PathVariable long id) {

        return empleadoService.findById(id);
    }

    @GetMapping("/empleado")
    public List<Empleado> findByAll() {   // se agrega @PathVariable para que se pueda ingresar la variable id en @getmapping
        return empleadoService.findByAll();
    }

    @GetMapping("/empleado/{id}")
    public List<Empleado> getEmpresaById(@PathVariable  long id) {

        return empleadoService.getEmpresaById(id);
    }
    @PostMapping("/empleado")   //crea un nuevo rol con el id =3
    public Empleado createEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.createEmpleado(empleado);

    }
    @PatchMapping("/empleado")
    public Empleado updateEmpleado(@RequestBody Empleado empleado) {


        return empleadoService.updateEmpleado(empleado);
    }
    @DeleteMapping("/empleado/{id}")
    public void deleteEmpleado(@PathVariable long id) {

        empleadoService.deleteEmpleado(id);
    }

}
