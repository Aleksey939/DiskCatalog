package org.dao;

import org.db.DataSource;
import org.db.SqlDataSource;
import org.entity.Disk;
import org.entity.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDao {
    DataSource dataSource;

    public UserDao() {
        dataSource = new SqlDataSource();
        Connection con = dataSource.getConnection();
        try {
            Statement stmt = con.createStatement();
            stmt.execute("USE Diskdb");
            stmt.execute("CREATE TABLE  IF NOT EXISTS User (Id INT AUTO_INCREMENT PRIMARY KEY," +
                    "login VARCHAR(255) NOT NULL," +
                    "email VARCHAR(255) NOT NULL," +
                    "password VARCHAR(255) NOT NULL," +
                    "isAdmin boolean not null default 0 " +
                    ");");



        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void save(User user) {

        dataSource = new SqlDataSource();
        Connection con = dataSource.getConnection();

        try {


            Statement pstmt = con.createStatement();
            pstmt.execute("USE diskdb");
           // System.out.println("INSERT INTO disk(title,album) values ('"+disk.getTitle()+"','"+disk.getTitle()+"')");
            pstmt.execute("INSERT INTO user(login,email,password) values ('"+user.getLogin()+"','"+user.getEmeil()+"','"+user.getPassword()+"')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void update(User user) {

    }


    public Disk findById(int id) {
        return null;
    }


    public List<Disk> findAll() {
        return null;
    }


    public void delete(int id) {

    }
}
