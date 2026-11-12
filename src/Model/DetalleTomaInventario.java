package Model;

public class DetalleTomaInventario {

    private int idDetalleToma;
    private int stockSistema;
    private int stockFisico;
    private int diferencia;
    private InventarioStock inventario;

    public DetalleTomaInventario(int idDetalleToma, int stockSistema, int stockFisico, InventarioStock inventario) {
        this.idDetalleToma = idDetalleToma;
        this.stockSistema = stockSistema;
        this.stockFisico = stockFisico;
        this.inventario = inventario;
        calcularDiferencia();
    }

    // Diferencia entre el conteo fisico y el stock del sistema (negativa = faltante)
    public int calcularDiferencia() {
        diferencia = stockFisico - stockSistema;
        return diferencia;
    }

    public int getIdDetalleToma() {
        return idDetalleToma;
    }

    public int getStockSistema() {
        return stockSistema;
    }

    public int getStockFisico() {
        return stockFisico;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public InventarioStock getInventario() {
        return inventario;
    }
}