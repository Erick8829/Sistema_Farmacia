package Model;

import java.util.ArrayList;

public class Factura extends Comprobante {
    private double subtotal;
    private double igv;

    public Factura(int idVenta, String serie, int numCorrelativo, String fechaHora,
                   ClienteJurídica cliente, Empleado empleado, AperturaCierreCaja sesionCaja,
                   String metodoPago, ArrayList<DetalleVenta> items, ArrayList<VentaPago> pagos) {
        super(idVenta, serie, numCorrelativo, fechaHora, 0, cliente, empleado,
              sesionCaja, metodoPago, items, pagos);
    }

    @Override
    public double calcularTotal() {
        // En factura el IGV se agrega sobre el valor de venta
        subtotal = sumarItems();
        igv = subtotal * 0.18;
        totalPagar = subtotal + igv;
        return totalPagar;
    }

    @Override
    public void imprimir() {
        calcularTotal();
        System.out.println("============== FACTURA ==============");
        System.out.println("Serie: " + serie + "-" + numCorrelativo + "   Fecha: " + fechaHora);
        System.out.println("Razón social: " + cliente.getNombreCompleto());
        System.out.println("RUC: " + cliente.getIdentificador());
        System.out.println("Atendido por: " + empleado.getNombreCompleto());
        System.out.println("-------------------------------------");
        for (DetalleVenta d : items) {
            System.out.printf("%d x %.2f = %.2f%n", d.getCantidad(), d.getPrecioVenta(), d.calcularSubtotal());
        }
        System.out.println("-------------------------------------");
        System.out.printf("Subtotal:   S/ %.2f%n", subtotal);
        System.out.printf("IGV (18%%):  S/ %.2f%n", igv);
        System.out.printf("TOTAL:      S/ %.2f%n", totalPagar);
        System.out.println("=====================================");
    }

    public double getSubtotal() { return subtotal; }
    public double getIgv() { return igv; }
}
