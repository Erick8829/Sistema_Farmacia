
public abstract class Cliente {

    protected int idCliente;
    protected String telefono;
    protected String direccion;
    protected String correo;

    public Cliente(int idCliente, String telefono, String direccion, String correo) {
        this.idCliente = idCliente;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public abstract String getIdentificador();

    public abstract String getNombreCompleto();

    public int getIdCliente() {
        return idCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

}
