package conexao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    public Connection conectaBD(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3307/despachante?user=root&password=usbw";
        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }
}
