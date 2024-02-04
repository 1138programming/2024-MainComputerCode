package MainComputerCode.Database;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.json.JSONArray;
import java.sql.*;



public class DatabaseManager {

    private String json = "";
    private JSONArray jObject = null;
    private Connection conn = null;
    public DatabaseManager () {
        try {
        
            Properties connectionProps = new Properties();
            connectionProps.put("user", "root");
            connectionProps.put("password", "1138");
            conn = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/1138scapp",
                connectionProps);
            
        }
        catch(SQLException ex) {
                System.err.println("Unable to connect to database; error = ");
                ex.printStackTrace();
                
    
        }

        
    }

    public void addMatch(int BAMatchID, String Description, String CreationDate ) {
        String insert = "Insert into scmatch (Description, BAMatchId, creation_date) values (?,?,Date(?))";

        try (PreparedStatement  stmt = conn.prepareStatement(insert)) {
            conn.setAutoCommit(false);
            stmt.setString(1,Description);
            stmt.setInt(1,BAMatchID);
            stmt.setString(3,CreationDate);
            int affectedrows = stmt.executeUpdate();
            
            System.out.println(affectedrows);
            

          } 
          catch (SQLException e) {
            System.err.println("Error inserting data; error =");
            e.printStackTrace();
            System.err.println("SQLState: " +
            ((SQLException)e).getSQLState());
          }
    }

    public void addSubmission(int MatchID, int DatapointID,  String firstnName, String lastName, int team, String CreationDate  ) {

    }

    public void proccessSubmissions() {

    }
}