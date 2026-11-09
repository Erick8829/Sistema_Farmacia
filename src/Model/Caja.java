package Model;

public class Caja {
    private int idCaja;
    private String codigoCaja;
    private String ubicacion;
    private String estado;

    public Caja(int idCaja, String codigoCaja, String ubicacion, String estado) {
        this.idCaja = idCaja;
        this.codigoCaja = codigoCaja;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public void abrirCaja() {
        estado = "ABIERTA";
    }

    public void cerrarCaja() {
        estado = "CERRADA";
    }

    public int getIdCaja() { return idCaja; }
    public String getCodigoCaja() { return codigoCaja; }
    public String getUbicacion() { return ubicacion; }
    public String getEstado() { return estado; }
}
