package MainComputerCode;


import MainComputerCode.Database.Database;

public class Main {
    static Database database = new Database();
    public static void main(String[] args) {
        database.printjson();
    }
    

}
