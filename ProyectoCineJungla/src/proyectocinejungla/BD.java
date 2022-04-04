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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
    
    public List<String> cine(int id) {
        List<String> datos = new ArrayList<String>();
        ResultSet result = null;

        try {
            PreparedStatement st = connect.prepareStatement("select Nombre, Puntuacion from Cine jungla where Id="+id);
            result = st.executeQuery();
            while (result.next()) {
                datos.add(result.getString("Nombre"));
                datos.add(result.getString("Puntuacion"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return datos;
    }

    public void modifEstado(String estado, String silla, String funcion) {
        
        Statement stmt = null;

        try {
            stmt = connect.createStatement();
            stmt.executeUpdate("update Cine1 set Estado='" + estado + "' where Silla='1A2', Funcion='1';");
            connect.commit();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void Login(javax.swing.JTextField jtf, javax.swing.JPasswordField jpf, String person){
        switch (person) {
            case "User":
                try {
                    PreparedStatement st = connect.prepareStatement("SELECT Correo, Contraseña FROM Cliente");
                    ResultSet result = st.executeQuery();

                    while (result.next()) {
                        String email = result.getString(1);
                        String pw = result.getString(2);

                        if (jtf.getText().equals(email) && String.valueOf(jpf.getPassword()).equals(pw)) {
                            System.out.println("Exito");
                        } else {
                            JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectas");
                        }
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
                break;
            case "Employee":
                try {
                    PreparedStatement st = connect.prepareStatement("SELECT Cedula, Contraseña FROM Empleado");
                    ResultSet result = st.executeQuery();

                    while (result.next()) {
                        String cc = result.getString(1);
                        String pw = result.getString(2);

                        if (jtf.getText().equals(cc) && String.valueOf(jpf.getPassword()).equals(pw)) {
                            System.out.println("Exito");
                        } else {
                            JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectas");
                        }
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
                break;
        }
        
    }
    
    
    public List<String> pelicula(int pelicula) {
        List<String> funciones = new ArrayList<String>();
        ResultSet result = null;

        try {
            PreparedStatement st = connect.prepareStatement("select [Hora Funcion], Id from Funcion where Pelicula="+pelicula);
            result = st.executeQuery();
            while (result.next()) {
                funciones.add(result.getString("Hora Funcion"));
                funciones.add(result.getString("Id"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return funciones;
    }
    

    public static BD getInstance() {
        if (instancia == null) {
            instancia = new BD();
        }
        return instancia;
    }
    
    public Connection getConnect(){
        return this.connect;
    }
}
