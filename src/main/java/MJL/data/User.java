package MJL.data;

import java.sql.SQLException;

public class User extends Pendaftaran{
    //megambil jumlah user mendaftar
    public int get_jumlah_pendaftar_user(String username){
        int jumlah = 0;
        query = "SELECT COUNT(*) FROM `daftar` WHERE `username` = '" + username + "';";
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

    //mengambil data pendaftaram user
    public String[][] get_data_pendaftaran_user(String username){
        int i = 0;
        String[][] data_pendaftar = new String[get_jumlah_pendaftar_user(username)][4];
        try{
            query = "SELECT * FROM `daftar` WHERE `username` = '" + username + "';";
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                data_pendaftar[i][0] =  resultSet.getString("nomor");
                data_pendaftar[i][1] =  resultSet.getString("nama");
                data_pendaftar[i][2] =  resultSet.getString("namaPerusahaan");
                data_pendaftar[i][3] =  resultSet.getString("status");
                i++;
            }
        }catch (Exception ex) {
            System.out.println(ex);
        }
        return data_pendaftar;
    }
}
