package RPU.NET.Vista.entity;

import javax.persistence.*;
import java.time.LocalDate;
@Entity  // crear las tablas en la base de datos
@Table(name="Movimiento") //crear el nombre de la tabla
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincremental del id
    @Column(name = "id_movimientodinero", nullable = false) //
    public   long idmovimientodinero;
    @Column(name = "concepto", nullable = false)
    public String conceptomovimiento;
    @Column(name = "cantidad", nullable = false)
    public float montodelmovimiento;

    @ManyToOne
    @JoinColumn(name="id_empleado", nullable = false)
    public Empleado empleado;

    //private Empresa empresa;
    @Column(name = "FechaCreacion", nullable = false)
    public LocalDate createdAt;
    @Column(name = "FechaActualizado", nullable = false)
    public LocalDate updatedAt;

  /* public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }*/

    public long getIdmovimientodinero() {
        return idmovimientodinero;
    }

    public String getConceptomovimiento() {
        return conceptomovimiento;
    }

    public float getMontodelmovimiento() {
        return montodelmovimiento;
    }

   /* public Empresa getEmpresa() {return empresa;}*/

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setIdmovimientodinero(long idmovimientodinero) {
        this.idmovimientodinero = idmovimientodinero;
    }

    public void setConceptomovimiento(String conceptomovimiento) {
        this.conceptomovimiento = conceptomovimiento;
    }

    public void setMontodelmovimiento(float montodelmovimiento) {
        this.montodelmovimiento = montodelmovimiento;
    }

  /*  public void setEmpresa(Empresa enterprise) {
        this.empresa = enterprise;
    }*/

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idTransaction=" + idmovimientodinero +
                ", concept='" + conceptomovimiento + '\'' +
                ", amount=" + montodelmovimiento +
              //  ", user=" + empleado +
               // ", enterprise=" + empresa +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
