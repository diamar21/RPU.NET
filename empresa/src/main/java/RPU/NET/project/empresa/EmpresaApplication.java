package RPU.NET.project.empresa;

import RPU.NET.project.empresa.entity.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpresaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpresaApplication.class, args);
		//empresa
	/*	Empresa empresa1 = new Empresa();
		System.out.println(empresa1.getIdEmpresa());
		System.out.println("Se crea la empresa 'cocacola'");
		//se cambia nombre empresa
		empresa1.setnombreEmpresa("postobon");
		System.out.println(empresa1.getnombreEmpresa());
		System.out.println("Se cambia la empresa a 'postobon'");

		// se cambia direccion
		empresa1.setDireccionEmpresa("cra 185 nro 52a 152");
		System.out.println(empresa1.getDireccionEmpresa());
		System.out.println("Se cambia la dirección de la empresa ");

		// se cambia telefono
		empresa1.setTelefonoEmpresa("214412");
		System.out.println(empresa1.getTelefonoEmpresa());
		System.out.println("Se cambia el telefono de la empresa");

		//se cambia NIT
		empresa1.setNITEmpresa("110");
		System.out.println(empresa1.getIdEmpresa());
		System.out.println("Se cambia el NIT de la empresa");

		//empleado   CAMBIO CAMILO GALVIS
		Empleado empleado1 = new Empleado();
		empleado1.setIdEmpleado(1);
		empleado1.setNombreEmpleado("Camilo Galvis");
		System.out.println(empleado1.getNombreEmpleado());
		System.out.println("Se crea el empleado 'empleado1'");

		//se cambia nombre empleado
		empleado1.setNombreEmpleado("Manuela Rincon");
		System.out.println(empleado1.getNombreEmpleado());
		System.out.println("Se cambia el nombre del empleado a 'Manuela Rincon' ");

		// se cambia el get de correo
		empleado1.setCorreo("123@gmail.com");
		System.out.println(empleado1.getCorreo());
		System.out.println("Se cambia el correo del empleado");

		//se cambia nombre empresa del empleado
		/*empleado1.setnombreEmpresa("postobon");
		System.out.println(empleado1.getnombreEmpresa());
		System.out.println("Se cambia la empresa del empleado");*/

		//se lee  y se cambia el rol del empleado
	//	Rol rol = Rol.operativo;
	/*	empleado1.setRol(rol);
		System.out.println(empleado1.getRol());
		System.out.println("Se lee y se cambia el Rol del empleado");*/

	/*	Rol rol1 = Rol.administrador;
		empleado1.setRol(rol1);
		System.out.println(empleado1.getRol());
		System.out.println("Se cambia el Rol del empleado");*/

		//Movimiento de Dinero
/*		MovimientoDinero movimiento1= new MovimientoDinero();
		System.out.println("Se crea el Movimiento de Dinero 'movimiento1'");

		movimiento1.setIdmovimientodinero(1);
		System.out.println(movimiento1.getIdmovimientodinero());
		System.out.println("Se asigna un Id a 'movimiento1'");

		movimiento1.setConceptomovimiento("pago salario");
		System.out.println(movimiento1.getConceptomovimiento());
		System.out.println("Se asigna un Concepto a 'movimiento1'");

		movimiento1.setMontodelmovimiento(150000);
		System.out.println(movimiento1.getMontodelmovimiento());
		System.out.println("Se asigna un Monto positivo a 'movimiento1'");


		movimiento1.setMontodelmovimiento(-210015);
		System.out.println(movimiento1.getMontodelmovimiento());
		System.out.println("Se asigna un Monto negativo a 'movimiento1'");
*/
		// se actualiza el usuario que hizo el movimiento de dinero
		//movimiento1.setEmpleado(empleado1);
	//	System.out.println("Se hizo un movimiento dinero del usuario con id # : "+empleado1.getIdEmpleado());


	}

}