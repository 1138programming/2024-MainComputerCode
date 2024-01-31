package MainComputerCode.APIRequests;

import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class TBA {
    public TBA() {
        // default constructor
    }
/**
 * @apiNote API Key already handled for you...
 * @param requestType
 * @param headers
 * @param values
 * @return null if error, API request if work
 */
    public String getRequest(String requestType, String[] headers, String[] values) {
        try {
            // ___ get data from TBA API ___
            // init request, will need to change
            HttpRequest.Builder builder = HttpRequest.newBuilder(new URI("https://www.thebluealliance.com/api/v3/" + requestType)).GET().header("X-TBA-Auth-Key", "");
            // if there are headers, use them...
            if (headers != null) {
                for(int i = 0; i < headers.length; i++) {
                    String header = headers[i];
                    // gets null if values is too small
                    String value = i >= values.length ? null : values[i];

                    builder.header(header, value);
                    System.out.println("Header: " + header + ", Value: " + value);
                }
            }
            HttpRequest request = builder.build();

            // make the client to get the request
            HttpClient requestClient = HttpClient.newHttpClient();
            // make the request using the client
            // WARNING- WILL NOT WORK UNDER JAVA 11
            HttpResponse<String> response = requestClient.send(request, BodyHandlers.ofString());

            return response.body();
            // ___ write JSON Data to file ___
            // FileWriter myFile = new FileWriter("JSON/TBA/TBAData.json");
            // myFile.write(response.body());
            // myFile.close();
        }
        catch(Exception e) {
            System.err.println("Unable to get TBA data; error = ");
            e.printStackTrace();
            return null;
        }
    }
    public void writeToFile(String data) {
        try {
            FileWriter myFile = new FileWriter("JSON/TBA/TBAData.json");
            myFile.write(data);
            myFile.close();
        }
        catch(Exception e) {
            System.err.println("Unable to write file; error = ");
            e.printStackTrace();
        }
    }
}
