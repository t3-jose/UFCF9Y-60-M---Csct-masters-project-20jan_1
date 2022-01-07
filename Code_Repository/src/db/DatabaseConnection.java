package db;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DatabaseConnection {
    
    public Statement stmt;
    public ResultSet res;
    public Connection conn;

    public DatabaseConnection(){
        
    }
    
    @SuppressWarnings("CallToThreadDumpStack")
    public Connection setConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/honeypot","root","123");
            System.out.println("connected");
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    public ResultSet getResult(String query, Connection conn){
        this.conn = conn;
        try{
        stmt = conn.createStatement();
        res = stmt.executeQuery(query);
        }catch(Exception e){
           
        }
    return res;
    }
    public static void main(String args[]){
        DatabaseConnection dbconn = new DatabaseConnection();
        dbconn.setConnection();
    }
    
}