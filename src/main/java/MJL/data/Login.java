package MJL.data;

import java.sql.SQLException;
import javax.swing.*;

public class Login extends MJLKoneksi1{
    public static String login_user = null;

    public boolean login(String username, String password){
        query = "SELECT * FROM `account` WHERE `username` = ? AND `sandi` = ?";
        try {
            preparedStatement = getConnection().prepareStatement(query);

            preparedStatement.setNString(1, username);
            preparedStatement.setNString(2, password);
            resultSet = preparedStatement.executeQuery();

            if(resultSet.next())
            {
                login_user = username;
                return true;
            }

            else if(username.equals("")&&password.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Nama Pengguna dan Kata Sandi tidak boleh kosong","Perhatian",JOptionPane.ERROR_MESSAGE);
                return false;
            }

            else if(!(username.equals(""))&&password.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Kata sandi tidak boleh kosong","Perhatian",JOptionPane.ERROR_MESSAGE);
                return false;
            }

            else if(username.equals("")&&!(password.equals("")))
            {
                JOptionPane.showMessageDialog(null, "Nama pengguna tidak boleh kosong","Perhatian",JOptionPane.ERROR_MESSAGE);
                return false;
            }

            else{
                JOptionPane.showMessageDialog(null, "Username atau password salah", "Kesalahan Masuk", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    public boolean admin(String username){
        query = "SELECT * FROM `account` WHERE `username` = " + "'" + username + "'" + " AND `role` = 'admin'; ";
        try {
            preparedStatement = getConnection().prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }
}