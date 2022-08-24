package RPU.NET.project.empresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpresaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpresaApplication.class, args);

		class empresa {
			public long idEmpresa;
			public String nombreEmpresa;
			public String NITEmpresa;
			public String telefonoEmpresa;
			public String direccionEmpresa;

			public empresa(long idEmpresa, String nombreEmpresa, String NITEmpresa, String telefonoEmpresa, String direccionEmpresa) {
				this.idEmpresa = idEmpresa;
				this.nombreEmpresa = nombreEmpresa;
				this.NITEmpresa = NITEmpresa;
				this.telefonoEmpresa = telefonoEmpresa;
				this.direccionEmpresa = direccionEmpresa;
			}
		}
	}
}