package Model;

import java.time.LocalDate;

public class Lote {

    private int idLote;
    private String numeroLote;
    private String fechaFabricacion;
    private String fechaVencimiento;
    private String estado;
    private Producto producto;

    public Lote(int idLote, String numeroLote, String fechaFabricacion, String fechaVencimiento, String estado, Producto producto) {
        this.idLote = idLote;
        this.numeroLote = numeroLote;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
        this.producto = producto;
    }

    public boolean verificarVencimiento() {
        try {
            LocalDate fechaVenc = LocalDate.parse(this.fechaVencimiento);
            return LocalDate.now().isAfter(fechaVenc);
        } catch (Exception e) {
            return false;
        }
    }

    public int getIdLote() {
        return idLote;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public Producto getProducto() {
        return producto;
    }

}
