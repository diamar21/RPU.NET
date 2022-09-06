package RPU.NET.project.empresa.entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="Empresa_Diana")
public class Empresa {

    @Column(name = "nombre_Empresa", nullable = false)
    private String nombreEmpresa;

    @Column(name = "NIT_empresa", nullable = false)
    private String NITEmpresa;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empresa", nullable = false)
    private long idEmpresa;
    public List<Empleado> empleado;

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    @Column(name = "telefono_Empresa", nullable = false)
    private String telefonoEmpresa;

    @Column(name = "direccion_Empresa", nullable = false)
    private String direccionEmpresa;


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

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
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


