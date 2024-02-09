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
import java.sql.*;



public class MatchScheduler { 
    private String BaMatchID = "0";
    private String json = "";
    private DirectoryStream stream;
    private  FileReader fileReader;




    public void startComp() { 

    } //low priorty

    public void getSchedule() {

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