package RPU.NET.project.empresa.entity;

import java.time.LocalDate;

public class transaction {
    private  long idTransaction;
    private String concept;
    private float amount;
    private User user;
    private Enterprise enterprise;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public long getIdTransaction() {
        return idTransaction;
    }

    public String getConcept() {
        return concept;
    }

    public float getAmount() {
        return amount;
    }

    public User getUser() {
        return user;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }



    public void setIdTransaction(long idTransaction) {
        this.idTransaction = idTransaction;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEnterprise(Enterprise enterprise) {
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
        return "transaction{" +
                "idTransaction=" + idTransaction +
                ", concept='" + concept + '\'' +
                ", amount=" + amount +
                ", user=" + user +
                ", enterprise=" + enterprise +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
