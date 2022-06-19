package MJL.data;

import javax.swing.*;
import java.sql.SQLException;

public class Admin extends Pendaftaran{
    Perusahaan perusahaan = new Perusahaan();

    //Update status pendaftar
    public void update_status_pendaftar(String vname, String vphone, String status, String vcomp, String pilihan){
        query = "UPDATE `daftar` SET `nama`= ?,`telepon`=?,`namaPerusahaan`=?, `status`=? WHERE `nomor`=?";
        if (verify_pendaftar(vname, vphone, vcomp)){
            try {
                preparedStatement = getConnection().prepareStatement(query);
                preparedStatement.setString(1, vname);
                preparedStatement.setString(2, vphone);
                preparedStatement.setString(3, pilihan);
                preparedStatement.setString(4, status);
                preparedStatement.setString(5, vcomp);
                if(preparedStatement.executeUpdate()>0)
                    JOptionPane.showMessageDialog(null, "Pembaruan berhasil", "Perhatian", JOptionPane.ERROR_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Pembaharuan gagal", "Perhatian", JOptionPane.ERROR_MESSAGE);
                preparedStatement.close();

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    //Pendaftaran
    public Object[] cek_pendaftar(String nomor_register) {
        String[] data_pendaftar = new String[4];
        query = "SELECT * FROM `daftar` WHERE nomor = ?";
        try {
            preparedStatement = getConnection().prepareStatement(query);
            preparedStatement.setNString(1, nomor_register);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                data_pendaftar[0] = resultSet.getString("nomor");
                data_pendaftar[1] = resultSet.getString("nama");
                data_pendaftar[2] = resultSet.getString("telepon");
                data_pendaftar[3] = resultSet.getString("namaPerusahaan");
                return new Object[]{true,data_pendaftar[0],data_pendaftar[1],data_pendaftar[2],data_pendaftar[3]};
            } else {
                JOptionPane.showMessageDialog(null, "Nomor registrasi tidak ditemukan", "Perhatian", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return new Object[]{false,null,null,null,null};
    }

    //Input_perusahaan
    public void input_data(String nama_perusahaan, String status, String codeString, String desc){
        if(perusahaan.verify(nama_perusahaan, status, codeString, desc)) {
            if(!perusahaan.cekcode(codeString)) {
                String compquery = "INSERT INTO `perusahaan`(`id`,`nama`, `status`, `informasi`) VALUES (?,?,?,?)";
                try {
                    preparedStatement = getConnection().prepareStatement(compquery);
                    preparedStatement.setString(1, codeString);
                    preparedStatement.setString(2, nama_perusahaan);
                    preparedStatement.setString(3, status);
                    preparedStatement.setString(4, desc);

                    if(preparedStatement.executeUpdate() !=0) {
                        JOptionPane.showMessageDialog(null, "Perusahaan berhasil dimasukkan","Pemberitahuan",JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
