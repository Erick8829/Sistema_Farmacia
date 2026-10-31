package Principal;

import Dao.ProductoDao;
import Model.Categoria;

public class Principal {

    public static void main(String[] args) {
        ProductoDao productodao= new ProductoDao();
        // de prueba
        productodao.insertarProducto("123", "nombrecomercial", "principioactivo", "presentacionmili", 10.2, true, 1, 1);

    }
    
}
