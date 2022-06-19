package MJL.data;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaftarAkun extends Login {
    public boolean cekuser(String username) {
        query = "SELECT * FROM account WHERE username = ?";
        try {
            preparedStatement = getConnection().prepareStatement(query);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Username telah digunakan", "Perhatian", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    public boolean verifikasi(String vuser, String vaddress, String vphone, String vpass, String vrpass) {
        if (vuser.trim().equals("") || vaddress.trim().equals("") || vphone.trim().equals("") || vpass.trim().equals("") || vrpass.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Satu atau beberapa kolom tidak boleh kosong", "Perhatian", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (vpass.length() < 8) {
            JOptionPane.showMessageDialog(null, "Kata sandi harus minimal 8 karakter", "Perhatian", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (vpass.length() < 8) {
            JOptionPane.showMessageDialog(null, "Kata sandi harus minimal 8 karakter", "Perhatian", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!vpass.equals(vrpass)) {
            JOptionPane.showMessageDialog(null, "Kata sandi tidak cocok", "Perhatian", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    public boolean Register(String vuser, String vaddress, String vphone, String vpass, String vrpass, String gender) {
        if (verifikasi(vuser, vaddress, vphone, vpass, vrpass)) {
            if (!cekuser(vuser)) {
                PreparedStatement statement;
                query = "INSERT INTO `account`(`username`, `jenisKelamin`, `alamat`, `telepon`, `sandi`) VALUES (?,?,?,?,?)";
                try {
                    statement = getConnection().prepareStatement(query);
                    statement.setString(1, vuser);
                    statement.setString(2, gender);
                    statement.setString(3, vaddress);
                    statement.setString(4, vphone);
                    statement.setString(5, vpass);

                    if (statement.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(null, "Akun Anda berhasil dibuat", "Pemberitahuan", JOptionPane.ERROR_MESSAGE);
                        return true;
                    }
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        return false;
    }
}