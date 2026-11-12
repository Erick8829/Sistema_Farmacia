package Model;

public class InventarioStock {

    private int idInventario;
    private int stockActual;
    private int stockMinimo;
    private Lote lote;
    private Almacen almacen;

    public InventarioStock(int idInventario, int stockActual, int stockMinimo, Lote lote, Almacen almacen) {
        this.idInventario = idInventario;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.lote = lote;
        this.almacen = almacen;
    }

    // Descuenta unidades solo si hay suficientes; devuelve si se pudo descontar
    public boolean descontarStock(int cant) {
        if (cant > 0 && cant <= stockActual) {
            stockActual -= cant;
            return true;
        }
        return false;
    }

    public void reponerStock(int cant) {
        if (cant > 0) {
            stockActual += cant;
        }
    }

    public int getStockActual() {
        return stockActual;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public Lote getLote() {
        return lote;
    }

    public Almacen getAlmacen() {
        return almacen;
    }
}