package org.dao;

import org.db.SqlDataSource;
import org.db.DataSource;
import org.entity.Disk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DiskDao {
    DataSource dataSource;

    public DiskDao() {
        dataSource = new SqlDataSource();
        Connection con = dataSource.getConnection();
        try {
            Statement stmt = con.createStatement();
            stmt.execute("CREATE DATABASE IF NOT EXISTS Diskdb  ");
            stmt.execute("USE Diskdb");
            stmt.execute("CREATE TABLE  IF NOT EXISTS User (Id INT AUTO_INCREMENT PRIMARY KEY," +
                    "login VARCHAR(255) NOT NULL," +
                    "email VARCHAR(255) NOT NULL," +
                    "password VARCHAR(255) NOT NULL," +
                    "isAdmin boolean not null default false " +
                    ");");
            stmt.execute("CREATE TABLE  IF NOT EXISTS Disk (" +
                    "    Id INT AUTO_INCREMENT  PRIMARY KEY," +
                    "    Title VARCHAR(255) NOT NULL," +
                    "    Album VARCHAR(255)," +
                    "UserId INT,"+
                    "FOREIGN KEY (`UserId`) REFERENCES `User` (`Id`));");
            // "    UserId INT FOREIGN KEY REFERENCES User(Id)" +


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void save(Disk disk) {

        dataSource = new SqlDataSource();
        Connection con = dataSource.getConnection();

        try {


            //PreparedStatement pstmt = con.prepareStatement("INSERT INTO Disk(title,album) values (?)");
            //pstmt.execute("USE diskdb");

           // PreparedStatement pstmt = con.prepareStatement("INSERT INTO Disk(title,album) values ('test1','test2')");
            //pstmt.setString(1, disk.getDisk());
            //System.out.println(disk.getDisk());
            //pstmt.execute();

            Statement pstmt = con.createStatement();
            pstmt.execute("USE diskdb");
            System.out.println("INSERT INTO disk(title,album) values ('"+disk.getTitle()+"','"+disk.getTitle()+"')");
            pstmt.execute("INSERT INTO disk(title,album) values ('"+disk.getTitle()+"','"+disk.getTitle()+"')");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void update(Disk task) {

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
