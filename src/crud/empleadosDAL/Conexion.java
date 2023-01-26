/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.empleadosDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PERSONAL
 */
public class Conexion {
    String strConexionBD = "jdbc:sqlite:C:/Users/PERSONAL/Documents/NetBeansProjects/crud/src/crud.db";
    Connection conn = null;

    // Se crea constructor para conectar String de conexión ruta
    public Conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionBD);
            
            System.out.println("Conexión establecida");
        } catch (Exception e) {
            System.out.println("Error de conexión" + e);
        }
    }
    
    // Método para insertar datos en Tabla
    public int ejecutarSentenciaSQL(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            pstm.close();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    // Método para consultar registros
    public ResultSet consultarRegistros(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
