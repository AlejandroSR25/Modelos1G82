/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocinejungla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public final class BD {

    private static BD instancia;
    private String url = "jdbc:sqlite:src//data//baseDeDatos.db";
    private Connection connect = null;

    private BD() {
        // The following code emulates slow initialization.
        try {
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection(url);
            if (connect != null) {
                System.out.print("Conexion realizada");
            }
        } catch (Exception x) {

            System.out.print(x);
        }
    }

    public List<String> sala() {
        List<String> sillas = new ArrayList<String>();
        ResultSet result = null;
        
        try {
            PreparedStatement st = connect.prepareStatement("select Silla, Tipo, Estado from Cine1 where Funcion = '1'");
            result = st.executeQuery();
            while (result.next()) {
                sillas.add(result.getString("Silla"));
                sillas.add(result.getString("Tipo"));
                sillas.add(result.getString("Estado"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return sillas;
    }
    
    public List<String> cartelera() {
        List<String> cartelera = new ArrayList<String>();
        ResultSet result = null;
        
        try {
            PreparedStatement st = connect.prepareStatement("select Id, Nombre, Descripcion, Puntuación from Pelicula");
            result = st.executeQuery();
            while (result.next()) {
                cartelera.add(result.getString("Id"));
                cartelera.add(result.getString("Nombre"));
                cartelera.add(result.getString("Descripcion"));
                cartelera.add(result.getString("Puntuación"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return cartelera;
    }

    public static BD getInstance() {
        if (instancia == null) {
            instancia = new BD();
        }
        return instancia;
    }
}
