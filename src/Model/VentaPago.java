package Model;

public class VentaPago {
    private int idPago;
    private double montoPagado;
    private String referenciaTransaccion;
    private MetodoPago metodoPago;

    public VentaPago(int idPago, double montoPagado, String referenciaTransaccion, MetodoPago metodoPago) {
        this.idPago = idPago;
        this.montoPagado = montoPagado;
        this.referenciaTransaccion = referenciaTransaccion;
        this.metodoPago = metodoPago;
    }

    public int getIdPago() { return idPago; }
    public double getMontoPagado() { return montoPagado; }
    public String getReferenciaTransaccion() { return referenciaTransaccion; }
    public MetodoPago getMetodoPago() { return metodoPago; }
}
