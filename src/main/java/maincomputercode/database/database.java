package MainComputerCode.Database;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.*;


public class Database {
    private String json;
    public void printjson() {
        try {
        // FileReader Class used
        FileReader fileReader
            = new FileReader("JSON_Saves/Test.json");
            
        json = new String();

        int i;
 
            // Using read method
        while ((i = fileReader.read()) != -1) {
            json += (char)i;
        }

        System.out.println(json);
        
        JSONArray jsonArray = CDL.rowToJSONArray(new JSONTokener(json));        
        System.out.println(jsonArray);
        
    }
    catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
