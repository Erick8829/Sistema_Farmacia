
package Model;

public class Producto {
    private int idProducto;
    private String codigoBarra;
    private String nombreComercial;
    private String principioActivo;
    private String presentacionMililitro;
    private double precioReferencial;
    private int id_categoria;
    private int id_laboratorio;
    private boolean requiereReceta;

    public Producto(int idProducto, String codigoBarra, String nombreComercial, String principioActivo, String presentacionMililitro, double precioReferencial, int id_categoria, int id_laboratorio, boolean requiereReceta) {
        this.idProducto = idProducto;
        this.codigoBarra = codigoBarra;
        this.nombreComercial = nombreComercial;
        this.principioActivo = principioActivo;
        this.presentacionMililitro = presentacionMililitro;
        this.precioReferencial = precioReferencial;
        this.id_categoria = id_categoria;
        this.id_laboratorio = id_laboratorio;
        this.requiereReceta = requiereReceta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getPresentacionMililitro() {
        return presentacionMililitro;
    }

    public void setPresentacionMililitro(String presentacionMililitro) {
        this.presentacionMililitro = presentacionMililitro;
    }

    public double getPrecioReferencial() {
        return precioReferencial;
    }

    public void setPrecioReferencial(double precioReferencial) {
        this.precioReferencial = precioReferencial;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_laboratorio() {
        return id_laboratorio;
    }

    public void setId_laboratorio(int id_laboratorio) {
        this.id_laboratorio = id_laboratorio;
    }

    public boolean isRequiereReceta() {
        return requiereReceta;
    }

    public void setRequiereReceta(boolean requiereReceta) {
        this.requiereReceta = requiereReceta;
    }

    
    
}
