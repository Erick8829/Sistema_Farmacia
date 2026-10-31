
package Model;

import App.dbConnection;
import java.sql.CallableStatement;

public class Categoria {
    private int idCategoria;
    private String nombreCategoria;
    private String descripcion;

    public Categoria() {
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void insertarCategoria( String paraNombreCate, String paraDescripcion){
        
        dbConnection objeto_conexion=  new dbConnection();
        
        String consulta="INSERT INTO categoria (nombreCategoria, descripcion) VALUES (?, ?);";
        
        try{
            CallableStatement cs = objeto_conexion.conectar().prepareCall(consulta);
            cs.setString(1, paraNombreCate);
            cs.setString(2, paraDescripcion);
            
            cs.execute();
            
            System.out.println("¡Categoría guardada con éxito!");
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
