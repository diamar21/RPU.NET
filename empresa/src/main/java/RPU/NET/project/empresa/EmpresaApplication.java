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

			public long getIdEmpresa() {
				return idEmpresa;
			}

			public void setIdEmpresa(long idEmpresa) {
				this.idEmpresa = idEmpresa;
			}

			public String getNombreEmpresa() {
				return nombreEmpresa;
			}

			public void setNombreEmpresa(String nombreEmpresa) {
				this.nombreEmpresa = nombreEmpresa;
			}

			public String getNITEmpresa() {
				return NITEmpresa;
			}

			public void setNITEmpresa(String NITEmpresa) {
				this.NITEmpresa = NITEmpresa;
			}

			public String getTelefonoEmpresa() {
				return telefonoEmpresa;
			}

			public void setTelefonoEmpresa(String telefonoEmpresa) {
				this.telefonoEmpresa = telefonoEmpresa;
			}

			public String getDireccionEmpresa() {
				return direccionEmpresa;
			}

			public void setDireccionEmpresa(String direccionEmpresa) {
				this.direccionEmpresa = direccionEmpresa;
			}
		}
	}
}