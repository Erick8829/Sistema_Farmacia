package Dao;

import App.dbConnection;
import Model.Producto;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class ProductoDao {
    
    public ProductoDao(){
    }
    
    public boolean insertarProducto(String codigoBarra, String nombreComercial, String principioActivo, String presentacionMililitro, double precioReferencial, boolean requiereReceta, int idCategoria, int idLaboratorio) {

        // Consulta SQL para insertar el producto usando los IDs directos
        String sql = "INSERT INTO producto (codigoBarra, nombreComercial, principioActivo, presentacionMililitro, precioReferencial, requiereReceta, idCategoria, idLaboratorio) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        dbConnection objeto_conexion = new dbConnection();

        // Nota: Para un INSERT normal se suele usar PreparedStatement en lugar de CallableStatement, 
        // pero si te funciona prepareCall con tu versión, puedes mantenerlo o cambiarlo por prepareStatement.
        try (CallableStatement cs = objeto_conexion.conectar().prepareCall(sql)) {

            // Asignamos cada valor recibido por parámetro directamente en orden
            cs.setString(1, codigoBarra);
            cs.setString(2, nombreComercial);
            cs.setString(3, principioActivo);
            cs.setString(4, presentacionMililitro);
            cs.setDouble(5, precioReferencial);
            cs.setInt(6, idCategoria);
            cs.setInt(7, idLaboratorio);
            cs.setBoolean(8, requiereReceta);

            // Ejecutamos la inserción en la base de datos
            cs.executeUpdate();
            System.out.println("¡Producto registrado exitosamente!");
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
