package Model;

import Dao.Imprimible;
import java.util.ArrayList;

public abstract class Comprobante implements Imprimible {
    protected int idVenta;
    protected String serie;
    protected int numCorrelativo;
    protected String fechaHora;
    protected double totalPagar;
    protected Cliente cliente;
    protected Empleado empleado;
    protected AperturaCierreCaja sesionCaja;
    protected String metodoPago;
    protected ArrayList<DetalleVenta> items;
    protected ArrayList<VentaPago> pagos;

    public Comprobante(int idVenta, String serie, int numCorrelativo, String fechaHora,
                       double totalPagar, Cliente cliente, Empleado empleado,
                       AperturaCierreCaja sesionCaja, String metodoPago,
                       ArrayList<DetalleVenta> items, ArrayList<VentaPago> pagos) {
        this.idVenta = idVenta;
        this.serie = serie;
        this.numCorrelativo = numCorrelativo;
        this.fechaHora = fechaHora;
        this.totalPagar = totalPagar;
        this.cliente = cliente;
        this.empleado = empleado;
        this.sesionCaja = sesionCaja;
        this.metodoPago = metodoPago;
        this.items = (items != null) ? items : new ArrayList<>();
        this.pagos = (pagos != null) ? pagos : new ArrayList<>();
    }

    public abstract double calcularTotal();

    public void agregarDetalle(DetalleVenta detalle) {
        items.add(detalle);
    }

    public void registrarPago(VentaPago pago) {
        pagos.add(pago);
    }

    // Suma de subtotales de los items (base para Boleta y Factura)
    protected double sumarItems() {
        double suma = 0;
        for (DetalleVenta d : items) {
            suma += d.calcularSubtotal();
        }
        return suma;
    }

    public int getIdVenta() { return idVenta; }
    public double getTotalPagar() { return totalPagar; }
    public ArrayList<DetalleVenta> getItems() { return items; }
    public ArrayList<VentaPago> getPagos() { return pagos; }
    public String getSerie() { return serie; }
    public int getNumCorrelativo() { return numCorrelativo; }
    public String getFechaHora() { return fechaHora; }
    public Cliente getCliente() { return cliente; }
    public Empleado getEmpleado() { return empleado; }
}
