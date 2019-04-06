package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private Connection conn;
    private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

    private DatabaseConnectionManager() {
    }



    public DatabaseConnectionManager getManagerInstance(){
        return connectionInstance;
    }

    public void connect() throws SQLException
    {
        conn = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Established Database Connection...");
    }

    public void disconnect() throws SQLException{
        conn.close();
        System.out.println("Disconnected from Database...");
    }









}
