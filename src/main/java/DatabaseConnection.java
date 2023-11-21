package src.main.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:oracle:thin:@oracle.scs.ryerson.ca:1521:orcl";
    private static final String USER = "eyilmaz";
    private static final String PASS = "07238034";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
