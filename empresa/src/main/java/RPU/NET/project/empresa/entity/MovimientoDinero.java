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

    public long getIdTransaction() {
        return idmovimientodinero;
    }

    public String getConcept() {
        return conceptomovimiento;
    }

    public float getAmount() {
        return montodelmovimiento;
    }

    /*public User getUser() {
        return user;
    }*/

    public Empresa getEnterprise() {
        return enterprise;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }



    public void setIdTransaction(long idTransaction) {
        this.idmovimientodinero = idTransaction;
    }

    public void setConcept(String concept) {
        this.conceptomovimiento = concept;
    }

    public void setAmount(float amount) {
        this.montodelmovimiento = amount;
    }

   /* public void setUser(User user) {
        this.user = user;
    }*/

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
