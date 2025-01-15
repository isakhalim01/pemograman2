/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Delete {
    Koneksi konek = new Koneksi();
    
    void delete(String nim){
        konek.koneksi();
        try {
            java.sql.Statement update = konek.con.createStatement();
            //menghapus data berdasarkan nim mahasiswa
            String sql = "delete from mahasiswa where nim = '" + nim +"'";
            update.executeUpdate(sql);
            
             JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            //update.close;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    } 
}
