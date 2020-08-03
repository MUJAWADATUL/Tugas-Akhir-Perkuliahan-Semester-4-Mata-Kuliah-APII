/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_10;

import javax.swing.JOptionPane;

/**
 *
 * @author Mujawa_
 */
public class update {

    Koneksi konek = new Koneksi();

    public void update(int NIM, String Nama, String Alamat, String JK) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_Nama = "Update Mahasiswa Set Nama = '" + Nama + "'Where NIM = '" + NIM + "'";
            String sql_Alamat = "Update Mahasiswa Set Alamat = '" + Alamat + "'where NIM = '" + NIM + "'";
            String sql_JK = "Update Mahasiswa Set JenisKelamin = '" + JK + "'Where NIM = '" + NIM + "'";
            String sql_NIM1 = "Update Mahasiswa Set NIM = '" + NIM + "'Where Nama = '" + Nama + "'";
            String sql_NIM2 = "Update Mahasiswa Set NIM = '" + NIM + "'Where Alamat = '" + Alamat + "'";

            statement.executeUpdate(sql_NIM1);
            statement.executeUpdate(sql_NIM2);
            statement.executeUpdate(sql_Nama);
            statement.executeUpdate(sql_Alamat);
            statement.executeUpdate(sql_JK);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
