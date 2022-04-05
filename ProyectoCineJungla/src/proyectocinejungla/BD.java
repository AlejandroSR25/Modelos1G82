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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public final class BD {

    private static BD instancia;
    private String url = "jdbc:sqlite:src//data//baseDeDatos.db";
    private Connection connect = null;
    private Sesion sesion;

    private BD() {
        // The following code emulates slow initialization.
        try {
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection(url);
        } catch (Exception x) {

            System.out.print(x);
        }
    }

    public List<String> sala(int funcion, int cine) {
        List<String> sillas = new ArrayList<String>();
        ResultSet result = null;

        try {
            PreparedStatement st = connect.prepareStatement("select Silla, Tipo, Estado from Cine" + cine + " where Funcion =" + funcion);
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
            PreparedStatement st = connect.prepareStatement("select Nombre, Puntuacion from [Cine Jungla] where Id=" + id);
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

    public List<String> preciosComida(int id) {
        List<String> datos = new ArrayList<String>();
        ResultSet result = null;

        try {
            PreparedStatement st = connect.prepareStatement("select Id, Precio, [Cantidad Vendida] from [Comida] where Cine=" + id);
            result = st.executeQuery();
            while (result.next()) {
                datos.add(result.getString("Id"));
                datos.add(result.getString("Precio"));
                datos.add(result.getString("Cantidad Vendida"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return datos;
    }

    public void modifEstado(int cine, String estado, String silla, String funcion) {

        Statement stmt = null;

        try {
            stmt = connect.createStatement();
            //stmt.executeUpdate("update Cine1 set Estado='Ocupada' where Silla='1A4', Funcion='1';");
            stmt.executeUpdate("update Cine" + cine + " set Estado='" + estado + "' where Silla='" + silla + "' and Funcion='" + funcion + "';");
            connect.commit();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void modifComida(String id, String cantidad) {

        Statement stmt = null;

        try {
            stmt = connect.createStatement();
            //stmt.executeUpdate("update Cine1 set Estado='Ocupada' where Silla='1A4', Funcion='1';");
            stmt.executeUpdate("update Comida set [Cantidad Vendida]='" + cantidad + "' where Id='" + id + "';");
            connect.commit();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void Login(javax.swing.JTextField jtf, javax.swing.JPasswordField jpf, String person, javax.swing.JFrame frame) {
        boolean failed = true;
        switch (person) {
            case "User":
                try {
                PreparedStatement st = connect.prepareStatement("SELECT Correo, Contraseña, Id, Nombre FROM Cliente");
                ResultSet result = st.executeQuery();

                while (result.next()) {
                    String email = result.getString(1);
                    String pw = result.getString(2);
                    int id = result.getInt(3);
                    String nombre = result.getString(4);

                    if (jtf.getText().equals(email) && String.valueOf(jpf.getPassword()).equals(pw)) {

                        JLabel account_label = new JLabel();
                        account_label.setText("Logged as: " + nombre);
                        account_label.setFont(new java.awt.Font("Century Gothic", 1, 14));
                        account_label.setForeground(new java.awt.Color(102, 0, 0));
                        account_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                        MainPage.getEncabezado().add(account_label).setBounds(1680, 93, 200, 20);
                        MainPage.getFrame().setEnabled(true);

                        sesion = Sesion.getInstance();
                        Persona u = new Usuario(id);
                        u.rellenarDatos();
                        sesion.setPersona(u);
                        sesion.setLogged(true);
                        failed = false;

                        frame.dispose();
                    }
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            break;
            case "Employee":
                try {
                PreparedStatement st = connect.prepareStatement("SELECT Cedula, Contraseña, Id, Nombre FROM Empleado");
                ResultSet result = st.executeQuery();

                while (result.next()) {
                    int cedula = result.getInt(1);
                    String pw = result.getString(2);
                    int id = result.getInt(3);
                    String nombre = result.getString(4);

                    if (Integer.parseInt(jtf.getText()) == cedula && String.valueOf(jpf.getPassword()).equals(pw)) {

                        JLabel account_label = new JLabel();
                        account_label.setText("Logged as: " + nombre);
                        account_label.setFont(new java.awt.Font("Century Gothic", 1, 14));
                        account_label.setForeground(new java.awt.Color(102, 0, 0));
                        account_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                        MainPage.getEncabezado().add(account_label).setBounds(1680, 93, 200, 20);
                        MainPage.getFrame().setEnabled(true);

                        sesion = Sesion.getInstance();
                        Persona e = new Empleado(id);
                        e.rellenarDatos();
                        sesion.setPersona(e);
                        sesion.setLogged(true);
                        failed = false;

                        frame.dispose();
                    }
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            break;
        }
        if (failed == true) {
            JOptionPane.showMessageDialog(null, "Los datos introducidos son incorrectos");
        }

    }

    public List<String> fun(int funcion, int cine) {
        List<String> sillas = new ArrayList<String>();
        ResultSet result = null;

        try {
            PreparedStatement st = connect.prepareStatement("select Sala from Cine" + cine + " where Funcion =" + funcion);
            result = st.executeQuery();
            while (result.next()) {
                sillas.add(result.getString("Sala"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return sillas;
    }

    public List<String> pelicula(int pelicula) {
        List<String> funciones = new ArrayList<String>();
        ResultSet result = null;

        try {
            PreparedStatement st = connect.prepareStatement("select [Hora Funcion], Id from Funcion where Pelicula=" + pelicula);
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

    public List<String> solicitarDatosPersona(Persona p, int id) {
        List<String> datos_persona = new ArrayList<>();

        PreparedStatement st;

        switch (p.getClass().getName()) {
            case "proyectocinejungla.Usuario":
                
                try {
                st = connect.prepareStatement("SELECT Nombre, Correo, Contraseña, Puntos, [Tiempo Obtencion] FROM Cliente Where Id =" + id);
                ResultSet result = st.executeQuery();

                while (result.next()) {
                    datos_persona.add(result.getString(1));
                    datos_persona.add(result.getString(2));
                    datos_persona.add(result.getString(3));
                    datos_persona.add(result.getString(4));
                    datos_persona.add(result.getString(5));
                }

            } catch (SQLException ex) {
            }
            break;
            case "proyectocinejungla.Empleado":
                try {
                st = connect.prepareStatement("SELECT Nombre, Cedula, Contraseña, Cargo, [Fecha Inicio Contrato], Salario, Cine FROM Empleado Where Id =" + id);
                ResultSet result = st.executeQuery();
                while (result.next()) {
                    datos_persona.add(result.getString(1));
                    datos_persona.add(result.getString(2));
                    datos_persona.add(result.getString(3));
                    datos_persona.add(result.getString(4));
                    datos_persona.add(result.getString(5));
                    datos_persona.add(result.getString(6));
                    datos_persona.add(result.getString(7));
                }
            } catch (SQLException ex) {
            }
            break;
        }
        return datos_persona;
    }

    public boolean registrarUsuario(String nombre, String correo, String contraseña) {
        PreparedStatement st;
        boolean failed = false;
        try {
            st = connect.prepareStatement("SELECT Correo, Id FROM Cliente");
            ResultSet result = st.executeQuery();
            while (result.next()) {
                if (result.getString(1).equals(correo)) {
                    JOptionPane.showMessageDialog(null, "El correo ya se encuentra registrado");
                    failed = true;
                }
            }

            if (!failed) {
                try {
                    PreparedStatement pstmt = connect.prepareStatement("insert into Cliente(Nombre, Correo, Contraseña, Puntos, [Tiempo Obtencion]) values(?, ?, ?, ?, ?)");
                    pstmt.setString(1, nombre);
                    pstmt.setString(2, correo);
                    pstmt.setString(3, contraseña);
                    pstmt.setInt(4, 0);
                    pstmt.setInt(5, 0);
                    pstmt.executeUpdate();

//                    JLabel account_label = new JLabel();
//                    account_label.setText("Logged as: " + nombre);
//                    account_label.setFont(new java.awt.Font("Century Gothic", 1, 14));
//                    account_label.setForeground(new java.awt.Color(102, 0, 0));
//                    account_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//
//                    MainPage.getEncabezado().add(account_label).setBounds(1680, 93, 200, 20);
//                    MainPage.getFrame().setEnabled(true);

                } catch (SQLException ex) {
                }
            }

//            if (!failed) {
//                System.out.println("asdasd");
//                
//                PreparedStatement stid = connect.prepareStatement("SELECT Id FROM Cliente WHERE Correo= "+correo);
//                ResultSet rs = st.executeQuery();
//                while (rs.next()) {
//                    sesion = Sesion.getInstance();
//                    Persona u = new Usuario(rs.getInt(1));
//                    u.rellenarDatos();
//                    sesion.setPersona(u);
//                    sesion.setLogged(true);
//                }
//            }

        } catch (SQLException ex) {
        }
        return failed;
    }

    public static BD getInstance() {
        if (instancia == null) {
            instancia = new BD();
        }
        return instancia;
    }

    public Connection getConnect() {
        return this.connect;
    }
}
