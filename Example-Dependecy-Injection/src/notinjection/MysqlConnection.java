package notinjection;

public class MysqlConnection {
    private String name;
    private String password;

    public MysqlConnection() {
    }

    public MysqlConnection(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}