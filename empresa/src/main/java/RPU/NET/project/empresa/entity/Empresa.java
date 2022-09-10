package RPU.NET.project.empresa.entity;
import javax.persistence.*;

import java.util.List;

@Entity
@Table(name="Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empresa", nullable = false)
    private long idEmpresa;
    @Column(name = "nombre_Empresa", nullable = false)
    private String nombreEmpresa;

    @Column(name = "NIT_empresa", nullable = false)
    private String NITEmpresa;

    @Column(name = "telefono_Empresa", nullable = false)
    private String telefonoEmpresa;

    @Column(name = "direccion_Empresa", nullable = false)
    private String direccionEmpresa;

   /* private MovimientoDinero movimientoDineros;

    private Empleado empleados;

    public MovimientoDinero getMovimientoDineros() {
        return movimientoDineros;
    }

    public void setMovimientoDineros(MovimientoDinero movimientoDineros) {
        this.movimientoDineros = movimientoDineros;
    }

    public Empleado getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado empleados) {
        this.empleados = empleados;
    }*/

    public String getnombreEmpresa() {
        return nombreEmpresa;
    }

    public void setnombreEmpresa(String nombreEmpresa) {
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


