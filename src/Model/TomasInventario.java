package Model;

public class TomasInventario {

    private int idToma;
    private String fechaToma;
    private String estado;
    private Almacen almacen;

    public TomasInventario(int idToma, String fechaToma, String estado, Almacen almacen) {
        this.idToma = idToma;
        this.fechaToma = fechaToma;
        this.estado = estado;
        this.almacen = almacen;
    }

    public int getIdToma() {
        return idToma;
    }

    public String getFechaToma() {
        return fechaToma;
    }

    public String getEstado() {
        return estado;
    }

    public Almacen getAlmacen() {
        return almacen;
    }
}