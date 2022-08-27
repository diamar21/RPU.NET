package RPU.NET.project.empresa.entity;

import java.time.LocalDate;

public class MovimientoDinero {
    private  long idmovimientodinero;
    private String conceptomovimiento;
    private float montodelmovimiento;
    //private User user;
    private Empresa enterprise;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public MovimientoDinero(long idmovimientodinero, String conceptomovimiento, float montodelmovimiento, Empresa enterprise) {
        this.idmovimientodinero = idmovimientodinero;
        this.conceptomovimiento = conceptomovimiento;
        this.montodelmovimiento = montodelmovimiento;
        this.enterprise = enterprise;
    }

    public long getIdmovimientodinero() {
        return idmovimientodinero;
    }

    public String getConceptomovimiento() {
        return conceptomovimiento;
    }

    public float getMontodelmovimiento() {
        return montodelmovimiento;
    }

    public Empresa getEnterprise() {
        return enterprise;
    }

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

    public void setEnterprise(Empresa enterprise) {
        this.enterprise = enterprise;
    }

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
                /*", user=" + user +*/
                ", enterprise=" + enterprise +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
