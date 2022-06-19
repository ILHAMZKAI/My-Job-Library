/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MJL.data;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MJLKoneksi1 {
    public PreparedStatement preparedStatement;
    public Statement statement;
    public ResultSet resultSet;
    public String query;
    
    public Connection getConnection(){
        Connection conn = null;
        MysqlDataSource dataSource = new MysqlDataSource();
        String servername = "localhost";
        dataSource.setServerName(servername);
        String username = "root";
        dataSource.setUser(username);
        String dbname = "db";
        dataSource.setDatabaseName(dbname);
        int portnumber = 3306;
        dataSource.setPortNumber(portnumber);
        String password = "";
        dataSource.setPassword(password);
        try {
            conn = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + MJLKoneksi1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}