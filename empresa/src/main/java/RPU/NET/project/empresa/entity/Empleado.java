package RPU.NET.project.empresa.entity;

public class Empleado {
    private long idEmpleado;
    private String nombreEmpleado;
    private String correo;
    private String rozonSocial;

    public Empleado(long idEmpleado, String nombreEmpleado, String correo, String rozonSocial) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.rozonSocial = rozonSocial;
    }

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

    public String getRozonSocial() {
        return rozonSocial;
    }

    public void setRozonSocial(String rozonSocial) {
        this.rozonSocial = rozonSocial;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", correo='" + correo + '\'' +
                ", rozonSocial='" + rozonSocial + '\'' +
                '}';
    }
}
