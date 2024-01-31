package MainComputerCode.Database;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.json.JSONObject;
import java.sql.*;



public class Database {
    private String json = "";
    private JSONObject jObject = null;
    
    public Connection getConnection()  {
        try {
        // Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "1138");
        conn = DriverManager.getConnection(
            "jdbc:mariadb://localhost:3306/1138scapp",
            connectionProps);
        return conn;
        }
        catch(SQLException ex) {
            System.err.println("Unable to connect to Database; error = ");
            ex.printStackTrace();
            return null;

        }
        // catch (ClassNotFoundException e) {
        //     System.err.println("Database Driver Classpath error = ");
        //     e.printStackTrace();
        //     return null;
        // }
    }
    public void printJson() {
        try {
        // FileReader Class used
        FileReader fileReader = new FileReader("JSON/Saves/Test.json"); 

        int i;
            // Using read method
        while ((i = fileReader.read()) != -1) {
            json += (char)i;
        }
        jObject = new JSONObject(json);

        String aSpeakerScore = jObject.getString("autonSpeakerScored");
        System.out.println("autonSpeakerScored");
        System.out.println(aSpeakerScore);

        System.out.println(json);
        
        // JSONArray jsonArray = CDL.rowToJSONArray(new JSONTokener(json));        
        // System.out.println(jsonArray);
        System.out.println(json);
        fileReader.close();
        
    }
    catch (Exception e) {
            System.err.println("Unable to get JSON data; error = ");
            e.printStackTrace();
        }
       

    }

    
    
}
