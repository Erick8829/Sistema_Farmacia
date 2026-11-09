package Model;

public class DetalleVenta {
    private int idDetalle;
    private int cantidad;
    private double precioVenta;
    private double subtotal;
    private Lote lote;

    public DetalleVenta(int idDetalle, int cantidad, double precioVenta, Lote lote) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.lote = lote;
        calcularSubtotal();
    }

    public double calcularSubtotal() {
        subtotal = cantidad * precioVenta;
        return subtotal;
    }

    public int getIdDetalle() { return idDetalle; }
    public int getCantidad() { return cantidad; }
    public double getPrecioVenta() { return precioVenta; }
    public double getSubtotal() { return subtotal; }
    public Lote getLote() { return lote; }
}