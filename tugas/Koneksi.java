package tugas;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Koneksi {

    public static void main(String[] args) {

        Koneksi tesKoneksi = new Koneksi();
        tesKoneksi.koneksi();
        // TODO code application logic here
    }
    Connection con = null;
    String StatusKoneksi;

    public void koneksi() {
        try {
            String connectUrl = "jdbc:mysql://localhost:3306/mahas";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(connectUrl, user, password);
            //JOptionPane.showMessageDialog(null, "Konekkkk kuuyyy");
            StatusKoneksi = "Alhamdulillah Udah Nyambung.... ";
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, e);
            StatusKoneksi = "Astagfirulloh belum nyambung...";
           // System.exit(0);
        }
    }
}
