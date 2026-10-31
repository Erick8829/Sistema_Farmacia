package App;

import java.sql.*;

public class dbConnection {

    // video de guia https://youtu.be/mhDqL2SUXJc
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3306/farmacontrol_pos";
    
    public static Connection conectar(){
        Connection con=null;
        try{
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion exitosa");
        } catch (SQLException e){
            e.printStackTrace();
        }
        
        return con;
    }
}
