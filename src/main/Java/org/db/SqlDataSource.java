package org.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDataSource implements DataSource{

    Connection connection;

    public SqlDataSource() {

    }

    @Override
    public Connection getConnection() {
        String connectionString= "jdbc:mysql://localhost:3306/" +
                "?characterEncoding=UTF-8" +
                "&useUnicode=true" +
                //"&useJDBCCompliantTimezoneShift=true" +
                //"&useLegacyDatetimeCode=false" +
                "&serverTimezone=Europe/Kiev";
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(connectionString,"root","");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

}
