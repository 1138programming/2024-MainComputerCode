package MainComputerCode;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;

import org.json.JSONObject;

import MainComputerCode.Database.DatabaseManager;

import java.sql.*;



public class MatchScheduler { 
    private String BaMatchID = "0";
    private String json = "";
    private String subId = "";
    private static  DatabaseManager database = new DatabaseManager();
    private DirectoryStream stream;
    private  FileReader fileReader;





    public void startMath() { 

    } //low priorty

    public void PopulateMatchSchedule() {

    } // low priority

    public void startMatch(String BAMatchID) {

    }

    public void proccsessData() {
        try {
            // FileReader Class used
            
           
            File file = new File("JSON/Saves");
            File[] arr = file.listFiles();

            for (int j = 0; j < arr.length; j++) {
                
                fileReader = new FileReader("JSON/Saves/" + arr[j].getName()); 
                
    
                int i;
                // Using read method
                while ((i = fileReader.read()) != -1) {
                    json += (char)i;
                }

                System.out.println(json);
                System.out.println(" ");


                
            }

            database.addSubmission(1,"hello7","gergory","schultz",1138);

    
    
            
            // JSONArray jsonArray = CDL.rowToJSONArray(new JSONTokener(json));        
            // System.out.println(jsonArray);
            fileReader.close();
            
        }
        catch (Exception e) {
                System.err.println("Unable to get JSON data; error = ");
                e.printStackTrace();
            }
           
    
    }



}