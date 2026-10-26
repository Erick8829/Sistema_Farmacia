public class ClienteNatural extends Cliente{
    private String dni;
    private String nombres;
    private String apellidos;

    public ClienteNatural(int idCliente, String telefono, String direccion, String correo, String dni, String nombres, String apellidos) {
        super(idCliente, telefono, direccion, correo);
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    @Override
    public String getIdentificador() {
        return dni;
    }

    @Override
    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }
    
    public String getDni(){
        return dni;
    }
    
    
}
