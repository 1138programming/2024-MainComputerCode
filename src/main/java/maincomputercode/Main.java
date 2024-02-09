package MainComputerCode;


import MainComputerCode.Database.Database;

import java.sql.SQLException;

import MainComputerCode.APIRequests.TBA;

public class Main {
    static Database database = new Database();
    static TBA TBARequest = new TBA();
    static MatchScheduler matchScheduler = new MatchScheduler();
    public static void main(String[] args) {
        // TBARequest.writeToFile(TBARequest.getRequest("team/frc359", null, null));
        // database.printJson();
        // database.viewTables();
        matchScheduler.proccsessData();
    }
    

}
