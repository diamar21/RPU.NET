package RPU.NET.project.empresa;

import RPU.NET.project.empresa.entity.Empleado;
import RPU.NET.project.empresa.entity.Empresa;
import RPU.NET.project.empresa.entity.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpresaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpresaApplication.class, args);

		Empresa cocacola = new Empresa("cocacola", "452014", 21, "5241171", "cra52 nro b51 102");
		System.out.println(cocacola.getIdEmpresa());

		Empleado empleado1 = new Empleado(45, "Manuel Perez", "asdasd@gmail.com", "cocacola");
		System.out.println(empleado1.getNombreEmpleado());

		empleado1.getRol();
		System.out.println(empleado1.getRol());

		empleado1.setNombreEmpleado("Manuela Rincon");
		System.out.println(empleado1.getNombreEmpleado());

		empleado1.setNombreEmpresa("postobon");
		System.out.println(empleado1.getNombreEmpresa());

		MovimientoDinero movimiento1= new MovimientoDinero();

		movimiento1.setIdmovimientodinero(1);
		System.out.println(movimiento1.getIdmovimientodinero());

		movimiento1.setConceptomovimiento("pago salario");
		System.out.println(movimiento1.getConceptomovimiento());

		movimiento1.setMontodelmovimiento(150000);
		System.out.println(movimiento1.getMontodelmovimiento());






	}

}