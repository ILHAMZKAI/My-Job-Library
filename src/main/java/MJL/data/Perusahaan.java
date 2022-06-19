package MJL.data;

import javax.swing.*;
import java.sql.SQLException;

public class Perusahaan extends MJLKoneksi1{
    //Perusahaan
    public int get_jumlah_perusahaan(){
        int jumlah = 0;
        query = "SELECT COUNT(*) FROM `perusahaan`;";
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

    public String[][] get_data_perusahaan(){
        int i = 0;
        String[][] data_perusahaan = new String[get_jumlah_perusahaan()][4];
        query = "SELECT * FROM `perusahaan`";
        try {
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                data_perusahaan[i][0] = resultSet.getString("id");
                data_perusahaan[i][1] = resultSet.getString("nama");
                data_perusahaan[i][2] = resultSet.getString("status");
                data_perusahaan[i][3] = resultSet.getString("informasi");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data_perusahaan;
    }

    public String[] get_nama_perusahaan(){
        int i = 0;
        String[] nama_perusahaan = new String[get_jumlah_perusahaan()];
        query = "SELECT * FROM `perusahaan`";
        try {
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                nama_perusahaan[i] = resultSet.getString("nama");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nama_perusahaan;
    }

    public int get_jumlah_perusahaan_buka(){
        int jumlah = 0;
        query = "SELECT COUNT(*) FROM `perusahaan` WHERE `status` = 'Buka';";
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

    public String[] get_perusahaan_buka(){
        int i = 0;
        String[] nama_perusahaan = new String[get_jumlah_perusahaan_buka()];
        query = "SELECT * FROM `perusahaan` WHERE `status` = 'Buka'";
        try {
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                nama_perusahaan[i] = resultSet.getString("nama");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nama_perusahaan;
    }

    public boolean cekcode(String code){
        query = "SELECT * FROM `perusahaan` WHERE id = ?";
        try {
            preparedStatement = getConnection().prepareStatement(query);
            preparedStatement.setString(1, code);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                JOptionPane.showMessageDialog(null, "Kode telah digunakan","Perhatian", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean verify(String nama_perusahaan, String vstat, String vcode, String vdesc){
        if(vstat.trim().equals("Chose...") || vcode.trim().equals("") || vdesc.trim().equals("") || nama_perusahaan.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Satu atau beberapa kolom tidak boleh kosong","Perhatian",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else{
            return true;
        }
    }
}