package notinjection;

public class ConnectionService {
    private MongoDbConnection mongo;
    private MysqlConnection mysql;

    public ConnectionService(MongoDbConnection mongo) {
        this.mongo = mongo;
    }

    public ConnectionService(MysqlConnection mysql) {
        this.mysql = mysql;
    }

    public String getDataBaseName() {
        if(mongo == null) {
            return "null";
        }

        if(mysql == null){
            return "null";
        }

        return "Database name is: " + mongo.getName() + " and " + mysql.getName();
    }

}
