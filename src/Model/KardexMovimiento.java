package Model;

public class KardexMovimiento {

    private int idKardex;
    private String tipoMovimiento; // ENTRADA, SALIDA o MERMA
    private int cantidad;
    private int saldoFinal;
    private String fechaRegistro;
    private InventarioStock inventario;

    public KardexMovimiento(int idKardex, String tipoMovimiento, int cantidad,
                            String fechaRegistro, InventarioStock inventario) {
        this.idKardex = idKardex;
        this.tipoMovimiento = tipoMovimiento;
        this.cantidad = cantidad;
        this.fechaRegistro = fechaRegistro;
        this.inventario = inventario;
    }

    // Registra en el kardex el saldo que quedo en el inventario tras el movimiento
    public void registrarMovimiento() {
        saldoFinal = inventario.getStockActual();
    }

    public int getIdKardex() {
        return idKardex;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getSaldoFinal() {
        return saldoFinal;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public InventarioStock getInventario() {
        return inventario;
    }
}