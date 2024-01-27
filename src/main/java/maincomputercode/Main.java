package MainComputerCode;


import MainComputerCode.Database.Database;
import MainComputerCode.APIRequests.TBA;

public class Main {
    static Database database = new Database();
    static TBA TBARequest = new TBA();
    public static void main(String[] args) {
        TBARequest.writeToFile(TBARequest.getRequest("team/frc359", null, null));
        database.printjson();
    }
    

}
