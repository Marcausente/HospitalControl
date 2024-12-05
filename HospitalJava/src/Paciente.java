public class Paciente {
    private String nombre;
    private String apellido;
    private String motivoOperacion;
    private int gravedad;

    // Constructor
    public Paciente(String nombre, String apellido, String motivoOperacion, int gravedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.motivoOperacion = motivoOperacion;
        this.gravedad = gravedad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMotivoOperacion() {
        return motivoOperacion;
    }

    public void setMotivoOperacion(String motivoOperacion) {
        this.motivoOperacion = motivoOperacion;
    }

    // Método toString para imprimir información del paciente
    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", motivoOperacion='" + motivoOperacion + '\'' +
                '}';
    }

    public int getGravedad() {
        return gravedad;
    }
}
