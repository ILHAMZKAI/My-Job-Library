package MJL.data;

import javax.swing.*;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.Random;

public class Pendaftaran extends MJLKoneksi1{
    //Mengambil_jumlah_pendaftar
    public int get_jumlah_pendaftar(){
        int jumlah = 0;
        query = "SELECT COUNT(*) FROM `daftar`;";
        try {
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(query);
            resultSet.next();
            jumlah = resultSet.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jumlah;
    }

    //Mengambil_data_pendaftaran
    public String[][] get_data_pendaftaran(){
        int i = 0;
        String[][] data_pendaftar = new String[get_jumlah_pendaftar()][14];
        try{
            query = "SELECT * FROM `daftar`";
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                data_pendaftar[i][0] =  resultSet.getString("nomor");
                data_pendaftar[i][1] =  resultSet.getString("nama");
                data_pendaftar[i][2] =  resultSet.getString("tempatLahir");
                data_pendaftar[i][3] =  resultSet.getString("tanggalLahir");
                data_pendaftar[i][4] =  resultSet.getString("kelamin");
                data_pendaftar[i][5] =  resultSet.getString("alamat");
                data_pendaftar[i][6] =  resultSet.getString("agama");
                data_pendaftar[i][7] =  resultSet.getString("statusPernikahan");
                data_pendaftar[i][8] =  resultSet.getString("pengalaman");
                data_pendaftar[i][9] =  resultSet.getString("lulusan");
                data_pendaftar[i][10] =  resultSet.getString("telepon");
                data_pendaftar[i][11] =  resultSet.getString("namaPerusahaan");
                data_pendaftar[i][12] =  resultSet.getString("foto");
                data_pendaftar[i][13] =  resultSet.getString("status");
                i++;
            }
        }catch (Exception ex) {
            System.out.println(ex);
        }
        return data_pendaftar;
    }

    //Input pendaftar kerja
    public boolean verify_pendaftar(String vname, String vphone, String vcomp){
        if(vname.trim().equals("") || vphone.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Satu atau beberapa kolom tidak boleh kosong","Perhatian",JOptionPane.ERROR_MESSAGE);
            return false;
        }else if (vcomp.trim().equals("Pilih...")){
            JOptionPane.showMessageDialog(null, "Kolom pilihan harus dipilih","Perhatian",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            return true;
        }
    }

    public boolean verify_daftar_kerja(String[] data_register){
        for (String i : data_register){
            if (i.trim().equals("")){
                JOptionPane.showMessageDialog(null, "Satu atau beberapa kolom tidak boleh kosong","Perhatian",JOptionPane.ERROR_MESSAGE);
                return false;
            } else if (i.trim().equals("Pilih...")){
                JOptionPane.showMessageDialog(null, "Kolom pilihan harus dipilih", "Perhatian",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public int generate_nomor_pendaftaran() {
        Random r = new Random();
        return r.nextInt(99999);
    }

    public void daftar_kerja(String username ,String[] data_register){
        if (verify_daftar_kerja(data_register)) {
            query = "INSERT INTO `daftar`(`nomor`,`username`, `nama`, `tempatLahir`, `tanggalLahir`, `kelamin`, `alamat`, " +
                    "`agama`, `statusPernikahan`, `pengalaman`, `lulusan`, `telepon`, `namaPerusahaan`, `foto`) " +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            int opsi = JOptionPane.showConfirmDialog(null, "Data yang diunggah tidak dapat diubah, apakah Anda yakin?", "Perhatian",JOptionPane.ERROR_MESSAGE);
            if(opsi == JOptionPane.YES_OPTION)
            {
                try {
                    preparedStatement = getConnection().prepareStatement(query);
                    preparedStatement.setInt(1, generate_nomor_pendaftaran());
                    preparedStatement.setString(2, username);
                    preparedStatement.setString(3, data_register[0]);
                    preparedStatement.setString(4, data_register[1]);
                    preparedStatement.setString(5, data_register[2]);
                    preparedStatement.setString(6, data_register[3]);
                    preparedStatement.setString(7, data_register[4]);
                    preparedStatement.setString(8, data_register[5]);
                    preparedStatement.setString(9, data_register[6]);
                    preparedStatement.setString(10, data_register[7]);
                    preparedStatement.setString(11, data_register[8]);
                    preparedStatement.setString(12, data_register[9]);
                    preparedStatement.setString(13, data_register[10]);
                    preparedStatement.setString(14, data_register[11]);
                    if(preparedStatement.executeUpdate() !=0){
                        JOptionPane.showMessageDialog(null, "Data berhasil diunggah","Pemberitahuan",JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}


