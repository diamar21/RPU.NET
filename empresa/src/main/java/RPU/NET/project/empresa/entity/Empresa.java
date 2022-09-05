package RPU.NET.project.empresa.entity;
import javax.persistence.*;
import javax.persistence.Table;

public class Empresa {

    private String nombreEmpresa;

    private String NITEmpresa;
    private long idEmpresa;

    private String telefonoEmpresa;

    private String direccionEmpresa;

    private MovimientoDinero MovimientoDinero;

    private Empleado empleado;

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

    public RPU.NET.project.empresa.entity.MovimientoDinero getMovimientoDinero() {
        return MovimientoDinero;
    }

    public void setMovimientoDinero(MovimientoDinero movimientoDinero) {
        MovimientoDinero = movimientoDinero;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}


