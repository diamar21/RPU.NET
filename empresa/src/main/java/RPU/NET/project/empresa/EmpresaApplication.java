package RPU.NET.project.empresa;

import RPU.NET.project.empresa.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpresaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpresaApplication.class, args);
		//empresa
		Empresa empresa1 = new Empresa("cocacola", "452014", 21, "5241171", "cra52 nro b51 102");
		System.out.println(empresa1.getIdEmpresa());
		//se cambia nombre empresa
		empresa1.setNombreEmpresa("postobon");
		System.out.println(empresa1.getNombreEmpresa());
		// se cambia direccion
		empresa1.setDireccionEmpresa("cra 185 nro 52a 152");
		System.out.println(empresa1.getDireccionEmpresa());
		// se cambia telefono
		empresa1.setTelefonoEmpresa("214412");
		System.out.println(empresa1.getTelefonoEmpresa());
		//se cambia NIT
		empresa1.setNITEmpresa("110");
		System.out.println(empresa1.getIdEmpresa());

		//empleado
		Empleado empleado1 = new Empleado(45, "Manuel Perez", "asdasd@gmail.com", "cocacola");
		System.out.println(empleado1.getNombreEmpleado());


		//se cambia nombre empleado
		empleado1.setNombreEmpleado("Manuela Rincon");
		System.out.println(empleado1.getNombreEmpleado());
		// se cambia el get de correo
		empleado1.setCorreo("123@gmail.com");
		System.out.println(empleado1.getCorreo());

		//se cambia nombre empresa del empleado
		empleado1.setNombreEmpresa("postobon");
		System.out.println(empleado1.getNombreEmpresa());

		//se lee  y se cambia el rol del empleado
		Rol rol = Rol.operativo;
		empleado1.setRol(rol);
		System.out.println(empleado1.getRol());

		Rol rol1 = Rol.administrador;
		empleado1.setRol(rol1);
		System.out.println(empleado1.getRol());

		MovimientoDinero movimiento1= new MovimientoDinero();

		movimiento1.setIdmovimientodinero(1);
		System.out.println(movimiento1.getIdmovimientodinero());

		movimiento1.setConceptomovimiento("pago salario");
		System.out.println(movimiento1.getConceptomovimiento());

		movimiento1.setMontodelmovimiento(150000);
		System.out.println(movimiento1.getMontodelmovimiento());

		movimiento1.setMontodelmovimiento(-210015);
		System.out.println(movimiento1.getMontodelmovimiento());

		// se actualiza el usuario que hizo el movimiento de dinero
		Usuario usuario1 = new Usuario();
		usuario1.setIdUsuario(2);
		movimiento1.setUsuario(usuario1);
		System.out.println(movimiento1.getUsuario());





	}

}