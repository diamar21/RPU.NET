package RPU.NET.Vista.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity  // crear las tablas en la base de datos
@Table(name="empleado") //crear el nombre de la base de datos
public class Empleado {

    @Id // decimos qie idrol es la Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremental del id
    @Column(name = "id_empleado", nullable = false)
    private long idEmpleado;
    @Column(name = "nombre", nullable = false)
    private String nombreEmpleado;
    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "imagen", nullable = false)
    private String imagen;
    @Column(name = "FechaCreacion", nullable = false)
    private LocalDate createdAt;
    @Column(name = "FechaActualizado", nullable = false)
    private LocalDate updatedAt;

    @ManyToOne // la relacion queda de la llave foranea mejora la codificacion
    @JoinColumn(name="id_Empresa", nullable = false)
    private Empresa empresa;

    //private MovimientoDinero movimientoDinero;


    @Column(name = "rol")
    private Rol rol;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

  /*  public MovimientoDinero getMovimientoDinero() {
        return movimientoDinero;
    }

    public void setMovimientoDinero(MovimientoDinero movimientoDinero) {
        this.movimientoDinero = movimientoDinero;
    }
*/
    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}

