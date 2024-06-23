package notinjection;

public class ConnectionLauchApplication {
    public static void main(String[] args) {
        
        var mongoDb = new MongoDbConnection("Mongo name", "12345");

        var connectionMongo = new ConnectionService(mongoDb);
        System.out.println(connectionMongo.getDataBaseName());

        var mysql = new MysqlConnection("Mysql name", "12345");

        var connectionMysql = new ConnectionService(mysql);

        System.out.println(connectionMysql.getDataBaseName());
    }
}
