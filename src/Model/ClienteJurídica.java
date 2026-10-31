package Model;

public class ClienteJurídica extends Cliente{
    private String ruc;
    private String razonSocial;
    private String representante;

    public ClienteJurídica(int idCliente, String telefono, String direccion, String correo, String ruc, String razonSocial, String representante    ) {
        super(idCliente, telefono, direccion, correo);
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.representante = representante;
    }

    @Override
    public String getIdentificador() {
        return ruc;
    }

    @Override
    public String getNombreCompleto() {
        return razonSocial + " (Rep: " + representante + ")";
    }
    
    public String getRuc(){
        return ruc;
    }
    
    
}
