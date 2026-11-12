package Model;

public class Almacen {

    private int idAlmacen;
    private String nombreAlmacen;
    private String ubicacion;
  
    private int stockActual;

    public Almacen(int idAlmacen, String nombreAlmacen, String ubicacion) {
        this.idAlmacen = idAlmacen;
        this.nombreAlmacen = nombreAlmacen;
        this.ubicacion = ubicacion;
        this.stockActual = 0;
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

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}