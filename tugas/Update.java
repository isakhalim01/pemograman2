/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Update {

    Koneksi konek = new Koneksi();

    public void update(String nim, String nama, String alamat, String gender) {

        try {
            Koneksi konek = new Koneksi();
            konek.koneksi();

            Statement update = konek.con.createStatement();
            konek.koneksi();
            update = konek.con.createStatement();
            String sql = "update mahasiswa set gender='" + gender + "'where nim='" + nim + "'";
            update.executeUpdate(sql);
            update.close();

        } catch (Exception er) {
            JOptionPane.showMessageDialog(null, er);
        }
        try {
            Koneksi konek = new Koneksi();
            konek.koneksi();

            Statement update = konek.con.createStatement();
            konek.koneksi();
            update = konek.con.createStatement();
            String sql = "update mahasiswa set alamat='" + alamat + "'where nim='" + nim + "'";
            update.executeUpdate(sql);
            update.close();

        } catch (Exception er) {
            JOptionPane.showMessageDialog(null, er);
        }
        try {
            Koneksi konek = new Koneksi();
            konek.koneksi();

            Statement update = konek.con.createStatement();
            konek.koneksi();
            update = konek.con.createStatement();
            String sql = "update mahasiswa set nim='" + nim + "'where nama='" + nama + "'";
            update.executeUpdate(sql);
            update.close();

        } catch (Exception er) {
            JOptionPane.showMessageDialog(null, er);
        }
        try {
            Koneksi konek = new Koneksi();
            konek.koneksi();

            Statement update = konek.con.createStatement();
            konek.koneksi();
            update = konek.con.createStatement();
            String sql = "update mahasiswa set nama='" + nama + "'where nim='" + nim + "'";
            update.executeUpdate(sql);
            update.close();

            JOptionPane.showMessageDialog(null, "Berhasil update");
        } catch (Exception er) {
            JOptionPane.showMessageDialog(null, er);
        }
    }
}
