package RPU.NET.project.empresa;

import RPU.NET.project.empresa.entity.*;
import RPU.NET.project.empresa.entity.Rol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpresaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpresaApplication.class, args);

		Empresa empresas = new Empresa();
		System.out.println("El sistema permite MOSTRAR TODAS las empresas,Ej. 'cocacola' "+empresas.getIdEmpresa());

	    Empresa empresa1 = new Empresa();
		System.out.println("El sistema permite CREAR UNA empresa,Ej. 'cocacola' "+empresa1.getIdEmpresa());
		//EL sistema permite cambiar empresa
		empresa1.setnombreEmpresa("postobon");
		System.out.println("El sistema permite EDITAR UNA empresa. Cambio de Nombre: Ej. Cocacola a Postobon "+empresa1.getnombreEmpresa());

		// se cambia direccion
		empresa1.setDireccionEmpresa("cra 185 nro 52a 152");
		System.out.println("El sistema permite EDITAR UNA empresa. Cambio domicilio ó dirección : Ej."+empresa1.getDireccionEmpresa());

		// se cambia telefono
		empresa1.setTelefonoEmpresa("214412");
		System.out.println("El sistema permite EDITAR UNA empresa. Cambiar telefono: Ej.: "+empresa1.getTelefonoEmpresa());

		//se cambia NIT
		empresa1.setNITEmpresa("110");
		System.out.println("El sistema permite EDITAR UNA empresa. Cambiar NIT la empresa : Ej.: "+empresa1.getNITEmpresa());

		//empleado   CAMBIO CAMILO GALVIS
		Empleado empleado1 = new Empleado();
		empleado1.setIdEmpleado(1);
		empleado1.setNombreEmpleado("Camilo Galvis");
		System.out.println("El sistema permite CONSULTAR UN usuario : Ej.:  "+empleado1.getNombreEmpleado());

		//se cambia nombre empleado
		empleado1.setNombreEmpleado("Manuela Rincon");
		System.out.println("El sistema permite EDITAR UN usuario. Cambiar nombre del empleado a: "+empleado1.getNombreEmpleado());

		// se cambia el get de correo
		empleado1.setCorreo("123@gmail.com");
		System.out.println("El sistema permite EDITAR UN usuario. Cambiar nombre correo del empleado a: "+empleado1.getCorreo());

		//se cambia nombre empresa del empleado
		empresa1.setnombreEmpresa("postobon");
		System.out.println("El sistema permite EDITAR UN usuario. Cambia la empresa del empleado a: "+empresa1.getnombreEmpresa());

		//se lee  y se cambia el rol del empleado
	    Rol rol = Rol.operativo;
	    empleado1.setRol(rol);
		System.out.println("El sistema permite EDITAR UN usuario. Se lee y se cambia el Rol del empleado a: "+empleado1.getRol());

	    Rol rol1 = Rol.administrador;
		empleado1.setRol(rol1);
		System.out.println("El sistema permite EDITAR UN usuario. Cambiar rol de usuario. se cambia el Rol de operativo a: "+empleado1.getRol());

		//Movimiento de Dinero Esto pertenece a Sprint 4
        MovimientoDinero movimiento1= new MovimientoDinero();
		System.out.println("El sistema  permite crear Movimiento de Dinero 'movimiento1'");

		movimiento1.setIdmovimientodinero(1);
		System.out.println("El sistema permite crear un Id a 'movimiento1' es: "+movimiento1.getIdmovimientodinero());

		movimiento1.setConceptomovimiento("pago salario");
		System.out.println("El sistema permite crear un Concepto a 'movimiento1' de: "+movimiento1.getConceptomovimiento());

		movimiento1.setMontodelmovimiento(150000);
		System.out.println("El sistema permite agregar un Monto positivo al movimiento de dinero Ej. 'movimiento1' "+movimiento1.getMontodelmovimiento());

		movimiento1.setMontodelmovimiento(-210015);
		System.out.println("El sistema permite agregar un Monto negativo al movimiento de dinero Ej. 'movimiento2' "+movimiento1.getMontodelmovimiento());

		// se actualiza el usuario que hizo el movimiento de dinero
		movimiento1.setMontodelmovimiento(movimiento1.getMontodelmovimiento());
		System.out.println("El sistema permite editar un movimiento dinero del usuario con id # : "+empleado1.getIdEmpleado());
	}

}