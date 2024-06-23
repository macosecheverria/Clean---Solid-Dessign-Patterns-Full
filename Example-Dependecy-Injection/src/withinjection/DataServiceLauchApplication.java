package withinjection;

public class DataServiceLauchApplication {
    public static void main(String[] args) {
        

        var mongo = new MongoDataService("Mongo name");
        var mysql = new MySqlDataService("Mysql name");

        var conection = new ConectionDataService(mysql);
        System.out.println( conection.getDataBaseName()); 

    }
    
}
